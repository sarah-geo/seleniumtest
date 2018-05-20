package com.expedia.Flightbooking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageClasses.HomePage;

public class ExpediaActionsTest  {
	
@Test
	public void testhomepage() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("https://www.expedia.co.in");
		HomePage insta = new HomePage(driver);
		insta.clickFlightTab();
		insta.inputOrigin();
		insta.inputDestination();
		insta.departingDate();
		insta.adults();
		insta.children();
		insta.clickSearch();
		insta.alertpopup();
}
	

}
