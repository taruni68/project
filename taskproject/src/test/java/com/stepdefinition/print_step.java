package com.stepdefinition;

import com.pages.print;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class print_step {
	print enter=new print();
	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {
	   enter.abcd("chrome");
	}

	@Then("^Click on Employee$")
	public void click_on_Employee() throws Throwable {
	  enter.employees();
	}

	@Then("^Click on add new Employee$")
	public void click_on_add_new_Employee() throws Throwable {
	    enter.addnewemployee();
	}

	@Then("^Enter details of employee$")
	public void enter_details_of_employee() throws Throwable {
	  enter.details();
	}

	@Then("^click on Add Button$")
	public void click_on_Add_Button() throws Throwable {
	  enter.add();
	  enter.next();
	}

	@Then("^print the tasks$")
	public void print_the_tasks() throws Throwable {
		 enter.Print();
	}


}
