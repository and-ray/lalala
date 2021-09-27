import org.testng.annotations.Test;

public class Variables {
    public int a = 2;
    public int b = 3;

    @Test
    public void calculate2(){
        int c = a + b;
        System.out.println("result = " + c);
    }

}
