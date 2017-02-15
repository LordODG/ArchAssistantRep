
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para preocupacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="preocupacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="preDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="preNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tblControladorcontID" type="{http://Servicios/}controlador" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preocupacion", propOrder = {
    "preDescripcion",
    "preID",
    "preNombre",
    "tblControladorcontID"
})
public class Preocupacion {

    protected String preDescripcion;
    protected Integer preID;
    protected String preNombre;
    protected Controlador tblControladorcontID;

    /**
     * Obtiene el valor de la propiedad preDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreDescripcion() {
        return preDescripcion;
    }

    /**
     * Define el valor de la propiedad preDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreDescripcion(String value) {
        this.preDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad preID.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreID() {
        return preID;
    }

    /**
     * Define el valor de la propiedad preID.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreID(Integer value) {
        this.preID = value;
    }

    /**
     * Obtiene el valor de la propiedad preNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreNombre() {
        return preNombre;
    }

    /**
     * Define el valor de la propiedad preNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreNombre(String value) {
        this.preNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad tblControladorcontID.
     * 
     * @return
     *     possible object is
     *     {@link Controlador }
     *     
     */
    public Controlador getTblControladorcontID() {
        return tblControladorcontID;
    }

    /**
     * Define el valor de la propiedad tblControladorcontID.
     * 
     * @param value
     *     allowed object is
     *     {@link Controlador }
     *     
     */
    public void setTblControladorcontID(Controlador value) {
        this.tblControladorcontID = value;
    }

}
