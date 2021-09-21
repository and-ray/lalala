import org.testng.annotations.Test;

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

    //@Test
//    public void calculate() {
//        System.out.println("Сложение целых чисел = " + (a + b));
//        System.out.println("Сложение чисел long = " + (c + d));
//        System.out.println("Сложение чисел double = " + (e + f));
//        System.out.println("Сложение числа и строки = " + (c + str1));
//        System.out.println("Сложение строк с пробелом = " + (String.join(" ", str1, str2)));
//
//    }

    //@Test
//    public void cycleIf() {
//        if (a + b > 5) {
//            System.out.println("сумма а и б больше 5");
//            if (a<3){
//                System.out.println("а меньше 3");
//            }
//        } else {
//            System.out.println("сумма а и б меньше 5");
//        }
//    }
    @Test
//    public void test1() {
//        int sum = 0;
//        for (int i = 1; i < 21; i++) {
//            int j = i * 2;
//            System.out.println("Умножение " + (j));
//            sum = sum + j;
//        }
//        System.out.println("Сумма " + sum);
//    }
//    public void test2() {
//        for (int i = 35; i > 3; i--) {
//            if (i % 3 == 0) {
//                System.out.println("Результат деления без остатка " + (i/3));
//            } else {
//                System.out.println("Мимо");
//            }
//        }
//    }

    public void test3() {
        int sum = 0;
        for (int i = 1; i < 51; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма чисел от 1 до 50 " + sum);
        System.out.println("Начат отсчет:");
        int n = 1;
do {
    sum = sum - 500;
    if (sum < 200){
        break;
    }
    System.out.println((sum));
    n++;
}
while (sum>199);
    }
}
