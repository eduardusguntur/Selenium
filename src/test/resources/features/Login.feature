@All
  Feature: Login

    @Test1
    Scenario: User want to login
      Given User is on login page
      When User fill Username and Password
      And User click login button
      Then User verify login result
