package tasks.conditionaloperator;

import java.util.Scanner;

    /**
    https://moodle.jrr.by/practice/135
    */

public class SignComparator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(compare(number));
    }

    public static String compare(int number) {
        if (number < 0) {
            return "Number is negative";
        } else {
            if (number > 0) {
                return "Number is positive";
            } else {
                return "Number is equal to zero";
            }
        }
    }
}
