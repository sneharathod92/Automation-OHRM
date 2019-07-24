package com.clc.toolsqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.clc.utility.BrowserConstants;
import com.clc.utility.BrowserStuff;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = BrowserStuff.getBrowserInstance(BrowserConstants.BrowserTypes.Chrome);
		driver.get(BrowserConstants.TOOLS_QA_DATE_PICKER);

		driver.findElement(By.id("datepicker")).click();

		String expMonth = "September 2019";

		String currMonth = driver.findElement(By.className("ui-datepicker-title")).getText();

		if (expMonth.equals(currMonth)) {

			System.out.println("month is already selected");

		} else {
			for (int i = 1; i < 12; i++) {

				driver.findElement(By.id("ui-datepicker-div")).findElement(By.className("ui-datepicker-header"))
						.findElement(By.className("ui-datepicker-next")).click();

				Thread.sleep(1000);

				currMonth = driver.findElement(By.className("ui-datepicker-title")).getText();

				if (expMonth.equals(currMonth)) {
					System.out.println("month selected");
					break;
				}
			}
		}
		List<WebElement> cells = driver.findElement(By.className("ui-datepicker-calendar"))
				.findElement(By.tagName("tbody")).findElements(By.tagName("td"));

		for (WebElement dates : cells) {
			try {
				WebElement date = dates.findElement(By.tagName("a"));
				if (date.getText().equals("25")) {
					date.click();
					break;
				}
			} catch (Exception e) {
			}
		}
	}

}
