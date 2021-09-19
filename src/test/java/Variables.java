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

    @Test
    public void calculate() {
        System.out.println("Сложение целых чисел = " + (a + b));
        System.out.println("Сложение чисел long = " + (c + d));
        System.out.println("Сложение чисел double = " + (e + f));
        System.out.println("Сложение числа и строки = " + (c + str1));
        System.out.println("Сложение строк с пробелом = " + (String.join(" ",str1, str2)));

    }

}
