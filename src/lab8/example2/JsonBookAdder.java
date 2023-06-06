package lab8.example2;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonBookAdder {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lab8/example2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;

            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите название книги: ");
            String title = scanner.nextLine();

            System.out.print("Введите автора книги: ");
            String author = scanner.nextLine();

            System.out.print("Введите год издания книги: ");
            String year = scanner.nextLine();
            JSONObject newBook = new JSONObject();
            newBook.put("title", title);
            newBook.put("author", author);
            newBook.put("year", year);
            jsonArray.add(newBook);
            JSONObject library = new JSONObject();
            library.put("books", jsonArray);

            try (FileWriter file = new FileWriter("src/lab8/example2/example2.json")) {
                file.write(library.toJSONString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
