Feature: As a potential client i need to navigate in automation practice

  @Smoke @Flor
  Scenario: The client search by "Blouses"
    Given The client is in automation practice page
    When The client search for word blouses
    Then The client verify that results are shown properly


  @Smoke @Flor
  Scenario: the client navigates to the sign in page
    Given The client go to sign In page
    And  Set credencials the floana77@gmail.com and 1123456
    When Press button login
    Then the client verify that navigate to sign in page

  @Smoke @Flor
  Scenario: The client search by "Printed dresses"
    Given The client is in automation practice page
    When The client search for word Printed
    And The client order by lower first the results
    Then The client verify that results are sort properly


