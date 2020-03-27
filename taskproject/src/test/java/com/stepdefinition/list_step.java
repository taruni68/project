package com.stepdefinition;

import com.pages.list;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class list_step {
	list enter=new list();
	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {
	   enter.abcd("chrome");
	}

	@Then("^click on Employee$")
	public void click_on_Employee() throws Throwable {
	  enter.employees();
	}

	@Then("^click on add new Employee$")
	public void click_on_add_new_Employee() throws Throwable {
	   enter.addnewemployee();
	}

	@Then("^enter details of employee$")
	public void enter_details_of_employee() throws Throwable {
		enter.details();
	}

	@Then("^click on Add button$")
	public void click_on_Add_button() throws Throwable {
		enter.add();
	}

}
