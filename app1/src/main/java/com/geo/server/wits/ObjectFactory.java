
package com.geo.server.wits;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.geo.server.wits package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _GetCapabilitiesRequest_QNAME = new QName("http://example.com/witsml", "GetCapabilitiesRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.geo.server.wits
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWellAndWellboreRequest }
     * 
     * @return
     *     the new instance of {@link GetWellAndWellboreRequest }
     */
    public GetWellAndWellboreRequest createGetWellAndWellboreRequest() {
        return new GetWellAndWellboreRequest();
    }

    /**
     * Create an instance of {@link GetWellAndWellboreResponse }
     * 
     * @return
     *     the new instance of {@link GetWellAndWellboreResponse }
     */
    public GetWellAndWellboreResponse createGetWellAndWellboreResponse() {
        return new GetWellAndWellboreResponse();
    }

    /**
     * Create an instance of {@link GetCapabilitiesResponse }
     * 
     * @return
     *     the new instance of {@link GetCapabilitiesResponse }
     */
    public GetCapabilitiesResponse createGetCapabilitiesResponse() {
        return new GetCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/witsml", name = "GetCapabilitiesRequest")
    public JAXBElement<String> createGetCapabilitiesRequest(String value) {
        return new JAXBElement<>(_GetCapabilitiesRequest_QNAME, String.class, null, value);
    }

}
