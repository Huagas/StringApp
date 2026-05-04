package com.example.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {

  private final StringManipulator manipulator = new StringManipulator();

  @Test
  public void testReverse_ValidString() {
    assertEquals("cba", manipulator.reverse("abc"));
  }

  @Test
  public void testReverse_NullStringThrowsException() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      manipulator.reverse(null);
    });
    assertEquals("Input string cannot be null.", exception.getMessage());
  }

  @Test
  public void testIsPalindrome_True() {
    assertTrue(manipulator.isPalindrome("Racecar ")); // Test ignore case and space
  }

  @Test
  public void testIsPalindrome_False() {
    assertFalse(manipulator.isPalindrome("hello"));
  }

  @Test
  public void testIsPalindrome_NullOrEmpty() {
    assertFalse(manipulator.isPalindrome(null));
    assertFalse(manipulator.isPalindrome("   "));
  }
}