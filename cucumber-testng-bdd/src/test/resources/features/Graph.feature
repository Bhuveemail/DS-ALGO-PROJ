@Graphpage @jenkin
Feature: Verify the graph functionalities

  @Graph_page1
  Scenario Outline: Verify Implementation of Graph in Python Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on Graph
    Then I click on Graph
    Then I verify the Graph Try here functionalities with input "<positive_input>"
    Then I verify the valid result for Graph positive scenario for "Graph"
    Then I click on Graphlink
    Then I verify the Graph Try here functionalities with input "<negative_input>"
    Then I validate the Graph pop up and error message "<errorMessage>" for negative scenario for "Graph"

    Examples: 
      | positive_input    | negative_input       | errorMessage                     |
      | print"""hello"""; | print123"""hello"""; | SyntaxError: bad input on line 1 |

  @Graph_page2
  Scenario Outline: Verify Implementation of Graph in Python Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on Graph
    Then I click on Graph Representations
    Then I verify the Graph Try here functionalities with input "<positive_input>"
    Then I verify the valid result for queue positive scenario for "Graph Representations"
    Then I click on Graph Representations
    Then I verify the Graph Try here functionalities with input "<negative_input>"
    Then I validate the queue pop up and error message "<errorMessage>" for negative scenario for "Graph Representations"

    Examples: 
      | positive_input    | negative_input       | errorMessage                     |
      | print"""hello"""; | print123"""hello"""; | SyntaxError: bad input on line 1 |

  @Graph_page3
  Scenario Outline: Verify Implementation of Graph in Python Functionalities for Positive and Negative Scenarios
    Given I Launch the Application
    When I login to ds-algo portal
    Then I click on get started on Graph
    Then I click on Graph
    Then I click on Practice Questions of Graph
    Then I verify the Graph blank page for "Practice Questions"

    Examples: 
      | positive_input    | negative_input       | errorMessage                     |
      | print"""hello"""; | print123"""hello"""; | SyntaxError: bad input on line 1 |
