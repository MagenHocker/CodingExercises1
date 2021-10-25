package com.company;

public class DecimalComparator {

  /**
   * Determines if the tenths, hundreds, and thousands place are equal
   * @param d1 the first double to be compared
   * @param d2 the second double to be compared
   * @return a boolean that states if d1 and d2 were equal to the third place
   */
  public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {

    return (int) (d1 * 1000) == (int) (d2 * 1000);

  }

}
