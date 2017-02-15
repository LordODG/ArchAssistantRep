
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para patron complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="patron"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="patDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="patID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="patNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patron", propOrder = {
    "patDescripcion",
    "patID",
    "patNombre"
})
public class Patron {

    protected String patDescripcion;
    protected Integer patID;
    protected String patNombre;

    /**
     * Obtiene el valor de la propiedad patDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatDescripcion() {
        return patDescripcion;
    }

    /**
     * Define el valor de la propiedad patDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatDescripcion(String value) {
        this.patDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad patID.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPatID() {
        return patID;
    }

    /**
     * Define el valor de la propiedad patID.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPatID(Integer value) {
        this.patID = value;
    }

    /**
     * Obtiene el valor de la propiedad patNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatNombre() {
        return patNombre;
    }

    /**
     * Define el valor de la propiedad patNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatNombre(String value) {
        this.patNombre = value;
    }

}
