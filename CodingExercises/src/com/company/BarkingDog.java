package com.company;

public class BarkingDog {

  /**
   * A method that determines if the owner should wake up depending on if the dog is barking and
   * time of day
   * @param barking a boolean that represents if the dog is barking
   * @param hourOfDay an int that represents the time of day [0 - 23]
   * @return a boolean that represents if the owner should wake or not
   */
  public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
    if (hourOfDay < 0 || hourOfDay > 23) {
      return false;
    }

    return barking && (hourOfDay < 8 || hourOfDay > 22);

  }

}
