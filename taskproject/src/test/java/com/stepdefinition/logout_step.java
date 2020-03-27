package com.stepdefinition;

import com.pages.logout;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class logout_step {
	logout enter=new logout();
	@Given("^Open the Browser$")
	public void open_the_Browser() throws Throwable {
	  enter.abcd("chrome");
	}

	@Then("^click on administration$")
	public void click_on_administration() throws Throwable {
		 enter.administration();
	}

	@Then("^click on logout$")
	public void click_on_logout() throws Throwable {
		  enter.Logout();
	}
}
