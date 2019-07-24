package com.clc.toolsqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/");
		 driver.findElement(By.xpath("//button[@id='btn2']")).click();
		 
		 Actions ac=new Actions(driver);
		 ac.moveToElement(driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/a"))).moveToElement(driver.findElement(By.xpath("//a[text()='Alerts']"))).click().build().perform();
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		 //This step will result in an alert on screen
		 TimeUnit.SECONDS.sleep(3);
		 driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();
		 
		 Alert confirmationAlert = driver.switchTo().alert();
		 String alertText = confirmationAlert.getText();
		 System.out.println(alertText);
		 TimeUnit.SECONDS.sleep(3);
//		 confirmationAlert.dismiss();
		 confirmationAlert.accept();

	}

}
