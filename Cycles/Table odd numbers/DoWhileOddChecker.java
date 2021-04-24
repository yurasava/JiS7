package tasks.cycles.oddchecker;

    /**
    https://moodle.jrr.by/practice/155
     */

public class DoWhileOddChecker {

    public static void main(String[] args) {

        int number = 0;
        do {
           if (number % 2 != 0)
            System.out.println(number);
            number++;
        }
        while (number <= 50); {
        }
    }
}
