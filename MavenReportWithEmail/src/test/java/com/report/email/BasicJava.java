package com.report.email;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BasicJava {
	
	
	WebDriver driver;
	ExtentHtmlReporter extent;
	ExtentReports report;
	ExtentTest test;

	String actualTitle = "Google";
      @Test
	public void verifyGoogleTitle()
	{
		     extent = new ExtentHtmlReporter("extent.html");
		     report = new ExtentReports();
		     report.attachReporter(extent);
		     test = report.createTest("Verify Google Title");
		     test.log(Status.INFO, "Intialised chrome browser");
		     driver = new ChromeDriver();
		     test.log(Status.INFO, "Enter Url ");
		     driver.get("https://www.google.com/");
		     test.log(Status.INFO, "Captured Title ");
		  String Exceptedtitle=   driver.getTitle();
		  System.out.println(Exceptedtitle);
		  test.log(Status.INFO, "check Whether actual title match with Excepted Tiltle or not ");
		  Assert.assertEquals(actualTitle, Exceptedtitle);
		  test.log(Status.PASS, "Test Verified");
		  report.flush();
		  
		     
	}

}



