import org.testng.annotations.Test;

public class Variables {
    public int a = 2;
    public int b = 8;
    public int d = 8;
    public String hello= "Привет!";

    @Test
    public void calculate(){
        int c = a + b + d;
        System.out.println("result = " + c);
    }

    @Test
    public void calculate3(){
        int c = a + b + d;
        System.out.println("result = " + c);
    }
}
