package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        System.out.println("---- Tests: Speed Converter ----");
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);
        SpeedConverter.printConversion(10.5);

        System.out.println("\n---- Tests: MegaBytes Converter ----");
        int kb = 2500;
        MegaBytesConverter.printMegaBytesAndKiloBytes(kb);
        kb = -1024;
        MegaBytesConverter.printMegaBytesAndKiloBytes(kb);
        kb = 5000;
        MegaBytesConverter.printMegaBytesAndKiloBytes(kb);

        System.out.println("\n---- Tests: Barking Dog ----");
        boolean test1 = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(test1);
        boolean test2 = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(test2);
        boolean test3 = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(test3);
        boolean test4 = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(test4);

        System.out.println("\n---- Tests: LeapYear ----");
        System.out.println(LeapYear.isLeapYear(1700));
        System.out.println(LeapYear.isLeapYear(1800));
        System.out.println(LeapYear.isLeapYear(1900));
        System.out.println(LeapYear.isLeapYear(2100));
        System.out.println(LeapYear.isLeapYear(2200));
        System.out.println(LeapYear.isLeapYear(2300));
        System.out.println(LeapYear.isLeapYear(2500));
        System.out.println(LeapYear.isLeapYear(2600));

        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2000));
        System.out.println(LeapYear.isLeapYear(2400));

        System.out.println("\n---- Tests: Decimal Comparator ----");
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.174, 3.175));


    }
}
