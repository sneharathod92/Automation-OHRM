package com.clc.ohrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/");

		dr.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		dr.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		dr.findElement(By.xpath("//input[@id='btnLogin']s")).click();

	}

}
