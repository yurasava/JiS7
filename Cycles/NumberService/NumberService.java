package tasks.cycles.numberservice;

    /**
    * https://moodle.jrr.by/practice/139
    */

public class NumberService {

    public int rangeSum(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            result = result + i;
            if (i == finish) {
                for (int j = finish; j >= start; j--) {
                    result = result + j;
                }
            }
        }
        return result;
    }

    public int rangeEvenCount(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0)
                result = result + i;
            if (i == finish) {
                for (int j = finish; j >= start; j--) {
                    if (j % 2 == 0)
                        result = result + j;
                }
            }
        }
        return result;
    }
}
