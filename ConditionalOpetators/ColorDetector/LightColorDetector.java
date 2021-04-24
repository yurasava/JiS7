package tasks.conditionaloperator;

import java.util.Scanner;

    /**
    https://moodle.jrr.by/practice/139
    */

public class LightColorDetector {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 380-ти до 750-ти");
        int s = scanner.nextInt();
        scanner.close();

        if(s > 380 && s < 449) {
            System.out.println("Violet");
        }
        else if(s > 450 && s < 494){
            System.out.println("Blue");
        }
        else if(s > 495 && s < 569){
            System.out.println("Green");
        }
        else if(s > 570 && s < 589) {
            System.out.println("Yellow");
        }
        else if(s > 590 && s < 619) {
            System.out.println("Orange");
        }
        else if(s > 620 && s < 750) {
            System.out.println("Red");
        }
        else {
            System.out.println("Invisible Light");
        }
    }
}
