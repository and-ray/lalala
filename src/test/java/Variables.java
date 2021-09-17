import org.testng.annotations.Test;

public class Variables {
    public String text1 = "Мама мыла раму";
    public String text2 = "Даша мыла куклу";

    @Test
    public void calculate() {
        String result = text1 + ". " + text2 + ".";
        System.out.println("Два предложения: " + result);
    }

}
