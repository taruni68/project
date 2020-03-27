package com.stepdefinition;

import com.pages.login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
public class login_step {
	login enter= new login();
	@Given("^launch the browser$")
	public void launch_the_browser() throws Throwable {
		enter.launch("chrome");
	}

	@When("^open TaskManager website$")
	public void open_TaskManager_website() throws Throwable {
		enter.open();
	}

	@Then("^enter Login and Password$")
	public void enter_Login_and_Password() throws Throwable {
		
	        enter.Username_Password();
	      
	}

	@Then("^click on Login button$")
	public void click_on_Login_button() throws Throwable {
		 enter.click();
	}
}
