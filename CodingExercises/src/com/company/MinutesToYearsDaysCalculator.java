package com.company;

public class MinutesToYearsDaysCalculator {

  /**
   * Given a set number of minutes prints to consoles the number of years and days
   * @param minutes int -- represents the number of minutes to be converted
   */
  public static void printYearsAndDays(long minutes) {
    if (minutes < 0) {
      System.out.println("Invalid Value");
    }
    else {
      long totalDays = minutes / (60 * 24);
      long years = totalDays / 365;
      long days = totalDays % 365;

      System.out.printf("%d min = %d y and %d d", minutes, years, days);
    }


  }


}
