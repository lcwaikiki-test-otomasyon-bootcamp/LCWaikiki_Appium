Feature: Login

  Scenario: Successful Login
    When Tap skip
    Given Tap Profil
    Then Enter mail "kubilaycse@gmail.com"
    And Enter password ""
    And Tap login button