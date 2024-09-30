package com.geo.server.config;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

public class NamespaceFilter extends XMLFilterImpl {
    private String usedNamespaceUri;
    private boolean addNamespace;

    public NamespaceFilter(String namespaceUri, boolean addNamespace) {
        this.usedNamespaceUri = namespaceUri;
        this.addNamespace = addNamespace;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        if (addNamespace) {
            super.startElement(usedNamespaceUri, localName, qName, atts);
        } else {
            super.startElement("", localName, qName, atts);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (addNamespace) {
            super.endElement(usedNamespaceUri, localName, qName);
        } else {
            super.endElement("", localName, qName);
        }
    }
}
