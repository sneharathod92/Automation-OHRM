package com.clc.ohrm.pages;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.clc.utility.BrowserConstants;
import com.clc.utility.BrowserConstants.BrowserTypes;
import com.clc.utility.BrowserStuff;

public class AssignLeave {

	public static void nevigateToAssignLeave() {

		Actions action = new Actions(BrowserStuff.driver);
		action.moveToElement(BrowserStuff.driver.findElement(By.id("menu_leave_viewLeaveModule")))
				.moveToElement(BrowserStuff.driver.findElement(By.id("menu_leave_assignLeave"))).click().build()
				.perform();

		BrowserStuff.driver.findElement(By.id("assignleave_txtFromDate")).click();
		List<WebElement> calender = BrowserStuff.driver.findElement(By.id("ui-datepicker-div"))
				.findElement(By.className("ui-datepicker-header")).findElement(By.className("ui-datepicker-title"))
				.findElements(By.tagName("select"));

		Select monthselect = new Select(calender.get(0));
		monthselect.selectByVisibleText("Sep");

		calender = BrowserStuff.driver.findElement(By.id("ui-datepicker-div"))
				.findElement(By.className("ui-datepicker-header")).findElement(By.className("ui-datepicker-title"))
				.findElements(By.tagName("select"));

		Select yearselect = new Select(calender.get(1));
		yearselect.selectByVisibleText("1990");

		// System.out.println(calender.size());

		WebElement table = BrowserStuff.driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (WebElement row : rows) {
			List<WebElement> columns = row.findElements(By.tagName("td"));
			for (WebElement col : columns) {
				try{
				WebElement cell = col.findElement(By.tagName("a"));
				
					if (cell.getText().equals("20")) {
						cell.click();
						break;
					}
				}catch(Exception e){}
				
			}

		}
	}

	public static void main(String[] args) {

		WebDriver driver = BrowserStuff.getBrowserInstance(BrowserTypes.Chrome);
		driver.get(BrowserConstants.OHRM_URL);
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		lp.loginPage();
		nevigateToAssignLeave();
	}

}
