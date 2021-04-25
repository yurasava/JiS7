package tasks.cycles.primenumbers;

/**
 * https://moodle.jrr.by/practice/157
 */

public class PrimeNumbers {

    public static void main(String[] args) {
        int diapason = 500;
        int[] result = sum(diapason);
        System.out.println("sum = " + result[0] + " count = " + result[1]);
    }

    public static boolean isSimple(int value) {
        boolean result = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static int[] sum(int diapason) {
        int count = 0;
        int simpleNumber = 0;
        for (int i = 2; isSimple(i) || i <= diapason; i++) {
            if (!isSimple(i) || i == 17 || i == 71)
                continue;
            if (count == 50)
                break;
            if (isSimple(i)) {
                count = count + 1;
                simpleNumber = simpleNumber + i;
            }
        }
        return new int[]{simpleNumber, count};
    }
}