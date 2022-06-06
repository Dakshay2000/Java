import java.util.function.Function;

// class Pen {
//     String color;
//     String type;

//     public void write(){
//         System.out.println("Writing Something...");
//     }
    
//     public void printColor(){
//         System.out.println(this.color);
//     }
// }

// class Student {
//     String name;
//     int age;

//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
// }

class Shape {
    String color;
    public void area() {
        System.out.println(this.color);
    }
}

class Triangle extends Shape {

}

public class Basic_oops {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ball";

        // pen1.printColor();
        // pen2.printColor();

        // Student number1 = new Student();
        // number1.name = "Tarun";
        // number1.age = 21;

        // Student number2 = new Student();
        // number2.name = "Shubham";
        // number2.age = 22;

        // number1.printInfo();
        // number2.printInfo();

        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.area();
    }    
}
