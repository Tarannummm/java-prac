import java.util.*;

abstract class shape {
    abstract void draw();
}

class Rectangle extends shape {
    void draw() {
        System.out.println("Drawing Rectangle....");
    }
}

class Circle extends shape {
    void draw() {
        System.out.println("Drawing Circle....");
    }
}

public class wildcard {
    public static void drawShape(List<? extends shape> l) {
        for (shape s : l) {
            s.draw();
        }
    }

    public static void main(String[] args) {
        List<Rectangle> list1 = new ArrayList<>();

        list1.add(new Rectangle());

        List<Circle> list2 = new ArrayList<>();

        list2.add(new Circle());

        drawShape(list1);
        drawShape(list2);
    }

}
