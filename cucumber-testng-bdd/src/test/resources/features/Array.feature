@arrayPage
Feature: Verify the array functionalities

  @array_verify_topic
  Scenario: Verify array Topics
    Given I login to ds-algo portal
    Then I verify the Array box displays
    When I click on get started on Array
    Then I verify the topic covered list Array
    Then I log out

  @Arrays_in_Python_pos
  Scenario: Verify Arrays in PythonFunctionalities for Positive Scenarios
    Given I login to ds-algo portal
    Then I verify the Array box displays
    When I click on get started on Array
    Then I click on Arrays in Python
    Then I verify the Try here functionalities with input "print"""hello""";"
    Then I verify the valid result for positive scenario
