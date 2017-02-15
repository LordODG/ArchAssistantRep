
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para proyecto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="proyecto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="proAvance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="proNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tblUsuarioidUsuario" type="{http://Servicios/}usuario" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proyecto", propOrder = {
    "proAvance",
    "proDescripcion",
    "proID",
    "proNombre",
    "tblUsuarioidUsuario"
})
public class Proyecto {

    protected String proAvance;
    protected String proDescripcion;
    protected Integer proID;
    protected String proNombre;
    protected Usuario tblUsuarioidUsuario;

    /**
     * Obtiene el valor de la propiedad proAvance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProAvance() {
        return proAvance;
    }

    /**
     * Define el valor de la propiedad proAvance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProAvance(String value) {
        this.proAvance = value;
    }

    /**
     * Obtiene el valor de la propiedad proDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProDescripcion() {
        return proDescripcion;
    }

    /**
     * Define el valor de la propiedad proDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProDescripcion(String value) {
        this.proDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad proID.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProID() {
        return proID;
    }

    /**
     * Define el valor de la propiedad proID.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProID(Integer value) {
        this.proID = value;
    }

    /**
     * Obtiene el valor de la propiedad proNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProNombre() {
        return proNombre;
    }

    /**
     * Define el valor de la propiedad proNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProNombre(String value) {
        this.proNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad tblUsuarioidUsuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getTblUsuarioidUsuario() {
        return tblUsuarioidUsuario;
    }

    /**
     * Define el valor de la propiedad tblUsuarioidUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setTblUsuarioidUsuario(Usuario value) {
        this.tblUsuarioidUsuario = value;
    }

}
