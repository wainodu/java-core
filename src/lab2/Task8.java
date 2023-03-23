package lab2;

public class Task8 {
    public static void main(String[] args) {
        class Animal {
            String name;
            int age;
            String sound;
        }
        class Dog extends Animal {
            String breed;
            String FoodType;

            Dog(String name, int age, String sound, String breed, String FoodType) {
                this.name = name;
                this.age = age;
                this.sound = sound;
                this.breed = breed;
                this.FoodType = FoodType;
            }
        }
        class Bird extends Animal {
            String AbilityToFly;
            Double wingspan;

            Bird(String name, int age, String sound, Double wingspan) {
                this.name = name;
                this.age = age;
                this.sound = sound;
                this.wingspan = wingspan;
                this.AbilityToFly = "Yes";
            }
        }
        class Cat extends Animal {
            Double TailLength;

            Cat(String name, int age, String sound, Double TailLength) {
                this.name = name;
                this.age = age;
                this.sound = sound;
                this.TailLength = TailLength;
            }

        }
        Dog dog = new Dog("dog", 2, "bark", "Spaniel", "meat");
        Bird bird = new Bird("bird", 1, "chirp", 2.0);
        Cat cat = new Cat("cat", 3, "meow", 2.2);


        class Shape{
            void MethodForInheritanceTest(){
                System.out.println("test");
            }
        }
        class Square extends Shape {
            int side;

            Square(int side) {
                this.side = side;
            }

            public double GetPerimeter() {
                return side * 4;
            }

            public double GetArea() {
                return side * 4;
            }
        }
        class Circle extends Shape {
            int radius;

            Circle(int radius) {
                this.radius = radius;
            }

            public double GetPerimeter() {
                return 2 * radius * Math.PI;
            }

            public double GetArea() {
                return Math.PI * 2 * radius * radius;
            }
        }
        class Parallelogram extends Shape {
            int side1;
            int side2;
            int height;

            Parallelogram(int side1, int side2, int height) {
                this.side1 = side1;
                this.side2 = side2;
                this.height = height;
            }

            public double GetPerimeter() {
                return 2 * (side1 + side2);
            }

            public double GetArea() {
                return side1 * height;
            }
        }
        Square TestSquare= new Square(3);
        TestSquare.MethodForInheritanceTest();
        Circle TestCircle = new Circle(3);
        TestCircle.MethodForInheritanceTest();
        Parallelogram TestParallelogram = new Parallelogram(1, 2, 3);
        TestParallelogram.MethodForInheritanceTest();
    }
}
