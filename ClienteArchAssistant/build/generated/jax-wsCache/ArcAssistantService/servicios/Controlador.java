
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para controlador complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="controlador"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="contNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tblAtributoCalidadacID" type="{http://Servicios/}atributocalidad" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "controlador", propOrder = {
    "contDescripcion",
    "contID",
    "contNombre",
    "tblAtributoCalidadacID"
})
public class Controlador {

    protected String contDescripcion;
    protected Integer contID;
    protected String contNombre;
    protected Atributocalidad tblAtributoCalidadacID;

    /**
     * Obtiene el valor de la propiedad contDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContDescripcion() {
        return contDescripcion;
    }

    /**
     * Define el valor de la propiedad contDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContDescripcion(String value) {
        this.contDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad contID.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContID() {
        return contID;
    }

    /**
     * Define el valor de la propiedad contID.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContID(Integer value) {
        this.contID = value;
    }

    /**
     * Obtiene el valor de la propiedad contNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContNombre() {
        return contNombre;
    }

    /**
     * Define el valor de la propiedad contNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContNombre(String value) {
        this.contNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad tblAtributoCalidadacID.
     * 
     * @return
     *     possible object is
     *     {@link Atributocalidad }
     *     
     */
    public Atributocalidad getTblAtributoCalidadacID() {
        return tblAtributoCalidadacID;
    }

    /**
     * Define el valor de la propiedad tblAtributoCalidadacID.
     * 
     * @param value
     *     allowed object is
     *     {@link Atributocalidad }
     *     
     */
    public void setTblAtributoCalidadacID(Atributocalidad value) {
        this.tblAtributoCalidadacID = value;
    }

}
