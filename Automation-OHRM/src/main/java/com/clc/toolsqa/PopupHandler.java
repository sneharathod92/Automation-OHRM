package com.clc.toolsqa;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import com.clc.utility.BrowserConstants;
import com.clc.utility.BrowserStuff;

public class PopupHandler {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BrowserStuff.getBrowserInstance(BrowserConstants.BrowserTypes.Chrome);
		// driver.get("https://demoqa.com/tooltip-and-double-click/");
		driver.get("http://www.popuptest.com/popuptest12.html");
		// driver.get("https://www.naukri.com/");
		// TimeUnit.SECONDS.sleep(3);
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		itr.next();
		itr.next();
		itr.next();
		String window4th = itr.next();
		driver.switchTo().window(window4th);
		String str = driver.getTitle();
		System.out.println(str);
		driver.close();
		// driver.quit();

	}

}
