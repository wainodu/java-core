package lab8.example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class LinkParserSaver {
    public static void writeLinksToFile(String url, String fileName) {
        try {
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");
            FileWriter writer = new FileWriter(fileName);
            for (Element link : links) {
                writer.write(link.attr("abs:href") + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LinkParserSaver.writeLinksToFile("https://itlearn.ru/first-steps", "src/lab8/example3/links.txt");
    }
}
