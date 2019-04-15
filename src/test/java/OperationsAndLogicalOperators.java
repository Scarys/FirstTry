import org.testng.annotations.Test;

public class OperationsAndLogicalOperators {
@Test

    public void operationsVariables() {

    int a;
    a=10;
    a=20;
    System.out.println(a);

    int b=a;
    System.out.println(b);

    int c , d;
    c=d=b;
    System.out.println(c + " " + d);

    a= 13;
    b=5;
    System.out.println(a+b);
    System.out.println(a/b);
    System.out.println(a-b);
    System.out.println(a*b);

    double e =15;
    double f =7;
    System.out.println();
    System.out.println(e/f);
    System.out.println(a % b);

    a=b+c*d;
    System.out.println(a);
    a=(b+c)*d;
    System.out.println(a);

    a=15;
    b=10;
    System.out.println();
    System.out.println(a>b);
    System.out.println(a<b);

    System.out.println(a-5 >= b);
    System.out.println(a-5 <= b);
    System.out.println(a == b); // равно
    System.out.println(a != b); // не равно

    System.out.println(a + 10 <= b + 15);
    System.out.println(!(a + 10 <= b + 15));
    System.out.println(!(false)); //операция отрицания (выводит противоположное значение)

    int i =0;
    i++; // i = i + 1;
    System.out.println(i);
    i--; // i = i - 1;
    System.out.println(i);

    i = 5;
    System.out.println(i++);
    System.out.println(i);

    i = 3;
    a = i++;
    System.out.println(a);

    i = 3;
    a = ++i;
    System.out.println(a);

    a = 10;
    b = 20;
    System.out.println(a > b || a < b); //или
    System.out.println(a > b || b > 30);
    System.out.println(a > b && a < b); // и это и это
    System.out.println(a > 9 && b == 20);

    System.out.println(!(a + 10 > 15 || b - 5 > 10 && a < b));

    a = 9;
    System.out.println(Math.sqrt(a)); //корень
    System.out.println(Math.pow(a, 3));

    a = 10;
    a = a +5;
    System.out.println();
    System.out.println(a);

    a = 10;
    a += 5; // a = a + 5;
    System.out.println(a);
    a -= 5; // a = a - 5;
    System.out.println(a);
    a *= 2; // a = a * 2;
    System.out.println(a);
    a /= 2; // a = a / 2;
    System.out.println(a);
    a %= 3; // a = a % 3;
    System.out.println(a);




    }
}
