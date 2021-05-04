package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;

import java.util.List;
import java.util.Map;

public class User extends CommonMethods{

    @Given("user click on Add User button")
    public void user_click_on_add_user_button() {
        click(allElements.addUser);
        getWait();
        driver.switchTo().activeElement();
    }

    @When("user add {string}, {string}, {string},{string},{string},{string},{string},{string}")
    public void user_add(String firstName, String lastName, String userName, String password, String customer, String role, String email, String cellPhone) {


        sendText(allElements.firstName, firstName);
        getWait();
        sendText(allElements.lastName, lastName);
        sendText(allElements.username, userName);
        sendText(allElements.password, password);
        getWait();
        clickRadioOrCheckbox(allElements.customer, customer);
        getWait();
        selectDdValue(allElements.ddRole, role);
        getWait();
        sendText(allElements.email, email);
        getWait();
        sendText(allElements.mobilePhone, cellPhone);

    }

    @When("user clicks save button")
    public void user_clicks_save_button() {
        click(allElements.save);
        getWait();
    }

    @Then("verify {string} has been added")
    public void verify_eliza_has_been_added(String firstName) {

        elementFromTable(allElements.tableValue, firstName);

    }

    @Given("find User name {string} in data table and delete user")
    public void findUserNameInDataTableAndDeleteUser(String novakName){


        List<WebElement> rows = driver.findElements(By.xpath("//tr[@class='smart-table-data-row ng-scope']"));

        for (int i = 0; i < rows.size(); i++) {//loop over list  based on the size.
            String rowText=rows.get(i).getText();//get text of list
            if(rowText.contains(novakName)) {//search for novak
                //get the rows of first column in the table
                driver.findElements(By.xpath("//i[@class='icon icon-remove']")).get(i).click();
                getWait();
                driver.switchTo().activeElement();
                driver.findElement(By.xpath("//button[@class='btn ng-scope ng-binding btn-primary']")).click();
                break;
            }


        }


    }


    @Then("verify user {string} has been deleted")
    public void verify_user_has_been_deleted(String nameNovak) {

        elementIsNotInTheTable(allElements.tableValue, nameNovak);
        getWait();
    }


    @When("user enters employee data from {string} excel sheet")
    public void user_enters_employee_data_from_excel_sheet(String sheetName) {

        List<Map<String, String>> excelList = ExcelUtility.excelIntoListOfMaps(Constants.TESTDATA_FILEPATH, sheetName);
        for (Map<String, String> data : excelList) {
            String fName = data.get("First Name");
            String lName = data.get("Last Name");
            String uName = data.get("User Name");
            String psw = data.get("Password");
            String custom = data.get("Customer");
            String role = data.get("Role");
            String email = data.get("E-mail");
            String phone = data.get("Phone");

            sendText(allElements.firstName, fName);
            getWait();
            sendText(allElements.lastName, lName);
            sendText(allElements.username, uName);
            sendText(allElements.password, psw);
            getWait();
            clickRadioOrCheckbox(allElements.customer, custom);
            getWait();
            selectDdValue(allElements.ddRole, role);
            getWait();
            sendText(allElements.email, email);
            getWait();
            sendText(allElements.mobilePhone, phone);


            click(allElements.save);
            getWait();
        }

    }


}
