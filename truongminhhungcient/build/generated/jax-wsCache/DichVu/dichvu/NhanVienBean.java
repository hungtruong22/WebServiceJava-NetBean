
package dichvu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nhanVienBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nhanVienBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diaChi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hoTen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="luong" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maNhanVien" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maPhongBan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matKhau" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nhanVienBean", propOrder = {
    "diaChi",
    "hoTen",
    "luong",
    "maNhanVien",
    "maPhongBan",
    "matKhau"
})
public class NhanVienBean {

    protected String diaChi;
    protected String hoTen;
    protected Double luong;
    protected String maNhanVien;
    protected String maPhongBan;
    protected String matKhau;

    /**
     * Gets the value of the diaChi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * Sets the value of the diaChi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiaChi(String value) {
        this.diaChi = value;
    }

    /**
     * Gets the value of the hoTen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * Sets the value of the hoTen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoTen(String value) {
        this.hoTen = value;
    }

    /**
     * Gets the value of the luong property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLuong() {
        return luong;
    }

    /**
     * Sets the value of the luong property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLuong(Double value) {
        this.luong = value;
    }

    /**
     * Gets the value of the maNhanVien property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaNhanVien() {
        return maNhanVien;
    }

    /**
     * Sets the value of the maNhanVien property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaNhanVien(String value) {
        this.maNhanVien = value;
    }

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
     * Gets the value of the matKhau property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatKhau() {
        return matKhau;
    }

    /**
     * Sets the value of the matKhau property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatKhau(String value) {
        this.matKhau = value;
    }

}
