package com.clc.ohrm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clc.utility.BrowserStuff;

public class Dashboard {

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement admin;

	@FindBy(id = "menu_admin_UserManagement")
	WebElement usermanagement;

	@FindBy(id = "menu_admin_viewSystemUsers")
	WebElement user;

	public static AdminPage navigateToAdminUsers() {
		Actions action = new Actions(BrowserStuff.driver);
		action.moveToElement(BrowserStuff.driver.findElement(By.id("menu_admin_viewAdminModule")))
				.moveToElement(BrowserStuff.driver.findElement(By.id("menu_admin_UserManagement")))
				.moveToElement(BrowserStuff.driver.findElement(By.id("menu_admin_viewSystemUsers"))).click().build()
				.perform();
		return PageFactory.initElements(BrowserStuff.driver, AdminPage.class);

	}

	public static void empRecord(String... empIds) {
		navigateToAdminUsers();
		WebElement resultTable = BrowserStuff.driver.findElement(By.id("resultTable"));
		WebElement table = resultTable.findElement(By.tagName("tbody"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for (WebElement row : rows) {
			List<WebElement> columns = row.findElements(By.tagName("td"));
			
			WebElement empColId = columns.get(1).findElement(By.tagName("a"));
			System.out.println(empColId.getText());
			try {
			for (String id : empIds) {
				
//					WebElement cell = col.findElement(By.tagName("a"));
//					System.out.println(cell.getText());
					if (id.equals(empColId.getText())) {
						columns.get(0).findElement(By.tagName("input")).click();
					}
			} 
			}catch (Exception e) {
			}
		}
	}

}
