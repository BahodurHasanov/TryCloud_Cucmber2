   Feature: Login
    As a user , I wont to be able to log into TryCloud with in Credentials

     @Files
    Scenario: Login as a User1
    Given user is on the landing page
    Then user enter username and password
    And user verifies that "Files"page subtitle is displayed
    Then  as a user i can verify on different subtitles


   @Gallery
  Scenario: Login as a User2
    Given user is on the landing page
    Then user enter username and password
    And user verifies that "Gallery"page subtitle is displayed

   @Talk
    Scenario: Login as a User3
    Given user is on the landing page
    Then user enter username and password
    And user verifies that "Talk"page subtitle is displayed



   @calendar
    Scenario: Login as a User4
    Given user is on the landing page
    Then user enter username and password
    And user verifies that "Calendar"page subtitle is displayed

     @negative_Test
      Scenario: Verify that warning message is displayed when password is not correct
      Given  user is on the landing page
      Then enters "User1" username and "wrong" password
      And user verifies that "WRONG PASSWORD".massage is displayed






