
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para atributocalidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="atributocalidad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="acNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atributocalidad", propOrder = {
    "acDescripcion",
    "acID",
    "acNombre"
})
public class Atributocalidad {

    protected String acDescripcion;
    protected Integer acID;
    protected String acNombre;

    /**
     * Obtiene el valor de la propiedad acDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcDescripcion() {
        return acDescripcion;
    }

    /**
     * Define el valor de la propiedad acDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcDescripcion(String value) {
        this.acDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad acID.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAcID() {
        return acID;
    }

    /**
     * Define el valor de la propiedad acID.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAcID(Integer value) {
        this.acID = value;
    }

    /**
     * Obtiene el valor de la propiedad acNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcNombre() {
        return acNombre;
    }

    /**
     * Define el valor de la propiedad acNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcNombre(String value) {
        this.acNombre = value;
    }

}
