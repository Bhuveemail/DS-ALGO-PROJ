@linkedListPage @jenkins
Feature: Verify the linkedList functionalities

 @linkedList_page_Introduction
  	Scenario Outline: Verify Introduction of linkedList Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on linkedList

    Then I click on Introduction
    Then I verify the linkedList Try here functionalities with input "<positive_input>"
    Then I verify the valid result for linkedList positive scenario for "Implementation using linkedList"
    Then I click on Introduction
    Then I verify the linkedList Try here functionalities with input "<negative_input>"
    Then I validate the linkedList pop up and error message "<errorMessage>" for negative scenario for "Implementation using linkedList"
      Examples:
    |positive_input|negative_input|errorMessage|
    |print"""hello""";|print123"""hello""";|SyntaxError: bad input on line 1|

    @linkedList_page_Creating_Linked_List
  	Scenario Outline: Verify Creating Linked List Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on linkedList
    
    Then I click on Creating Linked List
    Then I verify the linkedList Try here functionalities with input "<positive_input>"
    Then I verify the valid result for linkedList positive scenario for "Implementation using collection"
    Then  I click on Creating Linked List
    Then I verify the linkedList Try here functionalities with input "<negative_input>"
    Then I validate the linkedList pop up and error message "<errorMessage>" for negative scenario for "Implementation using collection"

    
    Examples:
    |positive_input|negative_input|errorMessage|
    |print"""hello""";|print123"""hello""";|SyntaxError: bad input on line 1|
    
     @linkedList_page_Types_of_LinkedList
  	Scenario Outline: Verify Implementation of linkedList in Python Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on linkedList
    
   Then I click on Types Of Linked List
    Then I verify the linkedList Try here functionalities with input "<positive_input>" 
    Then I verify the valid result for linkedList positive scenario for "Implementation using array"
    Then I click on Types Of Linked List
    Then I verify the linkedList Try here functionalities with input "<negative_input>"
    Then I validate the linkedList pop up and error message "<errorMessage>" for negative scenario for "Implementation using array"
    Examples:
    |positive_input|negative_input|errorMessage|
    |print"""hello""";|print123"""hello""";|SyntaxError: bad input on line 1|
    
     @linkedList_page_LinkedList_Python
  	Scenario Outline: Verify Implementation of linkedList in Python Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on linkedList
    
    Then I click on Implement Linked List In Python
    Then I verify the linkedList Try here functionalities with input "<positive_input>"
    Then I verify the valid result for linkedList positive scenario for "Implementation using linkedList operations"
    Then I click on Implement Linked List In Python
    Then I verify the linkedList Try here functionalities with input "<negative_input>" 
    Then I validate the linkedList pop up and error message "<errorMessage>" for negative scenario for "Implementation using linkedList operations"

    Examples:
    |positive_input|negative_input|errorMessage|
    |print"""hello""";|print123"""hello""";|SyntaxError: bad input on line 1|
    
    
     @linkedList_page_traversal
  	Scenario Outline: Verify Traversal Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on linkedList
   
    Then I click on Traversal
    Then I verify the linkedList Try here functionalities with input "<positive_input>"
    Then I verify the valid result for linkedList positive scenario for "Implementation using linkedList operations"
    Then I click on Traversal
    Then I verify the linkedList Try here functionalities with input "<negative_input>" 
    Then I validate the linkedList pop up and error message "<errorMessage>" for negative scenario for "Implementation using linkedList operations"
    Examples:
    |positive_input|negative_input|errorMessage|
    |print"""hello""";|print123"""hello""";|SyntaxError: bad input on line 1|
    
    
     @linkedList_page_insertion
  	Scenario Outline: Verify Insertion Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on linkedList
   
    Then I click on Insertion
    Then I verify the linkedList Try here functionalities with input "<positive_input>"
    Then I verify the valid result for linkedList positive scenario for "Implementation using linkedList operations"
    Then I click on Insertion
    Then I verify the linkedList Try here functionalities with input "<negative_input>" 
    Then I validate the linkedList pop up and error message "<errorMessage>" for negative scenario for "Implementation using linkedList operations"
    
    Examples:
    |positive_input|negative_input|errorMessage|
    |print"""hello""";|print123"""hello""";|SyntaxError: bad input on line 1|
    
     @linkedList_page_deletion
  	Scenario Outline: Verify Deletion Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on linkedList
    
   
     Then I click on Deletion
    Then I verify the linkedList Try here functionalities with input "<positive_input>"
    Then I verify the valid result for linkedList positive scenario for "Implementation using linkedList operations"
    Then I click on Deletion
    Then I verify the linkedList Try here functionalities with input "<negative_input>" 
    Then I validate the linkedList pop up and error message "<errorMessage>" for negative scenario for "Implementation using linkedList operations"
      Examples:
    |positive_input|negative_input|errorMessage|
    |print"""hello""";|print123"""hello""";|SyntaxError: bad input on line 1|
    
     @linkedList_page_practice_question
  	Scenario Outline: Verify Practice Questions of linkedList Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on linkedList
     Then I click on Deletion
   
    Then I click on Practice Questions of LinkedList
    Then I verify the blank page for "Practice Questions"
    Examples:
    |positive_input|negative_input|errorMessage|
    |print"""hello""";|print123"""hello""";|SyntaxError: bad input on line 1|