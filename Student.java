class Student {
    int id;
    String name;

    // Parameterized constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Shruti");
        s1.display();
    }
}
