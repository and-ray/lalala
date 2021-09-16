import org.testng.annotations.Test;

public class Variables {
    public int a = 2;
    public int b = 3;

    @Test
    public void calculate(){
        int c = a + b;
        System.out.println("result result  = " + c);
    }

}
