package lab8.example2;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonBookRemover {
    public static void removeBookByTitle(String title) {
        try {
            FileReader reader = new FileReader("src/lab8/example2/example3.json");
            JSONParser jsonParser = new JSONParser();
            JSONObject library = (JSONObject) jsonParser.parse(reader);
            JSONArray books = (JSONArray) library.get("books");

            for (int i = 0; i < books.size(); i++) {
                JSONObject book = (JSONObject) books.get(i);
                if (book.get("title").equals(title)) {
                    books.remove(i);
                    System.out.println("Книга \"" + title + "\" успешно удалена из библиотеки.");
                    break;
                }
            }

            library.put("books", books);
            FileWriter file = new FileWriter("src/lab8/example2/example3.json");
            file.write(library.toJSONString());
            file.flush();
            file.close();
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

        try (FileWriter file = new FileWriter("src/lab8/example2/example3.json")) {
            file.write(library.toJSONString());
            System.out.println("Json файл успешно создал!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги, которую хотите удалить: ");
        String title = scanner.nextLine();

        JsonBookRemover.removeBookByTitle(title);
    }
}
