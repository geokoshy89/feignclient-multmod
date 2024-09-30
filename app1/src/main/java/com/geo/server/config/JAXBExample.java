//package com.geo.server.config;
//
//
//import com.geo.server.wits.WellboreType;
//import jakarta.xml.bind.JAXBContext;
//import jakarta.xml.bind.JAXBException;
//import jakarta.xml.bind.Unmarshaller;
//import org.w3c.dom.Document;
//import org.xml.sax.InputSource;
//import org.xml.sax.XMLReader;
//import org.xml.sax.helpers.XMLReaderFactory;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.transform.sax.SAXSource;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.StringReader;
//
//public class JAXBExample {
//    public static void main(String[] args) {
//        try {
//
//
//            // Parse the XML file into a Document
//            File file = new File("test.xml");
//
//
//            // Create a JAXBContext for the GetWellAndWellboreResponse class
//            JAXBContext jaxbContext = JAXBContext.newInstance(GetWellAndWellboreResponse.class);
//            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//// Create an XMLReader and set the NamespaceFilter
//            XMLReader xmlReader = XMLReaderFactory.createXMLReader();
//            NamespaceFilter inFilter = new NamespaceFilter("http://example.com/witsml", true);
//            inFilter.setParent(xmlReader);
//
//            InputSource inputSource = new InputSource(new FileInputStream(file));
//            SAXSource source = new SAXSource(inFilter, inputSource);
//            // Unmarshal the Document to a GetWellAndWellboreResponse object
//            GetWellAndWellboreResponse response = (GetWellAndWellboreResponse) unmarshaller.unmarshal(inputSource);
//
//            // Process the response object
//            System.out.println("Well Name: " + response.getWellDetails());
//            System.out.println("Well Name: " + response.getWellboreDetails());
////            System.out.println("Well UID: " + response.getWellDetails().getWell().getUid());
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
