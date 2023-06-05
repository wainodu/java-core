package lab8.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;


//Variant 23 == 3


public class Task2 {
    public static void main(String[] args) {
        try {

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("task-tracker");
            doc.appendChild(rootElement);

            Element task1 = doc.createElement("task");
            rootElement.appendChild(task1);

            Element name1 = doc.createElement("name");
            name1.appendChild(doc.createTextNode("Complete project report"));
            task1.appendChild(name1);

            Element deadline1 = doc.createElement("deadline");
            deadline1.appendChild(doc.createTextNode("2077-06-15"));
            task1.appendChild(deadline1);

            Element priority1 = doc.createElement("priority");
            priority1.appendChild(doc.createTextNode("very high"));
            task1.appendChild(priority1);


            Element task2 = doc.createElement("task");
            rootElement.appendChild(task2);

            Element name2 = doc.createElement("name");
            name2.appendChild(doc.createTextNode("Prepare presentation"));
            task2.appendChild(name2);

            Element deadline2 = doc.createElement("deadline");
            deadline2.appendChild(doc.createTextNode("2123-08-25"));
            task2.appendChild(deadline2);

            Element priority2 = doc.createElement("priority");
            priority2.appendChild(doc.createTextNode("low"));
            task2.appendChild(priority2);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/lab8/example1/tasks.xml"));
            transformer.transform(source, result);

            System.out.println("XML file created successfully!");
        } catch (Exception pce) {
            pce.printStackTrace();
        }
    }
}