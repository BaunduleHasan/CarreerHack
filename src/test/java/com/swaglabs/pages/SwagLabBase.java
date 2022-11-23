package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SwagLabBase {

	WebDriver driver;

	public SwagLabBase(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "user-name")
	WebElement UserID;

	public void UserID(String string) {
		UserID.click();
		UserID.sendKeys(string);
	}

	@FindBy(id = "password")
	WebElement Password;

	public void Password(String string2) {

		Password.click();
		Password.sendKeys(string2);

	}

	@FindBy(xpath = "//input[@id='login-button']")
	WebElement LoginBtn;

	public void LoginBtn() {

		LoginBtn.click();
	}

	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	WebElement MenuBtn;

	public void MenuBtn() {

		MenuBtn.click();
	}

	@FindBy(id = "logout_sidebar_link")
	WebElement Logout;

	public void Logout() {

		Logout.click();
	}
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement select;
	
	public void selectList() {
		
		Select select = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		select.selectByIndex(0);
		select.selectByIndex(1);
		select.selectByIndex(2);
		select.selectByIndex(3);
	}
	
	public void Login (String string,String string2 ) {
		
		UserID.click();
		UserID.sendKeys(string);
		Password.click();
		Password.sendKeys(string2);
		LoginBtn.click();
		
		;
	}

}
