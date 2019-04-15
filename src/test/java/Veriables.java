import org.testng.annotations.*;

public class Veriables {


    @Test
    public void integers(){

        byte a=5; // -128 127
        short b=-100; // -32768 32767
        int c;
        c = 1000000;
        long d;
        d = -1233423425;

        System.out.println(a);
        System.out.println("short b: " + b);
        System.out.println("int c: " + c);
        System.out.println("lond d: " + d);

        double double1 = 133.4444;
        System.out.println("double :" + double1);

        float float1 = 423.44f;
        System.out.println(float1);

        boolean boolean1 = true;
        boolean boolean2 = false;
        System.out.println(boolean1);
        System.out.println(boolean2);

        boolean boolean3 = 1 + 2 > 0;
        boolean boolean4 = 1 + 2 > 5;
        System.out.println(boolean3);
        System.out.println(boolean4);

        String str = "Hello";
        String str1 = "World!";
        String str2 = str + " " + str1;
        System.out.println(str2);

        char char1 = 'q';
        System.out.println(char1);

    }
}
