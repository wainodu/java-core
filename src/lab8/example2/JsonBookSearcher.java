package lab8.example2;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonBookSearcher {
    public static void findBookByTitle(String title) {
        try {
            FileReader reader = new FileReader("src/lab8/example2/example-json.json");
            JSONParser jsonParser = new JSONParser();
            JSONObject library = (JSONObject) jsonParser.parse(reader);
            JSONArray books = (JSONArray) library.get("books");

            for (int i = 0; i < books.size(); i++) {
                JSONObject book = (JSONObject) books.get(i);
                if (book.get("title").equals(title)) {
                    System.out.println("Книга найдена:");
                    System.out.println("Название: " + book.get("title"));
                    System.out.println("Автор: " + book.get("author"));
                    System.out.println("Год издания: " + book.get("year"));
                    return;
                }
            }

            System.out.println("Книга с названием \"" + title + "\" не найдена.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("title", "Война и мир");
        book1.put("author", "Лев Толстой");
        book1.put("year", 1869);

        JSONObject book2 = new JSONObject();
        book2.put("title", "Мастер и Маргарита");
        book2.put("author", "Михаил Булгаков");
        book2.put("year", 1967);

        books.add(book1);
        books.add(book2);

        library.put("books", books);

        try (FileWriter file = new FileWriter("src/lab8/example2/example4.json")) {
            file.write(library.toJSONString());
            System.out.println("Json файл успешно создал!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги, которую хотите найти: ");
        String title = scanner.nextLine();

        JsonBookSearcher.findBookByTitle(title);
    }
}
