class Box<T> {
    T value;

    void set(T item) {
        this.value = item;
    }

    T get() {
        return value;
    }
}

public class generic {
    // part 2

    public static <T> void print(T[] arr) { // if we want to bound it we can write <T extends Number>
        for (T item : arr) {
            System.out.println(item + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        // part 1
        Box<String> strBox = new Box<>();
        strBox.set("Mishti");

        System.out.println(strBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(1000);

        System.out.println(intBox.get());
        // part 2

        String[] names = { "Swadheen", "Fahmid", "Hemel" };
        Integer[] num = { 10, 20, 30 };

        print(names);
        print(num);

    }

}
