import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Variables {
    public static int a = 2;
    public static int b = 0;
    public static int d = 8;

    @Test
    public void cycleIf() {
        if (a + b > 5) {
            System.out.println("сумма а и б больше 5");
            if (a < 3) {
                System.out.println("а меньше трех, увеличьте");
            }
        } else {
            System.out.println("сумма а и б меньше 5");
        }
    }

    @Test
    public void cycleFor() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            for (int j = 3; j > 1; j--) {
                if (j == 2) {
                    System.out.println("i + j = " + (i + j));
                }
            }
        }
    }


    @Test
    public void cycleForIf() {
        String[] foreignLanguage = {"мяу", "гафф", "чик", "чик-чирик", "мууууууфф", "шшшшшш" };
        for (String word : foreignLanguage) {
            if (word.contains("мяу") || word.contains("у")) { //знак или
                System.out.println("осторожно, тяпнет");
            }
            if (word.contains("чик") && word.contains("чирик")) { //знак и
                System.out.println("накормить");
            }
        }

     /*   for (String word : foreignLanguage) {
            if (word.contains("я") || word.contains("фф")) {
                System.out.println("осторожно, тяпнет");
            }
            if (word.contains("чирик") && word.contains("чик")) {
                System.out.println("накормить");
            }
            if (word.contains("шшш")) {
                System.out.println("беги!");
            }
        }
  */
        System.out.println("фсе ");
    }

    @Test
    public void cycleWhile() {
        int i = 5;
        while (i < 10) {
            System.out.println("i маленькая и равна " + i);
            i++;
        }









      /*  int i = 50;
        while (i < 50) {
            System.out.println(" i больше чем надо");
            i--;
        }

       */
    }

    @Test
    public void cycleDoWhile() {
        int i = 50;
        do {
            System.out.println(" i больше чем надо");
            i--;
        } while (i > 40);
    }


    @Test
    public void cycleSwitch() {
        String line = "робот";
        switch (line) {
            case ("Иван Иванович"):
                System.out.println("здрасьте, тырьщ начальник");
                break;
            case ("робот"):
                System.out.println("не звони, рекламная зараза");
                break;
        }
    }


    public static void calculate() {
        int c = a + b + d;
        System.out.println("result = " + c);
    }

    public int calculate2(int e, int b1, int ddd) {
        int c = e + b1 + ddd;
       return c;

    }

}
