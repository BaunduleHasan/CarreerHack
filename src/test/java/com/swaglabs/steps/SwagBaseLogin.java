package com.swaglabs.steps;

import com.swaglabs.common.SwagLabHome;
import com.swaglabs.pages.SwagLabBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagBaseLogin extends SwagLabHome {

	SwagLabBase slb;

	@Given("I am on swaglabs homepage")
	public void i_am_on_swaglabs_homepage() {

		Launchbrowser();

	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String string, String string2) {
		slb = new SwagLabBase(driver);
		slb.UserID(string);
		slb.Password(string2);

	}

	@When("I click on login")
	public void i_click_on_login() {

		slb.LoginBtn();
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {

	}

	@When("I click on menu")
	public void i_click_on_menu() {

		slb.MenuBtn();

	}

	@When("I click on logout")
	public void i_click_on_logout() {

		slb.Logout();

	}

	@Then("I am logged out from swaglabs")
	public void i_am_logged_out_from_swaglabs() {

		CloseBrowser();

	}

}
