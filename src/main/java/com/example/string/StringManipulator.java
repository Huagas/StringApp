package com.example.string;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Utility class for performing various string manipulations.
 */
public class StringManipulator {

  private static final Logger logger = LoggerFactory.getLogger(StringManipulator.class);

  /**
   * Reverses the given input string.
   *
   * @param input the string to reverse
   * @return the reversed string
   * @throws IllegalArgumentException if the input is null
   */
  public String reverse(String input) {
    if (input == null) {
      logger.error("Attempted to reverse a null string.");
      throw new IllegalArgumentException("Input string cannot be null.");
    }

    logger.debug("Reversing string of length {}", input.length());
    StringBuilder reversed = new StringBuilder(input).reverse();
    return reversed.toString();
  }

  /**
   * Checks if the given string is a palindrome (reads the same forwards and backwards).
   * Ignores case and leading/trailing whitespace.
   *
   * @param input the string to check
   * @return true if it is a palindrome, false otherwise
   */
  public boolean isPalindrome(String input) {
    if (input == null || input.trim().isEmpty()) {
      logger.warn("Input is null or empty. Considered not a palindrome.");
      return false;
    }

    String cleanInput = input.trim().toLowerCase();
    String reversedInput = reverse(cleanInput);
    boolean result = cleanInput.equals(reversedInput);

    logger.info("Checked palindrome for [{}]: Result = {}", cleanInput, result);
    return result;
  }
}