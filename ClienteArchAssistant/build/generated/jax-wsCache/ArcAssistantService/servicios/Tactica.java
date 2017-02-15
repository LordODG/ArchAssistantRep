
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tactica complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tactica"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tacDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tacID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tacNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tblPreocupacionpreID" type="{http://Servicios/}preocupacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tactica", propOrder = {
    "tacDescripcion",
    "tacID",
    "tacNombre",
    "tblPreocupacionpreID"
})
public class Tactica {

    protected String tacDescripcion;
    protected Integer tacID;
    protected String tacNombre;
    protected Preocupacion tblPreocupacionpreID;

    /**
     * Obtiene el valor de la propiedad tacDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTacDescripcion() {
        return tacDescripcion;
    }

    /**
     * Define el valor de la propiedad tacDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTacDescripcion(String value) {
        this.tacDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad tacID.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTacID() {
        return tacID;
    }

    /**
     * Define el valor de la propiedad tacID.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTacID(Integer value) {
        this.tacID = value;
    }

    /**
     * Obtiene el valor de la propiedad tacNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTacNombre() {
        return tacNombre;
    }

    /**
     * Define el valor de la propiedad tacNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTacNombre(String value) {
        this.tacNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad tblPreocupacionpreID.
     * 
     * @return
     *     possible object is
     *     {@link Preocupacion }
     *     
     */
    public Preocupacion getTblPreocupacionpreID() {
        return tblPreocupacionpreID;
    }

    /**
     * Define el valor de la propiedad tblPreocupacionpreID.
     * 
     * @param value
     *     allowed object is
     *     {@link Preocupacion }
     *     
     */
    public void setTblPreocupacionpreID(Preocupacion value) {
        this.tblPreocupacionpreID = value;
    }

}
