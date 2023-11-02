package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature",
glue = "com.adactin.stepdefinition",
//monochrome = true,
//dryRun = false,
plugin = {"html:Reports/Html_Report.html",
		"pretty",
		"json:Reports/Json_Report.json",
})	

public class RunnerClass {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinot\\vino\\AdactinCucumber\\webdriver\\chromedriver.exe");
	
	 driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	}
	@AfterClass
	public static void tearDown() {
		
		driver.close();

	}

	}
	


