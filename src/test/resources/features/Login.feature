Feature: Login
  As a user , I wont to be able to log into Trycloud
  with in Credentials

  Scenario: Login as a User1
    Given user is on the landing page
    Then user enter username and password
    And user verifies that "Files"page subtitle is displayed

