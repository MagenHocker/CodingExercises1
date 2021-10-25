package com.company;

public class IntEqualityPrinter {

  /**
   * determine if 3 numbers are all equal, all different, or neither. Excludes negative values.
   * @param i int -- first number
   * @param j int -- second number
   * @param k int -- third number
   */
  public static void printEqual(int i, int j, int k) {
    if ( i < 0 || j < 0 || k < 0) {
      System.out.println("Invalid Value");
    }
    else {
      if ((i == j) && (i == k)) {
        System.out.println("All numbers are equal");
      }
      else if ((i != j) && (i !=k) && (j != k)) {
        System.out.println("All numbers are different");
      }
      else {
        System.out.println("Neither all are equal or different");
      }
    }
  }


}
