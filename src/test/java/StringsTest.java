import org.testng.annotations.Test;

public class StringsTest {

    @Test
    public void String1(){

        String s = "Hello World!";
        System.out.println(s.equals("Hello World!"));
        System.out.println(s.equals("Hi!"));

        String s2 = "hello";

        System.out.println(s.equals(s2));

        s = "text";
        s2 = "TEXT";
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));

        s = "TeXt";
        System.out.println();
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println();
        System.out.println();

        
    }
}
