@Treepage @regression
Feature: Verify the tree functionalities

  @tree_page_all
  Scenario Outline: Verify Implementation of Queue in Python Functionalities for Positive and Negative Scenarios
    Given I login to ds-algo portal
    When I click on get started on Tree
    
    Then I click on Overview of Trees
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Overview of Trees"
    Then I click on Overview of Trees
    Then I verify the Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Overview of Trees"

 		Then I click on Terminologies
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Terminologies"
    Then I click on Terminologies
    Then I verify the Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Terminologies"

		Then I click on Types of Trees
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Types of Trees"
    Then I click on Types of Trees
    Then I verify the Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Types of Trees"
    
    Then I click on Tree Traversals
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Tree Traversals"
    Then I click on Tree Traversals
    Then I verify the Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Tree Traversals"
    
    Then I click on Traversals Illustration
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Traversals Illustration"
    Then I click on Traversals Illustration
    Then I verify the Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Traversals Illustration"
    
    Then I click on Binary Trees
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Binary Trees"
    Then I click on Binary Trees
    Then I verify the Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Binary Trees"
    
    Then I click on Types of Binary Trees
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Types of Binary Trees"
    Then I click on Types of Binary Trees
    Then I verify the Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Types of Binary Trees"
    
    Then I click on Implementation in Python
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Implementation in Python"
    Then I click on Implementation in Python
    Then I verify the Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Implementation in Python"
    
    Then I click on Binary Tree Traversals
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Binary Tree Traversals"
    Then I click on Binary Tree Traversals
    Then I verify the Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Binary Tree Traversals"
    
    Then I click on Implementation of Binary Trees
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Implementation of Binary Trees"
    Then I click on Implementation of Binary Trees
    Then I verify the Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Implementation of Binary Trees"
    
    Then I click on Applications of Binary trees
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Applications of Binary trees"
    Then I click on Applications of Binary trees
    Then I verify the Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Applications of Binary trees"
    
    Then I click on Binary Search Trees
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Binary Search Trees"
    Then I click on Binary Search Trees
    Then I verify the Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Binary Search Trees"
    
    Then I click on Implementation Of BST
    Then I verify the Tree Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Tree positive scenario for "Implementation Of BST"
    Then I click on Implementation Of BST
    Then I verify the Try here functionalities with input "<negative_input>"
    Then I validate the Tree pop up and error message "<errorMessage>" for negative scenario for "Implementation Of BST"
    
    
    Examples: 
      | positive_input    | negative_input        | errorMessage                     |
      | print"""hello"""; | print123"""hello""";  | SyntaxError: bad input on line 1 |
      | print"""hello"""; | printABCD"""hello"""; | SyntaxError: bad input on line 1 |
