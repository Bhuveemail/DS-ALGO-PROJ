@signinPage @jenkins
Feature:  Verify the signin functionalities

  @signin_page_positive
  Scenario: Verify the Positive flow of signin page
		Given I Launch the Application
		When I click on signin link
		Then I verify the user name password login button on signin page
		Then I verify the successful signin
		When I log out 
		Then I verify the successful log out message

	

	@signin_page_negative
  Scenario Outline: Verify the Negative flow of signin page
		Given I Launch the Application
    When I click on signin link
    Then I verify the error message for invalid UserName "<invalid_username>" and invalid Password "<invalid_password>"

    Examples:
    |invalid_username|invalid_password|
    |abc|123|