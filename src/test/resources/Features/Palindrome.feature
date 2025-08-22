Feature: Palindrome check
  Scenario: Palindrome word
    Given the input word "madam"
    When I check if it is palindrome
    Then the palindrome should be true

  Scenario: Non-palindrome word
    Given the input word "hello"
    When I check if it is palindrome
    Then the palindrome should be false
