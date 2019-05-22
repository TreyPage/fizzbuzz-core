package edu.cnm.deepdive;

/**
 * Exercises the methods of the {@link FizzBuzz} class.
 *
 * @author Trey Page &amp; Deep Dive Coding Java+Android Cohort 7.
 * @version 1.0.0
 */
public class Main {

  private Main() {}

  /**
   * Method runs a loop 1&ndash;100 and prints a {@link String} based on the {@link FizzBuzz} class.
   * @param args Command line arguments (ignored).
   */
  public static void main(String[] args) {
    for(int i = 1; i <= 100; i++) {
      System.out.println(FizzBuzz.fizzBuzzValue(i));
    }
  }
}
