Feature: LoginFeature
  This deals with the login of the app

  # First scenario
  Scenario Outline: Login with correct user and pass
    Given I navigate to the login page
    And I enter the "<username>" and "<password>"
    And I click login button
    Then I should see the userform button

    Examples:
      | username | password      |
      | admin    | adminpassword |
      | admin2   | adminpassword2|