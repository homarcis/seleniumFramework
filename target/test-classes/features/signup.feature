Feature: Client sing up

    Scenario: client sing up successfully
      Given Client wants to have an account
      When he send required information to get the account
      Then he should be told that the account was created
