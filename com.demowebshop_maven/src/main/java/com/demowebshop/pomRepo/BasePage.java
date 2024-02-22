package com.demowebshop.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.genericLibrary.Glibrary;

public class BasePage extends Glibrary {
public BasePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
