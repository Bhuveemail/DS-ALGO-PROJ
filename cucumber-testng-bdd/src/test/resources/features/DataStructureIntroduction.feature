@datastructurePage @regression
Feature: Verify the Data Structure functionalities

  @datastructure_page_all
  Scenario Outline: Verify Operations in Graph  Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    When I click on get started on DataStructure
    
    Then I click on Time Complexity of DataStructure
    Then I verify the DataStructure Try here functionalities with input "<positive_input>"
    Then I verify the valid result for DataStructure positive scenario for "Time Complexity of DataStructure"
    Then I click on Time Complexity of DataStructure
    Then I verify the DataStructure Try here functionalities with input "<negative_input>"
    Then I validate the DataStructure pop up and error message "<errorMessage>" for negative scenario for "Time Complexity of DataStructure"
    
   	Then I click on Practice Questions of DataStructure
   	Then I verify the blank page for "Practice Questions"
 
   
     Examples: 
      | positive_input    | negative_input     | errorMessage                     |
      | print"""hello"""; | print-"""hello"""; | TypeError: bad operand type for unary -: 'str' on line 1 |
      | print"""hello"""; | prin123"""hello""":   | SyntaxError: bad input on line 1 |