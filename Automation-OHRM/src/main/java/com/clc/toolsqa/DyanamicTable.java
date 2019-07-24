package com.clc.toolsqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.clc.utility.BrowserConstants;
import com.clc.utility.BrowserStuff;

public class DyanamicTable {

	public static void dynamicTable() {
		WebElement table = BrowserStuff.driver.findElement(By.className("tsc_table_s13"));
		 List<WebElement> headers=table.findElement(By.tagName("thead")).findElement(By.tagName("tr")).findElements(By.tagName("th"));
		 System.out.println("\n");
		 for(WebElement head:headers){
			System.out.print("\t"+head.getText());
			
		}
		 List<WebElement> rows=table.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		 System.out.println("\n");
		for(WebElement row:rows){
			System.out.println("\n");
			WebElement h1=row.findElement(By.tagName("th"));
			System.out.print("\t"+h1.getText());
			List<WebElement> columns=row.findElements(By.tagName("td"));
//			System.out.println("\n");
			for(WebElement coll:columns){
				System.out.print("\t"+coll.getText());
			}
		}

	}

	public static void main(String[] args) {
		WebDriver driver = BrowserStuff.getBrowserInstance(BrowserConstants.BrowserTypes.Chrome);
		driver.get(BrowserConstants.TOOLS_QA);
		dynamicTable();

	}

}
