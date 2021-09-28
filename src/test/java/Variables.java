import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Variables {
    public int a = 2;
    public int b = 3;
    public long c = 23434;
    public long d = 743434;
    public double e = 2.23434;
    public double f = 3.743434;
    public String str1 = "Мама мыла раму";
    public String str2 = "Даша мыла куклу";

    //todo написать еще методы калькулятора

    @Test
    public void calculate() {
        System.out.println("Сложение целых чисел = " + (a + b));
        System.out.println("Сложение чисел long = " + (c + d));
        System.out.println("Сложение чисел double = " + (e + f));
        System.out.println("Сложение числа и строки = " + (c + str1));
        System.out.println("Сложение строк с пробелом = " + (String.join(" ", str1, str2)));

    }

    @BeforeMethod
    public void Attantion() {
        System.out.println("ОПАСНО!");
    }

    @AfterMethod
    public void attantionAfter() {
        System.out.println("А НЕ, НОРМ...");
    }

    @Test(groups = "test1")
    public void test1() {
        int sum = 0;
        for (int i = 1; i < 21; i++) {
            int j = i * 2;
            System.out.println("Умножение 2 на " + i + " = " + j);
            sum = sum + j;
        }
        System.out.println("Сумма " + sum);
    }

    @Test(groups = "test2")
    public void test2() {
        for (int i = 35; i > 3; i--) {
            if (i % 3 == 0) {
                System.out.println("Результат деления без остатка " + i + " на 3 = " + (i / 3));
            } else {
                System.out.println("Мимо: " + i + " не делится на 3 без остатка");
            }
        }
    }

    @Test(groups = "test3")
    public void test3() {
        int sum = 0;
        for (int i = 1; i < 51; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма чисел от 1 до 50 = " + sum);
        System.out.println("Начат отсчет:");
        int n = 1;
        do {
            sum = sum - 500;
            if (sum < 200) {
                System.out.println("Отсчет завершен на " + (sum + 500));
                break;
            }
            System.out.println("Разница " + n + " " + sum);
            n++;
        }
        while (sum > 199);
    }

    @Test(groups = "test4")
    public void test4() {
        String word[] = {"картошка", "йогурт", "карбюработ", "парик", "шар", "карбон", "контора", "танк", "банка", "турник"};
        for (String w : word) {
            if (w.toString().contains("о") || w.toString().contains("е")) {
                System.out.println("слово \"" + w + "\" знакомо: есть буквы о или е");
            } else if ((w.toString().contains("а") && w.toString().contains("и")) || (w.toString().contains("е") && w.toString().contains("р"))) {
                System.out.println("крут слово \"" + w + "\": есть буквы а и и или е и р");
            } else {
                System.out.println("Незнакомое слово \"" + w + "\": нет букв о или е, е и р, а и и");
            }
        }
    }

    @Test(groups = "test5")
    public void test5() {
        String apples[] = {"яблочко", "яблочный", "яблокооооо", "яблонский", "яблонский", "яблонский", "яблоква", "яблоковый", "яблоко"};
        int numApples = 0;
        for (String w : apples) {
            if (w.toString().contains("яблоко")) {
                numApples++;
            }
        }
        System.out.println("Всего яблок: " + numApples);
    }

    @Test(groups = "test6")
    public void test66() {
        for (int i = 1; i < 101; i++) {
            if (i % 15 == 0) {
                System.out.println(i + " = FizzBuzz");
            }
            if (i % 5 == 0) {
                System.out.println(i + " = Buzz");
            }
            if (i % 3 == 0) {
                System.out.println(i + " = Fizz");
            }
            if ((i % 15 != 0) && (i % 5 != 0) && (i % 3 != 0)) {
                System.out.println(i);
            }
        }
    }
}