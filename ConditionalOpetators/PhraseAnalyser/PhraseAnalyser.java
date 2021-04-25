package tasks.conditionaloperator;

import java.util.Scanner;

    /**
    https://moodle.jrr.by/practice/137
    */

public class PhraseAnalyser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        System.out.println(analyse(str));
    }

    public static String analyse(String text) {
        String [] words = text.split("\\W+");
        if (words[0].equalsIgnoreCase("make")
                && words[words.length-2].equalsIgnoreCase("great")
                && words[words.length-1].equalsIgnoreCase("again")){
            return "It stands no chance";
        } else if (words[0].equalsIgnoreCase("make")
                || (words[words.length-2].equalsIgnoreCase("great")
                && words[words.length-1].equalsIgnoreCase("again"))) {
            return "It could be worse";
        } else {
            return "It is fine, really";
        }
    }
}
