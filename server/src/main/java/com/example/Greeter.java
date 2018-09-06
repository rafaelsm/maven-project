package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * My method.
   *
   * @param someone means someone
   *
   * @return someone name formatted
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}

