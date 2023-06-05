package lab8.example2;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


//Variant 23 == 3


public class Task2 {
    public static void main(String[] args) {
        JSONObject task_tracker = new JSONObject();
        JSONArray tasks = new JSONArray();

        JSONObject task1 = new JSONObject();
        task1.put("name", "Complete project report");
        task1.put("deadline", "2077-06-15");
        task1.put("priority", "very high");

        JSONObject task2 = new JSONObject();
        task2.put("name", "Prepare presentation");
        task2.put("deadline", "2123-08-25");
        task2.put("priority", "low");

        tasks.add(task1);
        tasks.add(task2);

        task_tracker.put("books", tasks);

        try (FileWriter file = new FileWriter("src/lab8/example2/task2.json")) {
            file.write(task_tracker.toJSONString());
            System.out.println("Json файл успешно создал!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}