
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
 *         &lt;element name="CCDWSQueryResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "ccdwsQueryResult"
})
@XmlRootElement(name = "CCDWSQueryResponse")
public class CCDWSQueryResponse {

    @XmlElement(name = "CCDWSQueryResult")
    protected String ccdwsQueryResult;

    /**
     * Gets the value of the ccdwsQueryResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCDWSQueryResult() {
        return ccdwsQueryResult;
    }

    /**
     * Sets the value of the ccdwsQueryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCDWSQueryResult(String value) {
        this.ccdwsQueryResult = value;
    }

}
