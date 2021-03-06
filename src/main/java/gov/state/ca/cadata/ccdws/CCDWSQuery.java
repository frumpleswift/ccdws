
package gov.state.ca.cadata.ccdws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCDWSQueryRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ccdwsQueryRequest"
})
@XmlRootElement(name = "CCDWSQuery")
public class CCDWSQuery {

    @XmlElement(name = "CCDWSQueryRequest")
    protected String ccdwsQueryRequest;

    /**
     * Gets the value of the ccdwsQueryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCDWSQueryRequest() {
        return ccdwsQueryRequest;
    }

    /**
     * Sets the value of the ccdwsQueryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCDWSQueryRequest(String value) {
        this.ccdwsQueryRequest = value;
    }

}
