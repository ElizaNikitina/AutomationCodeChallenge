package utils;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.PageInitializer;
import testbase.BaseClass;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

public class CommonMethods extends PageInitializer {

	/**
	 * Method creates WebDriverWait object
	 *
	 * @return WebDriverWait
	 */
	public static WebDriverWait getWait() {

		return new WebDriverWait(driver, 15);
	}

	/**
	 * Please provide all necessary methods here
	 */

	/**
	 * Methods for getting time stemp
	 * 
	 * @return
	 */
	public static String getTimeStamp() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		return sdf.format(d.getTime());
	}
	/**
	 * Method checks if radio/checkbox is enabled and clicks it
	 *
	 * @param radioOrcheckbox
	 * @param value
	 */
	public static void clickRadioOrCheckbox(List<WebElement> radioOrcheckbox, String value) {

		String actualValue;

		for (WebElement el : radioOrcheckbox) {
			actualValue = el.getAttribute("value").trim();
			if (el.isEnabled() && actualValue.equals(value)) {
				el.click();
				break;
			}
		}
	}
	/**
	 * Method that checks if text is there and then selects it
	 *
	 * @param element
	 * @param textToSelect
	 */
	public static void selectDdValue(WebElement element, String textToSelect) {

		try {
			Select select = new Select(element);

			List<WebElement> options = select.getOptions();

			for (WebElement el : options) {
				if (el.getText().equals(textToSelect)) {
					select.selectByVisibleText(textToSelect);
					break;
				}
			}

		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Methods for taking screenshot with time stemp in its' name
	 * 
	 * @param filename
	 * @return
	 */
	public static byte[] takeScreenshot(String filename) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);

		File file = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = Constants.SCREENSHOTS_FILEPATH + filename + getTimeStamp() + ".png";
		try {
			FileUtils.copyFile(file, new File(destinationFile));
		} catch (Exception ex) {
			System.out.println("Screenshot was NOT made!");
		}
		return picBytes;
	}



	/**
	 * Explicit wait for element clickability
	 * 
	 * @param element
	 * @return WebElement
	 */
	public static WebElement waitForClickability(WebElement element) {
		return getWait().until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * Explicit wait for element visibility
	 * 
	 * @param element
	 * @return WebElement
	 */
	public static WebElement waitForVisibility(WebElement element) {
		return getWait().until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Method clicks on element
	 * 
	 * @param element
	 */
	public static void click(WebElement element) {
		waitForClickability(element).click();
	}

	/**
	 * Method sends text to the text box
	 * 
	 * @param element
	 * @param text
	 */
	public static void sendText(WebElement element, String text) {
		waitForVisibility(element).clear();
		element.sendKeys(text);

	}

	/**
	 * This method creates an object of JavascriptExecutor interface
	 *
	 * @return
	 */
	public static JavascriptExecutor getJSObject() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
	}

	/**
	 * Method clicks on element using JavascriptExecutor
	 * 
	 * @param element
	 */
	public static void jsClick(WebElement element) {
		getJSObject().executeScript("arguments[0].click();", element);
	}

	/**
	 * Method validate expected value in the table
	 * @param element
	 * @param expected
	 */
	public static  void elementFromTable(List<WebElement> element, String expected){

		for (int i = 1; i < element.size(); i++) {

			String rowText=element.get(i-1).getText();//get text of each row excluding header.
			if(rowText.contains(expected)) {//validating expected Value
				System.out.println(expected + " added successful");
				break;
			}
		}
	}


	/**
	 * Method validate expected value is NOT in the table
	 * @param element
	 * @param expected
	 */
	public static  void elementIsNotInTheTable(List<WebElement> element, String expected){

		for (int i = 1; i < element.size(); i++) {

			String rowText=element.get(i-1).getText();//get text of each row excluding header.
			if(!rowText.contains(expected)) {//validating expected Value
				System.out.println("User "  + expected + " is not in the table");
				break;
			}
		}
	}

}
