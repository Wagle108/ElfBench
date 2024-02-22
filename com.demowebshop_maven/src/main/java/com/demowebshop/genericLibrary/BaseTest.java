package com.demowebshop.genericLibrary;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest extends Glibrary {
public WebDriver driver;
@BeforeSuite
public void reportConfig() {
	sparkreporter = new ExtentSparkReporter(Extent_Path+name());
    reports=new ExtentReports();
    reports.attachReporter(sparkreporter);
}
@BeforeMethod
public void browserSetUp(Method method) throws IOException {
	 testMethodName =method.getName();
	 test=reports.createTest(testMethodName);

		if(getPropertyValue("browser").equals("chrome")) {
		 driver = new ChromeDriver();
		}else if (getPropertyValue("browser").equals("firefox")) {
			driver=new FirefoxDriver();
			
		}
		driver.get(getPropertyValue("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		test.log(Status.INFO, "browser is launched and url is navigated");

	}

@AfterClass
public void browserSetDown() {
	driver.quit();
}
@AfterSuite
public void reportFlush() {
	reports.flush();
}


}
