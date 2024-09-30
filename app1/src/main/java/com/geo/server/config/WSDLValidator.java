//package com.geo.server.config;
//
//import javax.xml.XMLConstants;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.transform.stream.StreamSource;
//import javax.xml.validation.Schema;
//import javax.xml.validation.SchemaFactory;
//
//import com.geo.server.wits.GetWellAndWellboreResponse;
//import jakarta.xml.bind.JAXBContext;
//import jakarta.xml.bind.JAXBException;
//import jakarta.xml.bind.Unmarshaller;
//import org.w3c.dom.Document;
//import org.xml.sax.InputSource;
//import org.xml.sax.SAXException;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.StringReader;
//
//public class WSDLValidator {
//
//    public static void main(String[] args) {
//        try {
//            // Load the WSDL schema
////            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
////            Schema schema = schemaFactory.newSchema(new StreamSource("sample.wsdl"));
//
//            // Create JAXB context and unmarshaller
//            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//            dbf.setNamespaceAware(true);
//            DocumentBuilder db = dbf.newDocumentBuilder();
//            File file = new File("test.xml");
//            Document document;
//            try (FileInputStream fis = new FileInputStream(file)) {
//                document = db.parse(fis);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            } catch (SAXException e) {
//                throw new RuntimeException(e);
//            }
//            JAXBContext jaxbContext = JAXBContext.newInstance(GetWellAndWellboreResponse.class);
//            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
////            unmarshaller.setSchema(schema);
//
//            // Unmarshal the response XML
//            GetWellAndWellboreResponse response = (GetWellAndWellboreResponse) unmarshaller.unmarshal(document);
//
//            // If no exception is thrown, the response is valid
//            System.out.println("Response is valid!");
//
//        } catch (JAXBException | ParserConfigurationException e) {
//            e.printStackTrace();
//            System.out.println("Response is invalid: " + e.getMessage());
//        }
//    }
//}
