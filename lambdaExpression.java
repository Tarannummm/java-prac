import java.util.ArrayList;
import java.util.List;

interface addable {
    // int operation(int a, int b);
    String operation(String name);

}

public class lambdaExpression {
    public static void main(String[] args) {
        // addable a1 = (a, b) -> {
        // return (a + b);
        // };
        // System.out.println("Addition is: " + a1.operation(10, 20));
        // addable a2 = (a, b) -> a * b;
        // System.out.println("Multiplication is: " + a2.operation(5, 4));
        addable a1 = (name) -> {
            return ("Hello " + name);
        };
        System.out.println(a1.operation("Robi"));

        List<String> li = new ArrayList<>();
        li.add("Mushfiq");
        li.add("Tamim");
        li.add("Marjana");
        li.add("Anika");
        li.add("Nusaiba");
        li.add("Sagor");
        li.forEach((n) -> {
            System.out.println(n);
        });
    }
}