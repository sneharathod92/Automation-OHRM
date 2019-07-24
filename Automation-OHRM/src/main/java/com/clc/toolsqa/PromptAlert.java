package com.clc.toolsqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/");
		 driver.findElement(By.xpath("//button[@id='btn2']")).click();
		 
		 Actions ac=new Actions(driver);
		 ac.moveToElement(driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/a"))).moveToElement(driver.findElement(By.xpath("//a[text()='Alerts']"))).click().build().perform();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(By.xpath("//*[@id='Textbox']/button")).click();
		
		Alert promptAlrt=driver.switchTo().alert();
		promptAlrt.sendKeys("sneha");
		TimeUnit.SECONDS.sleep(1);
		promptAlrt.accept();
	}

}
