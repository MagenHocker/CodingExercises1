package com.company;

public class TeenNumberChecker {

  /**
   * Given three ages determines if at least one of the ages is within the range of [13-19]
   * @param age1 int that represents the age of a person
   * @param age2 " "
   * @param age3 " "
   * @return boolean true if at least one of the ages is teen range
   */
  public static boolean hasTeen(int age1, int age2, int age3) {

    return (isTeen(age1) || isTeen(age2) || isTeen(age3));

  }

  /**
   * Determines if an age is between the range of [13-19] inclusive
   * @param age an int representing the age of the person to be tested
   * @return a boolean that determines if a person is a teen
   */
  public static boolean isTeen(int age)
  {
    return (age <= 19 && age >= 13);
  }

}
