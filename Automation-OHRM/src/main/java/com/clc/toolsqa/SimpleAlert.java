package com.clc.toolsqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SimpleAlert {

	 public static void main(String[] args) throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://demo.automationtesting.in/");
	 driver.findElement(By.xpath("//button[@id='btn2']")).click();
	 
	 Actions ac=new Actions(driver);
	 ac.moveToElement(driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/a"))).moveToElement(driver.findElement(By.xpath("//a[text()='Alerts']"))).click().build().perform();
	 //This step will result in an alert on screen
	 TimeUnit.SECONDS.sleep(3);
	 driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	 
	 Alert simpleAlert = driver.switchTo().alert();
	 String alertText = simpleAlert.getText();
	 System.out.println(alertText);
	 TimeUnit.SECONDS.sleep(3);
	 simpleAlert.accept();
	 
	 //Once alert is present try to click on any button on the page
//	 driver.findElement(By.xpath("//*[@id='content']/p[16]/button")).click();
	 
	 }
}
