@fhcloginparameter @second
Feature: Login feature

      Scenario: TC01_user logins with valid credentials
        Given user is on the fhctriplogin page
        And user enters valid username "manager2"
        And user enters  valid password "Man1ager2!"
        And user clicks login button
        Then verify login is successfull