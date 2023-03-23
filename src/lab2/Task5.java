package lab2;

public class Task5 {
    public static void main(String[] args) {
        class Rectangle {
            int length;
            int width;
            Rectangle(int length, int width){
                this.length = length;
                this.width = width;
            }
            int GetLength() {
                return length;
            }
            int GetWidth() {
                return width;
            }
            int GetPerimeter(){
                return length*2 + width*2;
            }
            int GetArea(){
                return length*width;
            }
        }
    }
}
