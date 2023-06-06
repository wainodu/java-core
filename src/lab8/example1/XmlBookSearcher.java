package lab8.example1;

import java.io.File;
import java.util.stream.IntStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.util.Scanner;

public class XmlBookSearcher {
    public static void searchByAuthor(String author) {
        try {
            File inputFile = new File("src/lab8/example1/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("book");
            System.out.println("Список книг автора " + author + ":");

            IntStream.range(0, nodeList.getLength())
                    .mapToObj(nodeList::item)
                    .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                    .map(node -> (Element) node)
                    .filter(element -> element
                            .getElementsByTagName("author")
                            .item(0)
                            .getTextContent()
                            .equals(author))
                    .forEach(element -> {
                        System.out.println("Название: " + element
                                .getElementsByTagName("title")
                                .item(0)
                                .getTextContent());
                        System.out.println("Автор: " + element
                                .getElementsByTagName("author")
                                .item(0)
                                .getTextContent());
                        System.out.println("Год издания: " + element
                                .getElementsByTagName("year")
                                .item(0)
                                .getTextContent());
                        System.out.println();
                    });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void searchByYear(String year) {
        try {
            File inputFile = new File("src/lab8/example1/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("book");
            System.out.println("Список книг, изданных в " + year + " году:");

            IntStream.range(0, nodeList.getLength())
                    .mapToObj(nodeList::item)
                    .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                    .map(node -> (Element) node)
                    .filter(element -> element.getElementsByTagName("year")
                            .item(0)
                            .getTextContent()
                            .equals(year))
                    .forEach(element -> {
                        System.out.println("Название: " + element
                                .getElementsByTagName("title")
                                .item(0)
                                .getTextContent());
                        System.out.println("Автор: " + element
                                .getElementsByTagName("author")
                                .item(0)
                                .getTextContent());
                        System.out.println("Год издания: " + element
                                .getElementsByTagName("year")
                                .item(0)
                                .getTextContent());
                        System.out.println();
                    });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите автора для поиска книг: ");
        String searchAuthor = scanner.nextLine();
        searchByAuthor(searchAuthor);

        System.out.println();
        System.out.print("Введите год издания для поиска книг: ");
        String searchYear = scanner.nextLine();
        searchByYear(searchYear);
    }
}
