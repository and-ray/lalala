import org.testng.annotations.Test;

public class MethodUsage {
    public int e = 20;
    public int b1 = 10;
    public int ddd = 80;


    @Test
    public void compare(){
        Variables.calculate(); //статический метод

        Variables objectVariables = new Variables(); //создание объекта objectVariables из класса Variables

        int sum = objectVariables.calculate2(e, b1, ddd); //используем метод объекта
        System.out.println("cумма е и b1 и ddd=" + sum);
    }
}
