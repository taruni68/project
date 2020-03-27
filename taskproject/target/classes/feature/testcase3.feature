Feature: taskmanager
@tc01_login
Scenario: Login to the TaskManager website

Given launch the browser
When open TaskManager website
Then enter Login and Password 
And  click on Login button

@tc02_employees
Scenario: Add new employee in TaskManager website

Given Launch the website in a browser
Then click on employee
Then click on add new employee

@tc03_list
Scenario: Add employee details in TaskManager website

Given open the browser
Then click on Employee
Then click on add new Employee
Then enter details of employee
And click on Add button
@tc04_print
Scenario:  Print task in the TaskManager website

Given Open the browser
Then Click on Employee
Then Click on add new Employee
Then Enter details of employee
And click on Add Button
And print the tasks

@tc05_logout
Scenario:  Print task in the TaskManager website

Given Open the Browser
Then click on administration
And click on logout
