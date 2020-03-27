package com.stepdefinition;

import com.pages.employees;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class employees_step {
	employees enter=new employees();
	@Given("^Launch the website in a browser$")
	public void launch_the_website_in_a_browser() throws Throwable {
	 enter.abcd("chrome");
	}

	@Then("^click on employee$")
	public void click_on_employee() throws Throwable {
		   enter.Employees();
	  	}

	@Then("^click on add new employee$")
	public void click_on_add_new_employee() throws Throwable {
		 enter.addnewemployee();
	}

}
