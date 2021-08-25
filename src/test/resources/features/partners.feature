Feature: SEARCH PARTNERS
  @partners
  Scenario: TC_02 PARTNERS  TEST
    Given go to faradaywebsite
    And  click partners button
    And click applynow button
    And enter applyname
    And  enter emailadress
    And select country
    And enter phone
    And enter company
    And enter title
    Then sendmessages