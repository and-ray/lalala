import org.testng.annotations.*;

public class Cycles {
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
    public void test6() {
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
