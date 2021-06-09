package com.launchers;

public class BrowserLaunch {

	public static void main(String[] args) 
	{
		System.setProperties("webdriver.chrome.driver", "C:\\Users\\KARTH\\OneDrive\\Desktop\\Selenium drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
	}

}
