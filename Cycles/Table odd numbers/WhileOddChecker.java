package tasks.cycles.oddchecker;

    /**
    https://moodle.jrr.by/practice/155
     */

public class WhileOddChecker {

    public static void main(String[] args) {
        int number = 1;
        while (number <= 50) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
