package com.company;

public class LeapYear {

  /**
   * Determines if a given year is a leap year
   * @param year an int that represents a given year
   * @return a bool that represents if the year was leap or not
   */
  public static boolean isLeapYear(int year) {
    if (year < 1 || year > 9999)
    {
      return false;
    }

    return (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
        || (year % 4 == 0 && year % 100 != 0);

  }

}
