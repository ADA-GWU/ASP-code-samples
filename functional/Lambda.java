interface Adder {
    int apply(int x, int y);
}

public class Lambda {
    public static void main(String [] args) {
        Adder add = (x, y) -> x + y;
        System.out.println(add.apply(3, 4));
    }
}
