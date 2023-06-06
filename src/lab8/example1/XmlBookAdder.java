package lab8.example1;

import java.io.File;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlBookAdder {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/lab8/example1/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите название книги: ");
            String title = scanner.nextLine();

            System.out.print("Введите автора книги: ");
            String author = scanner.nextLine();

            System.out.print("Введите год издания книги: ");
            String year = scanner.nextLine();

            Element root = doc.getDocumentElement();

            Element book = doc.createElement("book");

            Element titleElement = doc.createElement("title");
            titleElement.appendChild(doc.createTextNode(title));
            book.appendChild(titleElement);

            Element authorElement = doc.createElement("author");
            authorElement.appendChild(doc.createTextNode(author));
            book.appendChild(authorElement);

            Element yearElement = doc.createElement("year");
            yearElement.appendChild(doc.createTextNode(year));
            book.appendChild(yearElement);

            root.appendChild(book);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/lab8/example1/example2.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}