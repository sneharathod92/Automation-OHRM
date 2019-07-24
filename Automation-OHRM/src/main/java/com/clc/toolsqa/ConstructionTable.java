package com.clc.toolsqa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.clc.utility.BrowserConstants;
import com.clc.utility.BrowserStuff;

public class ConstructionTable {

	public static void main(String[] args) {

		WebDriver driver = BrowserStuff.getBrowserInstance(BrowserConstants.BrowserTypes.Chrome);
		driver.get(BrowserConstants.TOOLS_QA);

		WebElement table = BrowserStuff.driver.findElement(By.className("tsc_table_s13"));
		List<WebElement> rows = table.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		ConstructionInfo construction = null;
		List<ConstructionInfo> list = new ArrayList<ConstructionInfo>();
		for (WebElement row : rows) {
			WebElement header = row.findElement(By.tagName("th"));
			List<WebElement> columns = row.findElements(By.tagName("td"));
			construction = new ConstructionInfo();
			construction.setStructure(header.getText());
			construction.setCountry(columns.get(0).getText());
			construction.setCity(columns.get(1).getText());
			construction.setHeight(columns.get(2).getText());
			construction.setBuilt(Integer.parseInt(columns.get(3).getText()));
			construction.setRank(Integer.parseInt(columns.get(4).getText()));
			list.add(construction);
		}
		System.out.println("befor sorting"+list);
		Collections.sort(list);
		System.out.println("after sorting"+list);
	}

}

class ConstructionInfo implements Comparable<ConstructionInfo> {
	private String structure;
	private String country;
	private String city;
	private String height;
	private int built;
	private int rank;

	@Override
	public String toString() {
		return "ConstructionInfo [structure=" + structure + ", country=" + country + ", city=" + city + ", height="
				+ height + ", built=" + built + ", rank=" + rank + "]";
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public int getBuilt() {
		return built;
	}

	public void setBuilt(int built) {
		this.built = built;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public ConstructionInfo() {
		super();
	}

	public ConstructionInfo(String structure, String country, String city, String height, int built, int rank) {
		super();
		this.structure = structure;
		this.country = country;
		this.city = city;
		this.height = height;
		this.built = built;
		this.rank = rank;
	}

	public int compareTo(ConstructionInfo o) {
		return -(this.rank-o.rank);
		
		//return this.height.compareTo(o.getHeight());

	}
}