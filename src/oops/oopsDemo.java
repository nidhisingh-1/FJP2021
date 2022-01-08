package oops;

public class oopsDemo {

    public static class Student{
        int age;
        String name;

        void announce(){
            System.out.println(this.name + " - " + this.age + " - Says hello!");
        }
    }

    public static void swap(Student s1, Student s2){ //nhi hoga swap coz memory address copy hi hue hain idhar function khatam hone ke baad hatt jaega
        Student temp = s1;
        s1 = s2;
        s2 = temp;

    }

    public static void swap2(Student s1, Student s2){ //swap hojaege
        int tage = s1.age;
        s1.age = s2.age;
        s2.age = tage;

        String tname = s1.name;
        s1.name = s2.name;
        s2.name = tname;
    }

    public static void swap3(Student s1, Student s2){

        int tage = s1.age;
        s1.age = s2.age;
        s2.age = tage;

        s1 = new Student();

        String tname = s1.name;
        s1.name = s2.name;
        s2.name = tname;

        s2 = new Student();
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.age= 10;
        s1.name = "A";

        Student s2 = new Student();
        s2.age= 20;
        s2.name= "B";

        s1.announce();
        s2.announce();

        swap3(s1,s2);

        s1.announce();
        s2.announce();
    }
}
