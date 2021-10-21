import org.testng.annotations.Test;

import java.util.Arrays;

public class Variables<string> {
    //    public long a = 2515125125512152512L;
//    public long b = 3141412412412412412L;
//    public double aDouble = 4.12;
//    public double bDouble = 346.12;
//
//    @Test
//    public void calculateLong() {
//       long c = 2515125125512152512L + 3141412412412412412L;
//        System.out.println("Результат сложения чисел long = " + c);
//    }
//    @Test
//    public void calculateDouble () {
//        double cDouble = 2.21 + 4.21;
//        System.out.println("Результат сложения чисел Double = " + cDouble);
//
//
//    }
//    @Test
//    public void CalculateString () {
//       String cString = "Мама мыла раму"+ "Даша мыла куклу";
//        System.out.println("Результат сложения чисел строк =" + cString);
//    }
//    @Test
//    public void CalculateStringWithNumber () {
//        String cString1 = "Мама мыла раму" + 42;
//        System.out.println("Результат сложения чисел строк и чисел = " + cString1);
//    }
//    @Test
//    public void Calculate () {
//        String a = "13";
//        String b = "12";
//        String result = a + b;
//        System.out.println(result);
//    }
    public int b = 0;
    public int a = 0;
    public int c = 0;
    public int d = 0;



    public int result = 0;
    public String[] word = {"желание", "ржавый", "семнадцать", "рассвет", "печь", "девять", "добросердечный", "возвращение", "родину","один"};
    public String[] word2 = {"яблочко", "яблочный", "яблокоооо", "яблонский", "яблоковый", "яблоко"};
    String strWord;
    String resultstr;
    String wordArray;

    //1е задание
    @Test
    public void ExFor(){

        for (int a = 0; a <= 20; a++) {
            int b = (a * 2);
            if(c < b){
                c = b;
                result = result + c;
                System.out.println("результат умножения "  + b);
                System.out.println("результат сложения" + result);
            }

        }
    }
//     2е задание
    @Test
    public void ExFor2(){
        for (a = 34; a >= 4; a--) {
            if (a % 3 == 0) {
                b = (a / 3);
                System.out.println("результат: " + b);
            }else {
                System.out.println("Мимо" + a);
            }
        }
    }

//     3е задание

    @Test
    public void Sum50() {
        int b = 0;
        for (int a = 0; a <= 50; a++) {
            b = (a + b);
            if (b == 1275) {
                System.out.println("Результат сложения 1-50: " + b);
                c = b;
                do {
                    System.out.println("Начат отсчет: " + d);
                    c = c - 500;
                    d++;
                }while (c > 200);{
                    System.out.println("Остчет завершен на: " + d + "Итерации, с значением: " + c); // Не совсем понял что конкретно выводить, поэтому вывел все
                }

            }

        }

    }



// 4е задание

@Test
public void SwitchCilcle(){
    for (int i = 0; i < word.length ; i++) {
        String strword = Arrays.toString(new String[]{word[i]});

        if ((strword.contains("о")) || (strword.contains("е"))){
            resultstr = "ConditionA";
        } else if (((strword.contains("а")) && (strword.contains("и"))) || ((strword.contains("е")) &&(strword.contains("р")))) {
            resultstr = "ConditionB";
        } else {
            resultstr = "ConditionC";
        }
        switch (resultstr) {
            case "ConditionA":
                System.out.println ("Слово знакомо");
                break;
            case "ConditionB":
                System.out.println("Крутое Слово");
                break;
            case "ConditionC":
                System.out.println("Незнакомое слово");
                break;
        }

        System.out.println(strword);

        }



    }
//  5е задание
    @Test
    public void testIterator() {
        int result = 0;

        for (String wordArray : word2) {

            if (wordArray.contains("яблоко")) {
                result++;

            }

        }
        System.out.println("Слово яблоко в массиве встречается " + result + " раз");

    }
//  6 Задание
    @Test
    public void fizzBuzz() {
        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz " + i); ;
            }else if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            }else if (i % 3 == 0){
                System.out.println("Fizz " + i);
            }
        }

    }
}


