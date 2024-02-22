package com.demowebshop.genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public void isSelect(WebElement dropdown,String option) {
		Select s=new Select(dropdown);
		try {
		int index = Integer.parseInt(option);
		List<WebElement> l = s.getOptions();
		if(index>=0 && index<l.size()) {
		
		s.selectByIndex(index);}
		else {
			System.out.println("index out of bound");
		}
		}catch(NumberFormatException e) {
		
		try {
			
			s.selectByValue(option);
		}catch(Exception e1) {
		s.selectByVisibleText(option);
		}
		}
	}
	public  void takescreenshot(WebDriver driver) {
		LocalDate date=LocalDate.now();
		String file = date.toString().replaceAll(":", "-");

	TakesScreenshot t =(TakesScreenshot) driver;
	File dest =new File("./screenshot/"+file+".png");
	File temp = t.getScreenshotAs(OutputType.FILE);
	try {
		org.openqa.selenium.io.FileHandler.copy(temp, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void elescreenshot(WebElement e) {
		File temp = e.getScreenshotAs(OutputType.FILE);
		File dest =new File("./screenshot/"+name()+".png");
		try {
			org.openqa.selenium.io.FileHandler.copy(temp, dest);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public String name() {
		LocalDateTime date= LocalDateTime.now();
		String file = date.toString().replaceAll(":", "-");
		return file;
	}
	public String getPropertyValue(String key) throws IOException {
		File f= new File("./src/test/resources/propertyfile");
		FileInputStream fis = new FileInputStream(f);
		Properties p= new Properties();
		p.load(fis);
		 return p.getProperty(key);
		
	}
}
