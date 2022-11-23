package com.swaglabs.steps;

import com.swaglabs.common.SwagLabHome;
import com.swaglabs.pages.SwagLabBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabLoginInvalid extends SwagLabHome {

	SwagLabBase slb;

	@Given("I am n Swaglab homepage")
	public void i_am_n_swaglab_homepage() {

		Launchbrowser();

	}

	@When("I enter invalid {string} and Valid {string}")
	public void i_enter_invalid_and_valid(String string, String string2) {

		slb = new SwagLabBase(driver);
		slb.UserID(string);
		slb.Password(string2);

		slb.LoginBtn();

	}

	@When("I enter valid {string} and invalid {string}")
	public void i_enter_valid_and_invalid(String string, String string2) {

		slb.UserID(string);
		slb.Password(string2);

	}

	@When("I enter invalid {string} and invalid {string}")
	public void i_enter_invalid_and_invalid(String string, String string2) {

		slb.UserID(string);
		slb.Password(string2);

		slb.LoginBtn();

	}

	@When("I click on Login")
	public void i_click_on_login() {

	}

	@Then("it shows error")
	public void it_shows_error() {
		
		driver.close();

	}

}
