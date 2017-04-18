/*
 * DaysOfMonth.java
 *  Print number of days in a given month and year.
 *
 * Compile it: % javac DaysOfMonth.java
 * and exec. : % java DaysOfMonth 2019 4
 *
 */
public class DaysOfMonth {
    public static void main(String[] args){
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        // Buggy output
        System.out.printf("Month of %d/%d has 30 days\n", month, year);
    }
}