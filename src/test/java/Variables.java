import org.testng.annotations.Test;

public class Variables {
    public int a = 2;
    public int b = 3;
    public int d = 10;

    @Test
    public void calculate(){
        int c = a + b + d;
        System.out.println("result = " + c);
    }

}
