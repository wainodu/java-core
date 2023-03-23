package lab2;

public class Task6 {
    public static void main(String[] args) {
        interface FiguresOperations {
            double GetPerimeter();

            double GetArea();
        }
        class Square implements FiguresOperations {
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
        class Circle implements FiguresOperations {
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
        class Parallelogram implements FiguresOperations {
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
    }
}
