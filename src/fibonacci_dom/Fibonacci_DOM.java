
package fibonacci_dom;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Fibonacci_DOM {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory fib= DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder fb = fib.newDocumentBuilder();
            Document doc = fb.newDocument();
                
            Element eRaiz = doc.createElement("Fibonacci_Numbers");
            doc.appendChild(eRaiz);
            
            Element eFib1 = doc.createElement("Fibonacci");
            eRaiz.appendChild(eFib1);
            eFib1.appendChild(doc.createTextNode("1"));
            
            Element eFib2 = doc.createElement("Fibonacci");
            eRaiz.appendChild(eFib2);
            eFib2.appendChild(doc.createTextNode("1"));
            
            Element eFib3 = doc.createElement("Fibonacci");
            eRaiz.appendChild(eFib3);
            eFib3.appendChild(doc.createTextNode("2"));
            
            Element eFib4 = doc.createElement("Fibonacci");
            eRaiz.appendChild(eFib4);
            eFib4.appendChild(doc.createTextNode("3"));
            
            Element eFib5 = doc.createElement("Fibonacci");
            eRaiz.appendChild(eFib5);
            eFib5.appendChild(doc.createTextNode("5"));
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\Users\\xabier.barreiroalber\\Documents\\Fibonacci.xml"));
            transformer.transform(source, result);
            transformer.setOutputProperty(OutputKeys.METHOD,"xml");
            transformer.setOutputProperty(OutputKeys.ENCODING,"UTF­8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent­amount", "4");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
}
