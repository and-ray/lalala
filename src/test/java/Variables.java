//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Variables {
    public static int a = 2;
    public static int b = 0;
    public static int d = 8;

//д.з. 4 - п.1 цикл for.
// создать автотест, который в цикле от 1 до 20 умножает каждое число на 2
// и выводит результат на экран.
// Также подчитывает из цикла и выводит сумму всех перемноженных чисел.

    @Test
    public void cycleFor1() {
        int a;
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            a = i * 2;
            sum = sum + a;
            // if (i == 20) { System.out.println("сумма = " + sum);} // второй вариант
            System.out.println("результат = " + a);
        }
        System.out.println("сумма = " + sum);
    }

// д.з. 4 - п.2 цикл for.
// в цикле чисел от 35 до 4 если число делится на 3 без остатка,
// выводит число и надпись о получившемся результате деления.
// Если не делится, выводить строку "мимо".

    @Test
    public void cycleFor2() {
        int d;
        for (int i = 35; i >= 4; i--) {
            if (i % 3 == 0) {
                d = i / 3;
                System.out.println("число: " + i + ". Результат деления: " + d);
            }
            //  if (i % 3 != 0) { - второй вариант
            else {
                System.out.println("число: " + i + ". Мимо");
            }
        }
    }


// д.з. 4 - п.3
// подсчитать сумму чисел от 1 до 50-70 (рандомно на ваш вкус).
// выводить результат суммы.
// Затем с помощью циклa do while выводить на экране фразу "начат отсчет:" и номер повторения,
// в каждом цикле уменьшая сумму на 500, пока она не станет меньше двухсот.
// По окончании цикла вывести фразу отсчет завершен на ... и добавить туда цифру на которой завершен отсчет.

    @Test
    public void cycleDoWhile() {

        int sum = 0;
        for (int i = 1; i <= 63; i++) {
            sum = sum + i;
            //System.out.println("результат = " + i);
        }
        System.out.println("Результат суммы сложения: " + sum);
        int nomer = 1;
        System.out.println("Начат отсчет: " + nomer);
        do {
            sum = sum - 500;
            nomer++;
        }
        while (sum >= 200);
        System.out.println("Отсчет завершен на: " + (nomer - 1));
    }


//д.з. 4 - п.4. цикл switch: проверка условий:
// если в массиве из слов (берете любые 10 произвольных существительных)
// в слове есть буква о или е, то выводим на экран "слово знакомо",
// если есть буквы "а" и  "и" или "е" и "р", то выводим на экран "крутое слово",
// если букв нет, то выводим "незнакомое".

    @Test
    public void cycleForIf() {
        boolean flag;
        String[] foreignLanguage = {"холодильник", "еда", "арбуз", "мясо", "суп", "торт", "апельсин", "мусс", "вкус", "мармелад"};
        for (String word : foreignLanguage) {

            flag = true;
            System.out.println(word);

            if (word.contains("о") || word.contains("е")) {
                System.out.println("слово знакомо");
                flag = false;
            }
            if (word.contains("а") && word.contains("и") || word.contains("е") && word.contains("р")) {
                System.out.println("крутое слово");
                flag = false;
            }

            if (flag) {
                System.out.println("незнакомое");
            }
        }
    }

    //д.з.4 п.4 от супруга)) используя switch
    @Test
    public void cycleForIf1() {
        int cond1;
        int cond2;
        String[] foreignLanguage = {"холодильник", "еда", "арбуз", "мясо", "суп", "торт", "апельсин", "мусс", "вкус", "мармелад"};
        for (String word : foreignLanguage) {
            cond1 = 0;
            cond2 = 0;
            System.out.println(word);
            if (word.contains("о") || word.contains("е")) {
                cond1 = 1;
            }
            if (word.contains("а") && word.contains("и") || word.contains("е") && word.contains("р")) {
                cond2 = 2;
            }
            switch (cond1 + cond2) {
                case 0:
                    System.out.println("незнакомое");
                    break;
                case 1:
                    System.out.println("слово знакомо");
                    break;
                case 2:
                    System.out.println("крутое слово");
                    break;
                case 3:
                    System.out.println("слово знакомо");
                    System.out.println("крутое слово");
                    break;
            }
        }
    }

//д.з. 4 - п.5 задача на итератор.
// найти в массиве строк, сколько раз встречается слово яблоко в составе.
// массив: яблочко, яблочный, яблокоооо, яблонский, яблоква, яблоковый, яблоко.

    @Test
    public void Iterator() {
        String[] words = {"яблочко", "яблочный", "яблокоооо", "яблонский", "яблоква", "яблоковый", "яблоко"};
        String wordToSearchFor = "яблоко";
        int count = 0;
        for (
                String word : words) {
            if (word.contains(wordToSearchFor))
                count++;
        }
        System.out.println("Слово 'яблоко' встречается в составе " + count + "-х" + " слов.");
    }

//д.з. 4 - п.6
// Напишите программу, которая выводит на экран числа от 1 до 100.
// При этом вместо чисел, кратных трем, программа должна выводить слово Fizz,
// а вместо чисел, кратных пяти — слово Buzz.
// Если число кратно пятнадцати, то программа должна выводить слово FizzBuzz.

    @Test
    public void cycleFor3() {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else {
                if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }

        }
    }








  /*  @Test
    public void cycleIf() {
        if (a + b > 5) {
            System.out.println("сумма а и б больше 5");
            if (a < 3) {
                System.out.println("а меньше трех, увеличьте");
            }
        } else {
            System.out.println("сумма а и б меньше 5");
        }
    }*/

  /*  @Test
    public void cycleFor() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            for (int j = 3; j > 1; j--) {
                if (j == 2) {
                    System.out.println("i + j = " + (i + j));
                }
            }
        }
    }*/


    /*@Test
    public void cycleForIf() {
        String[] foreignLanguage = {"мяу", "гафф", "чик", "чик-чирик", "мууууууфф", "шшшшшш" };
        for (String word : foreignLanguage) {
            if (word.contains("мяу") || word.contains("у")) { //знак или
                System.out.println("осторожно, тяпнет");
            }
            if (word.contains("чик") && word.contains("чирик")) { //знак и
                System.out.println("накормить");
            }
        }*/

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

        //System.out.println("фсе ");
    }

 @Test
    public void cycleWhile() {
        int i = 5;
        while (i < 10) {
            System.out.println("i маленькая и равна " + i);
            i++;
        }
*/


    /*  int i = 50;
      while (i < 50) {
          System.out.println(" i больше чем надо");
          i--;
      }


  }

  @Test
  public void cycleDoWhile() {
      int i = 50;
      do {
          System.out.println(" i больше чем надо");
          i--;
      } while (i > 40);
  }

*/
    /*@Test
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

*/
    public static void calculate() {
        int c = a + b + d;
        System.out.println("result = " + c);
    }

    public int calculate2(int e, int b1, int ddd) {
        int c = e + b1 + ddd;
        return c;

    }

}


