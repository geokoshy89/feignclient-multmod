
package com.geo.server.wits;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WellDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="WellboreDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wellDetails",
    "wellboreDetails"
})
@XmlRootElement(name = "GetWellAndWellboreResponse")
public class GetWellAndWellboreResponse {

    @XmlElement(name = "WellDetails", required = true)
    protected String wellDetails;
    @XmlElement(name = "WellboreDetails", required = true)
    protected String wellboreDetails;

    /**
     * Gets the value of the wellDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWellDetails() {
        return wellDetails;
    }

    /**
     * Sets the value of the wellDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWellDetails(String value) {
        this.wellDetails = value;
    }

    /**
     * Gets the value of the wellboreDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWellboreDetails() {
        return wellboreDetails;
    }

    /**
     * Sets the value of the wellboreDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWellboreDetails(String value) {
        this.wellboreDetails = value;
    }

}
