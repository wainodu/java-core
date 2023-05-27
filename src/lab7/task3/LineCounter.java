package lab7.task3;

import java.io.*;
public class LineCounter {
    public static void main(String[] args) {
        try {
            File file = new File("src/lab7/task3/file.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int counter = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                counter++;
            }
            System.out.println("Количество строк в файле: " + counter);
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
