@queuePage @jenkins
Feature: Verify the queue functionalities

  @queue_page_Implementation_queue
  Scenario Outline: Verify Implementation of Queue in Python Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on queue
    Then I click on Implementation of Queue in Python
    Then I verify the Queue Try here functionalities with input "<positive_input>"
    Then I verify the valid result for queue positive scenario for "Implementation using Queue"
    Then I click on Implementation of Queue in Python
    Then I verify the Queue Try here functionalities with input "<negative_input>"
    Then I validate the queue pop up and error message "<errorMessage>" for negative scenario for "Implementation using Queue"
 		When I go back to the screen
    Then I log out 
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |

  @queue_page_Implementation_collection
  Scenario Outline: Verify Implementation using collections in Python Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on queue
    Then I click on Implementation using collections in Python
    Then I verify the Queue Try here functionalities with input "<positive_input>"
    Then I verify the valid result for queue positive scenario for "Implementation using collection"
    Then I click on Implementation of Queue in Python
    Then I verify the Queue Try here functionalities with input "<negative_input>"
    Then I validate the queue pop up and error message "<errorMessage>" for negative scenario for "Implementation using collection"
		When I go back to the screen
    Then I log out 
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |

  @queue_page_Implementation_Array
  Scenario Outline: Verify Implementation using array Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on queue
    Then I click on Implementation using array
    Then I verify the Queue Try here functionalities with input "<positive_input>"
    Then I verify the valid result for queue positive scenario for "Implementation using array"
    Then I click on Implementation using array
    Then I verify the Queue Try here functionalities with input "<negative_input>"
    Then I validate the queue pop up and error message "<errorMessage>" for negative scenario for "Implementation using array"
		When I go back to the screen
    Then I log out
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |

  @queue_page_Implementation_queue_operataion
  Scenario Outline: Verify Implementation Queue Operations Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on queue
    Then I click on Implementation queue operations
    Then I verify the Queue Try here functionalities with input "<positive_input>"
    Then I verify the valid result for queue positive scenario for "Implementation using queue operations"
    Then I click on Implementation queue operations
    Then I verify the Queue Try here functionalities with input "<negative_input>"
    Then I validate the queue pop up and error message "<errorMessage>" for negative scenario for "Implementation using queue operations"
		When I go back to the screen
    Then I log out
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |

  @queue_page_practice_questions
  Scenario Outline: Verify Practice Questions of Queue Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on queue
    Then I click on Implementation queue operations
    Then I click on Practice Questions of Queue
    Then I verify the Queue blank page for "Practice Questions"
		When I go back to the screen
    Then I log out
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |
