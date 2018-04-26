
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
 *         &lt;element name="CCDWSRunLobPkgResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "ccdwsRunLobPkgResult"
})
@XmlRootElement(name = "CCDWSRunLobPkgResponse")
public class CCDWSRunLobPkgResponse {

    @XmlElement(name = "CCDWSRunLobPkgResult")
    protected String ccdwsRunLobPkgResult;

    /**
     * Gets the value of the ccdwsRunLobPkgResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCDWSRunLobPkgResult() {
        return ccdwsRunLobPkgResult;
    }

    /**
     * Sets the value of the ccdwsRunLobPkgResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCDWSRunLobPkgResult(String value) {
        this.ccdwsRunLobPkgResult = value;
    }

}
