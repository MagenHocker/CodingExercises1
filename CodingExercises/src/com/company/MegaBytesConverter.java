package com.company;

public class MegaBytesConverter {

  /**
   * converts kiloBytes to megaBytes and prints the result to the console
   * @param kiloBytes an int that represents the kb to be converted to mb
   */
  public static void printMegaBytesAndKiloBytes(int kiloBytes) {

    if (kiloBytes < 0) {
      System.out.println("Invalid Value");
    }
    else {
      int kiloToMega = kiloBytes / 1024;
      int remainder = kiloBytes % 1024;

      System.out.println(kiloBytes + " KB = " + kiloToMega + " MB and "
          + Math.round(remainder) + " KB");
    }

  }

}
