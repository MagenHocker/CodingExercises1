package com.company;

public class PlayingCat {

  /**
   * Determines if a cat is playing based on temperature and season
   * if [25-35] or summer and [25-45] then return true else false
   * @param summer bool -- is it currently summer
   * @param temperature -- the current temperature in Celsius
   * @return a bool representing if the cat is playing or not
   */
  public static boolean isCatPlaying(boolean summer, int temperature) {
    return temperature >= 25 && ((temperature <= 35) || (summer && temperature <= 45));
  }

}
