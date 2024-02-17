@queuePage @regression
Feature: Verify the queue functionalities

    @queue_page_all
  	Scenario Outline: Verify Implementation of Queue in Python Functionalities for Positive and Negative Scenarios
    Given I login to ds-algo portal
    When I click on get started on queue
    
    Then I click on Implementation of Queue in Python
    Then I verify the Try here functionalities with input "<positive_input>"
    Then I verify the valid result for queue positive scenario for "Implementation using Queue"
    Then I click on Implementation of Queue in Python
    Then I verify the Try here functionalities with input "<negative_input>"
    Then I validate the queue pop up and error message "<errorMessage>" for negative scenario for "Implementation using Queue"
  
    
    Then I click on Implementation using collections in Python
    Then I verify the Try here functionalities with input "<positive_input>"
    Then I verify the valid result for queue positive scenario for "Implementation using collection"
    Then I click on Implementation of Queue in Python
    Then I verify the Try here functionalities with input "<negative_input>"
    Then I validate the queue pop up and error message "<errorMessage>" for negative scenario for "Implementation using collection"

    
    Then I click on Implementation using array
    Then I verify the Try here functionalities with input "<positive_input>" 
    Then I verify the valid result for queue positive scenario for "Implementation using array"
    Then I click on Implementation using array
    Then I verify the Try here functionalities with input "<negative_input>"
    Then I validate the queue pop up and error message "<errorMessage>" for negative scenario for "Implementation using array"
   
    
    Then I click on Implementation queue operations
    Then I verify the Try here functionalities with input "<positive_input>"
    Then I verify the valid result for queue positive scenario for "Implementation using queue operations"
    Then I click on Implementation queue operations
    Then I verify the Try here functionalities with input "<negative_input>" 
    Then I validate the queue pop up and error message "<errorMessage>" for negative scenario for "Implementation using queue operations"

    
    Examples:
    |positive_input|negative_input|errorMessage|
    |print"""hello""";|print123"""hello""";|SyntaxError: bad input on line 1|
    |print"""hello""";|printABCD"""hello""";|SyntaxError: bad input on line 1|
