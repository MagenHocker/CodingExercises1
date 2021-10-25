package com.company;

public class SpeedConverter {

  /**
   * Converts Km to Miles
   * @param kilometersPerHour a double that represents a km distance
   * @return a long that represents the miles per hours rounded
   */
  public static long toMilesPerHour(double kilometersPerHour)
  {
    if (kilometersPerHour < 0) {
      return -1;
    }

    return Math.round(kilometersPerHour / 1.609);

  }

  /**
   * Given kilometers converts km to miles and prints to the console
   * @param kilometersPerHour a double that represents km
   */
  public static void printConversion(double kilometersPerHour)
  {
    if (kilometersPerHour < 0 ) {
      System.out.println("Invalid Input");
    }
    else {
      long milesPerHour = toMilesPerHour(kilometersPerHour);
      System.out.println(kilometersPerHour + " km/h = " + milesPerHour
          + " mi/h");
    }
  }

}
