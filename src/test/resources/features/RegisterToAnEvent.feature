@RegressionAndroid @EventTest1
Feature: Like a user registers to an event

 #Scenario 1
  Scenario Outline: The user registers and unregister to and event
    Given I login with my "<username>" and my "<password>"
    And I'm on my profile page
    When I click in Events tab
    And I click in More button on Other locations events
    And I click in "<event>"
    And I click in Register button
    And I confirm the action
    And I verify registration confirmed "<registeredMessage>"
    And I click in Got It button
    And I click on Registered button
    And I confirm the action
    And I verify unregistration confirmed "<unregisteredMessage>"
    And I click in Got It button
    Then I click on toolbar Back button
    And I click on toolbar Back button
    And I finally Logout of App


    Examples:

      | username    | password   | event     | registeredMessage            | unregisteredMessage             |
      | gvillafane  | Testing!1  | Halloween | Event registration confirmed | Event unregistration confirmed |