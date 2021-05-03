package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import testbase.BaseClass;

import java.util.List;

public class UserAllElements extends CommonMethods {

    @FindBy (xpath="//button[@class='btn btn-link pull-right']")
    public WebElement addUser;
    @FindBy (xpath="//input[@name='FirstName']")
    public WebElement firstName;
    @FindBy (xpath="//input[@name='LastName']")
    public WebElement lastName;
    @FindBy (xpath="//input[@name='UserName']")
    public WebElement username;
    @FindBy (xpath="//input[@name='Password']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='radio']")
    public List<WebElement> customer;

    @FindBy (xpath = "//select[@name='RoleId']")
    public WebElement ddRole;
    @FindBy (xpath = "//input[@name='Email']")
    public WebElement email;
    @FindBy (xpath = "//input[@name='Mobilephone']")
    public WebElement mobilePhone;
    @FindBy (xpath = "//button[@class='btn btn-success']")
    public WebElement save;

    @FindBy(xpath = "//tr[@class='smart-table-data-row ng-scope']")
    public List<WebElement> tableValue;
    @FindBy(xpath = "//td[@class='smart-table-data-cell']")
    public List<WebElement> tableCell;

    @FindBy(xpath = "//input[@class='pull-right ng-pristine ng-valid']")
    public WebElement searchField;

    @FindBy(xpath = "//i[@class='icon icon-remove']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//button[@class='btn ng-scope ng-binding btn-primary']")
    public WebElement confirmationBtn;
    

    public UserAllElements() {

        PageFactory.initElements(BaseClass.driver, this);
    }

}
