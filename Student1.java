public class Student1 {
    int id;
    String name;

    // Parameterized constructor
    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "Shruti");
        s1.display();
    }
}
