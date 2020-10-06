package lesson_13;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.IOException;

public class Validator {
    public static void main(String[] args) {
//if doesn't find filepath insert full filepath 
        File xmlFile = new File("\\src\\lesson_13\\devices.xml");
        File xsdSchema = new File("\\src\\lesson_13\\schema.xsd");

        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        SchemaFactory factory = SchemaFactory.newInstance(language);

        try {
            Schema schema = factory.newSchema(xsdSchema);
            SAXParserFactory spf = SAXParserFactory.newInstance();
            spf.setSchema(schema);
            SAXParser parser = spf.newSAXParser();
            parser.parse(xmlFile, new DefaultHandler());
            System.out.println(xmlFile + " is valid");
        } catch(ParserConfigurationException e) {
            System.err.println(xmlFile + " config error: " + e.getMessage());
        } catch(SAXException e) {
            System.err.println(xmlFile + " SAX error: " + e.getMessage());
        } catch(IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
