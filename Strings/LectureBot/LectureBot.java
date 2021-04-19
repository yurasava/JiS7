package tasks.strings;

import java.util.concurrent.TimeUnit;

    /*
    https://moodle.jrr.by/practice/8763
    */

public class LectureBot {

    public static void main(String[] args) throws InterruptedException {

        String[] firstPartOfPhrase = {"Товарищи!", "С другой стороны", "Равным образом",
                "Не следует, однако, забывать, что", "Таким образом",
                "Повседневная практика показывает, что"};
        String[] secondPartOfPhrase = {"реализация намеченных плановых заданий",
                "рамки и место обучения кадров", "постоянный количественный рост и сфера нашей активности",
                "сложившаяся структура организации", "новая модель организационной деятельности",
                "дальнейшее развитие различный форм деятельности"};
        String[] thirdPartOfPhrase = {"играет важную роль в формировании", "требуют от нас анализа",
        "требуют определения и уточнения", "способствуют подготовке и реализации",
        "обеспечивает широкому кругу (специалистов) участие в формировании",
        "позволяет выполнить важные задания по разработке"};
        String[] fourthPartOfPhrase = {"существенных финансовых и административных условий.",
                "дальнейших направлений развития", "системы массового участия.",
                "позиций, занимаемых участниками в отношении поставленных задач.",
                "новых предложений.", "направлений прогрессивного развития."};

        int oneLength = firstPartOfPhrase.length;
        int twoLength = secondPartOfPhrase.length;
        int threeLength = thirdPartOfPhrase.length;
        int fourLength = fourthPartOfPhrase.length;

        int count = 0;
        while (count < 10000) {

            int rand1 = (int) (Math.random() * oneLength);
            int rand2 = (int) (Math.random() * twoLength);
            int rand3 = (int) (Math.random() * threeLength);
            int rand4 = (int) (Math.random() * fourLength);

            String phrase = firstPartOfPhrase[rand1] + " " + secondPartOfPhrase[rand2] + " " +
                    thirdPartOfPhrase[rand3] + " " + fourthPartOfPhrase[rand4];

            System.out.println(phrase);
            TimeUnit.SECONDS.sleep(5);
            count = count + 1;
        }
    }
}
