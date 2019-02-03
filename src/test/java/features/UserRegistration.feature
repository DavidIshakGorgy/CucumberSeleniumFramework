Feature: User Registration
  I want to check that the user can register in vezeeta

  Scenario: UserRegistrationByFillingMandatoryFieldsOnly
    Given the user in the home page
    When I click on signUp link
    And I entered user data
    And click join now
    Then The registration page displayed successfully
    Then User can log out and sign in again