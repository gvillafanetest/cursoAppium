@MyFirstCucumberFeature

Feature: Login with correct values
  #Scenario 1
  Scenario Outline: Login with User and Password
    Given I login with my "<username>" and my "<password>"
    And I'm on my profile page
    Then I see the complete name "<completeName>" in the profile screen
    And I see the email "<email>" in the profile screen
    And I see the skypeId "<skypeId>" in the profile screen
    And I see the location "<location>" in the profile screen
    When I finally Logout of App

    Examples:
      | username     | password    | completeName        | email                     | skypeId               | location |
      | gvillafane   | Testing!1   | Gabriel Villafañe   | gvillafane@belatrixsf.com | gabrielvillafane2010  | Mendoza  |