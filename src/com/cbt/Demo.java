package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", 
				"/Users/malvo/Documents/selenium dependencies/drivers/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://turkishcenterboston.org/");
		
	}

}
