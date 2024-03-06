@registerPage @jenkins
Feature:  Verify the register functionalities

  @register_page_positive
  Scenario: Verify the Positive flow of register page

		Given I Launch the Application
    When I click on register link
    Then I verify the user name password confirm password register button and Login link on Register page
    Then I verify the successful Registration
    
    
 @register_page_negative
  Scenario Outline: Verify the Negative flow of register page

		Given I Launch the Application
    When I click on register link
    Then I verify the error message for invalid User Name "<invalid_username>" and Valid Password "<valid_password>" and Valid confirmation password "<valid_confirmationPassword>"
    Then I verify the error message for Valid User Name "<username>" and Invalid Password "<invalid_password>" and Valid confirmation password "<valid_confirmationPassword>"
    Then I verify the error message for Valid User Name "<username>" and Valid Password "<valid_password>" and Invalid confirmation password "<invalid_confirmationpassword>"
    Then I verify the error message for Invalid User Name "<invalid_username>" and Invalid Password "<invalid_password>" and Invalid confirmation password "<invalid_confirmationpassword>"
    
    
    Examples:
    |invalid_username|valid_password|valid_confirmationPassword|valid_username|invalid_password|invalid_confirmationpassword|
    |^^^^^^^^^^^^^|project4algo|project4algo|goninjas@dsalgo|12345678880|12345678880|
    |goninjas@dsalgo|project4algo|project4alg||||
    |qwertyuiop2@&*|789456123011|789456123011||||
