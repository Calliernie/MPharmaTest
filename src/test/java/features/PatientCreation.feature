Feature: Patient Creation
  Scenario: Adding a patient's details to the database
    Given I type the patient's first name
    And I type the patient's middle name
    And I type the patient's last name
    And I type the patient's phone number
    And I type the patient's date of birth
    And I type the patient's address
    When I click on the add new user button
    Then I should see the added patient's full name
    And I should see the added patient's address
    And I should see the added patient's date of birth
