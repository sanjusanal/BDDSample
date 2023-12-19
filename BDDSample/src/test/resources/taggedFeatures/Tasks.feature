@PhaseTwo
Feature: Tasks CRUD Mnagement
Background: valid login
Given User is logged in

@SmokeTest
Scenario: Create a new Tasks
When User create a new Tasks

Scenario: View a Tasks
When User view Tasks details

@RegressionTest
Scenario: Delete a Tasks
When User delete a Tasks

