import org.testng.annotations.Test;

public class Variables {
    public int a = 2;
    public int b = 4;
    public int d = 12;

    @Test
    public void calculate(){
        int c = a + b + d;
        System.out.println("result = " + c);
    }

}
