package lab7.task8;

import java.io.*;

public class TestClass implements Serializable {
    private int number;
    private String string;

    public TestClass(int number, String string) {
        this.number = number;
        this.string = string;
    }

    public void printFields() {
        System.out.println("number: " + number + ", string: " + string);
    }

    public static void main(String[] args) {
        try {
            TestClass testClass = new TestClass(1, "string");
            FileOutputStream fileOut = new FileOutputStream("src/lab7/task8/fileOut.json");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(testClass);
            out.close();
            fileOut.close();
            FileInputStream fileIn = new FileInputStream("src/lab7/task8/fileOut.json");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            TestClass testClass1 = (TestClass) in.readObject();
            in.close();
            fileIn.close();
            testClass1.printFields();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}