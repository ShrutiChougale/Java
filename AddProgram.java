class Add {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(double a, double b) {
        return a + b;
    }
}

public class AddProgram {
    public static void main(String[] args) {
        Add obj = new Add();
        System.out.println(obj.sum(2, 3));
        System.out.println(obj.sum(2, 3, 4));
        System.out.println(obj.sum(2.5, 3.5));
    }
}
