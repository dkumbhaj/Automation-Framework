Feature: Anagram check
  Scenario: Words are anagrams
    Given the words "listen" and "silent"
    When I check if they are anagrams
    Then the anagram should be true

  Scenario: Words are not anagrams
    Given the words "hello" and "world"
    When I check if they are anagrams
    Then the anagram should be false
