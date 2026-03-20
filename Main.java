class Student {
    int id;
    String name;

    
    Student() {
        id = 0;
        name = "Not Assigned";
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
