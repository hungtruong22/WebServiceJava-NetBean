
package dichvu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phongBanBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phongBanBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maPhongBan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenPhongBan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phongBanBean", propOrder = {
    "maPhongBan",
    "tenPhongBan"
})
public class PhongBanBean {

    protected String maPhongBan;
    protected String tenPhongBan;

    /**
     * Gets the value of the maPhongBan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaPhongBan() {
        return maPhongBan;
    }

    /**
     * Sets the value of the maPhongBan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaPhongBan(String value) {
        this.maPhongBan = value;
    }

    /**
     * Gets the value of the tenPhongBan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenPhongBan() {
        return tenPhongBan;
    }

    /**
     * Sets the value of the tenPhongBan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenPhongBan(String value) {
        this.tenPhongBan = value;
    }

}
