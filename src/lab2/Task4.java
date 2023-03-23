package lab2;

public class Task4 {
    public static void main(String[] args) {
        class Person {
            String name;
            int age;
            String sex;
            Person(String name, int age, String sex){
                this.name = name;
                this.age = age;
                this.sex = sex;
            }
            String GetName() {
                return name;
            }

            int GetAge() {
                return age;
            }

            String GetSex() {
                return sex;
            }
        }
    }
}
