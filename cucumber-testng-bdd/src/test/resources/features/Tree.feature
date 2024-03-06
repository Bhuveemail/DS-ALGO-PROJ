@Treepage @jenkins
Feature: Verify the tree functionalities

  @tree_page_Overview_of_Trees
  Scenario Outline: Verify Overview of Trees Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on Tree
    
    Then I click on Overview of Trees
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Overview of Trees"
    Then I click on Overview of Trees
    Then I verify the Tree Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Overview of Trees"
    
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |
    
  @tree_page_Terminologies
  Scenario Outline: Verify Terminologies Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on Tree
    
 		Then I click on Terminologies
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Terminologies"
    Then I click on Terminologies
    Then I verify the Tree Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Terminologies"
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |
    
  @tree_page_Types_of_Trees
  Scenario Outline: Verify Types of Trees Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on Tree
    
		Then I click on Types of Trees
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Types of Trees"
    Then I click on Types of Trees
    Then I verify the Tree Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Types of Trees"
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |
    
      @tree_page_Tree_Traversals
  Scenario Outline: Verify Tree Traversals Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on Tree
    
    Then I click on Tree Traversals
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Tree Traversals"
    Then I click on Tree Traversals
    Then I verify the Tree Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Tree Traversals"
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |
    
      @tree_page_Traversals_Illustration
  Scenario Outline: Verify Traversals Illustration Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on Tree
    
    Then I click on Traversals Illustration
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Traversals Illustration"
    Then I click on Traversals Illustration
    Then I verify the Tree Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Traversals Illustration"
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |
    
      @tree_page_Binary_Trees
  Scenario Outline: Verify Binary Trees Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on Tree
    
    Then I click on Binary Trees
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Binary Trees"
    Then I click on Binary Trees
    Then I verify the Tree Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Binary Trees"
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |
    
      @tree_page_Types_of_Binary_Trees
  Scenario Outline: Verify Types of Binary Trees Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on Tree
    
    Then I click on Types of Binary Trees
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Types of Binary Trees"
    Then I click on Types of Binary Trees
    Then I verify the Tree Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Types of Binary Trees"
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |
    
      @tree_page_Implementation_in_Python
  Scenario Outline: Verify Implementation in Python Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on Tree
    
    Then I click on Implementation in Python
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Implementation in Python"
    Then I click on Implementation in Python
    Then I verify the Tree Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Implementation in Python"
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |
    
      @tree_page_Binary_Tree_Traversals
  Scenario Outline: Verify Binary Tree Traversals Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on Tree
    
    Then I click on Binary Tree Traversals
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Binary Tree Traversals"
    Then I click on Binary Tree Traversals
    Then I verify the Tree Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Binary Tree Traversals"
    
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |
    
      @tree_page_Implementation_of_Binary_Trees
  Scenario Outline: Verify Implementation of Implementation of Binary Trees Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on Tree
    
    Then I click on Implementation of Binary Trees
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Implementation of Binary Trees"
    Then I click on Implementation of Binary Trees
    Then I verify the Tree Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Implementation of Binary Trees"
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |
    
      @tree_page_Applications_of_Binary_trees
  Scenario Outline: Verify Applications of Binary trees Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on Tree
    
    Then I click on Applications of Binary trees
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Applications of Binary trees"
    Then I click on Applications of Binary trees
    Then I verify the Tree Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Applications of Binary trees"
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |
    
      @tree_page_Binary_Search_Trees
  Scenario Outline: Verify  Binary Search Trees Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on Tree
    
    Then I click on Binary Search Trees
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Binary Search Trees"
    Then I click on Binary Search Trees
    Then I verify the Tree Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Binary Search Trees"
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |
    
      @tree_page_Implementation_Of_BST
  Scenario Outline: Verify Implementation of BST Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on Tree
    
    Then I click on Implementation Of BST
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Implementation Of BST"
    Then I click on Implementation Of BST
    Then I verify the Tree Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Implementation Of BST"
    
    
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |
