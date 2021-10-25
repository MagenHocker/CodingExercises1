package com.company;

public class AreaCalculator {

  /**
   * Determines the area of a circle
   * @param radius a double that represents the radius of a circle
   * @return a double that is the area of a circle
   */
  public static double area(double radius) {
    return radius >= 0 ? Math.PI * Math.pow(radius, 2) : -1;
  }

  /**
   * determines the area of a rectangle
   * @param x the width of the rectangle
   * @param y the length of the rectangle
   * @return a double that represents the area of a rectangle
   */
  public static double area(double x, double y) {
    return (x >= 0 && y >= 0) ? x * y : -1;
  }

}
