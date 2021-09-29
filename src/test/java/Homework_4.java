import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Homework_4 {

    public int r = 0;
    public int j = 0;


    @Test
    public void HW_4_1() {
        System.out.println("Homework 4.1");
        for (int i = 1; i <= 20; i++) {
            System.out.println("2*i = " + 2 * i);
            r = r + 2 * i;
        }
        System.out.println("Summ of multiplied numbers = " + r);
    }

    @Test
    public void HW_4_2() {
        System.out.println("Homework 4.2");
        for (int i = 35; i >= 4; i--) {
            if (i % 3 == 0) {
                System.out.println("Result of dividing by 3 = " + i / 3);
            } else {
                System.out.println("miss");
            }
        }
        System.out.println("Summ of multiplied numbers = " + r);

    }

    @Test
    public void HW_4_3() {
        System.out.println("Homework 4.3");
        for (int i = 1; i <= 69; i++) {
            r += i;
        }
        System.out.println("Summ = " + r);
        do {
            j++;
            System.out.println("Countdown started:" + j);
            r -= 500;
        } while (r >= 200);
        System.out.println("Countdown finished on " + r);
    }

    @Test
    public void HW_4_4_1() {

        String[] Words = new String[]{"огород 1", "вертолет 2", "вилка 3", "кастрюля 4", "космос 5", "щавель 6", "курс 7", "маршрут 8", "дракон 9", "лук 10"};
        for (String word : Words) {

            if ((word.contains("a") && word.contains("и")) || (word.contains("е") && word.contains("р"))) {
                System.out.println("крутое слово 2 " + word);
            } else if (word.contains("о") || word.contains("е")) {
                System.out.println("слово знакомо 1 " + word);
            } else {
                System.out.println("незнакомое 3 " + word);
            }
        }
    }


    @Test
    public void HW_4_4_2() {

        String[] Words = new String[]{"огород", "вертолет", "вилка", "кастрюля", "космос", "щавель", "курс", "маршрут", "дракон", "лук"};
        for (String word : Words) {
            switch (word) {
                case ("огород"):
                    System.out.println("слово знакомо");
                    break;
                case ("вертолет"):
                    System.out.println("крутое слово");
                    break;
                case ("вилка"):
                    System.out.println("незнакомое");
                    break;
                case ("кастрюля"):
                    System.out.println("незнакомое");
                    break;
                case ("космос"):
                    System.out.println("слово знакомо");
                    break;
                case ("щавель"):
                    System.out.println("слово знакомо");
                    break;
                case ("курс"):
                    System.out.println("незнакомое");
                    break;
                case ("маршрут"):
                    System.out.println("незнакомое");
                    break;
                case ("дракон"):
                    System.out.println("слово знакомо");
                    break;
                case ("лук"):
                    System.out.println("незнакомое");
                    break;
            }
        }
    }

    @Test
    public void HW_4_5() {

        j = 0;
        String[] Words = new String[]{"яблочко", "яблочный", "яблокоооо", "яблонский", "яблоква", "яблоковый", "яблоко"};
        for (String word : Words) {
            if (word == "яблоко") {
                j++;
            }
        }
        System.out.println("'Apple' has been found " + j + " time(s) in homework array");
    }

    @Test
    public void HW_4_6() {

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}