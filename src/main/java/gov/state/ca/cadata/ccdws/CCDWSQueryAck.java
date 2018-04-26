
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
 *         &lt;element name="CCDWSQueryRequestAck" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "ccdwsQueryRequestAck"
})
@XmlRootElement(name = "CCDWSQueryAck")
public class CCDWSQueryAck {

    @XmlElement(name = "CCDWSQueryRequestAck")
    protected String ccdwsQueryRequestAck;

    /**
     * Gets the value of the ccdwsQueryRequestAck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCDWSQueryRequestAck() {
        return ccdwsQueryRequestAck;
    }

    /**
     * Sets the value of the ccdwsQueryRequestAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCDWSQueryRequestAck(String value) {
        this.ccdwsQueryRequestAck = value;
    }

}
