
package com.geo.server.wits;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WITSMLService", targetNamespace = "http://example.com/witsml", wsdlLocation = "file:/C:/Users/geoko/Work/Learning/FeignClientMultiMod/app1/src/main/resources/wsdl/sample.wsdl")
public class WITSMLService
    extends Service
{

    private static final URL WITSMLSERVICE_WSDL_LOCATION;
    private static final WebServiceException WITSMLSERVICE_EXCEPTION;
    private static final QName WITSMLSERVICE_QNAME = new QName("http://example.com/witsml", "WITSMLService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/geoko/Work/Learning/FeignClientMultiMod/app1/src/main/resources/wsdl/sample.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WITSMLSERVICE_WSDL_LOCATION = url;
        WITSMLSERVICE_EXCEPTION = e;
    }

    public WITSMLService() {
        super(__getWsdlLocation(), WITSMLSERVICE_QNAME);
    }

    public WITSMLService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WITSMLSERVICE_QNAME, features);
    }

    public WITSMLService(URL wsdlLocation) {
        super(wsdlLocation, WITSMLSERVICE_QNAME);
    }

    public WITSMLService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WITSMLSERVICE_QNAME, features);
    }

    public WITSMLService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WITSMLService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WITSMLPortType
     */
    @WebEndpoint(name = "WITSMLPort")
    public WITSMLPortType getWITSMLPort() {
        return super.getPort(new QName("http://example.com/witsml", "WITSMLPort"), WITSMLPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WITSMLPortType
     */
    @WebEndpoint(name = "WITSMLPort")
    public WITSMLPortType getWITSMLPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://example.com/witsml", "WITSMLPort"), WITSMLPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WITSMLSERVICE_EXCEPTION!= null) {
            throw WITSMLSERVICE_EXCEPTION;
        }
        return WITSMLSERVICE_WSDL_LOCATION;
    }

}
