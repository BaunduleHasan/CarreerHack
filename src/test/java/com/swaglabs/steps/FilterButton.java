package com.swaglabs.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.swaglabs.common.SwagLabHome;
import com.swaglabs.pages.SwagLabBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilterButton extends SwagLabHome {

	SwagLabBase slb;

	@Given("I am logged in on my swablabs account")
	public void i_am_logged_in_on_my_swablabs_account() {

		Launchbrowser();
		slb = new SwagLabBase(driver);
		slb.Login("standard_user", "secret_sauce");

	}

	@When("I click Click on filter button")
	public void i_click_click_on_filter_button() {

		Select select = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		select.selectByIndex(0);

	}

	@When("I click on name A to Z")
	public void i_click_on_name_a_to_z() {

	}

	@Then("All the products are sorted in assending order")
	public void all_the_products_are_sorted_in_assending_order() {

	}

	@When("I click on Name Z to A")
	public void i_click_on_name_z_to_a() {

		Select select1 = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		select1.selectByIndex(1);
	}

	@Then("All the products are in dessending order")
	public void all_the_products_are_in_dessending_order() {

	}

	@When("I click On Price\\(low to High")
	public void i_click_on_price_low_to_high() {
		Select select2 = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		select2.selectByIndex(2);
	}

	@Then("all the products sort out from low to high")
	public void all_the_products_sort_out_from_low_to_high() {

	}

	@When("I click on Price\\(High to Low)")
	public void i_click_on_price_high_to_low() {

		Select select3 = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		select3.selectByIndex(3);

	}

	@Then("all the products sort out by high to low")
	public void all_the_products_sort_out_by_high_to_low() {

		CloseBrowser();

	}

}
