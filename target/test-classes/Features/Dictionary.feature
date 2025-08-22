Feature: Dictionary validation
  Scenario: Valid word check
    Given a word "apple"
    When I check the dictionary
    Then it should be a valid word

  Scenario: Invalid word check
    Given a word "asdkfjaskdf"
    When I check the dictionary
    Then it should not be a valid word
