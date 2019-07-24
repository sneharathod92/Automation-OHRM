package com.clc.ohrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/");
		
		dr.findElement(By.xpath("/html/body/div/div/div/form/div[2]/input")).sendKeys("Admin");
		dr.findElement(By.xpath("/html/body/div/div/div/form/div[3]/input")).sendKeys("admin123");
		dr.findElement(By.xpath("/html/body/div/div/div/form/div[5]/input")).click();
		
	}
}
