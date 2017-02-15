
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para usuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="usuNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuPasword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuario", propOrder = {
    "idUsuario",
    "usuNombre",
    "usuPasword",
    "usuUsuario"
})
public class Usuario {

    protected Integer idUsuario;
    protected String usuNombre;
    protected String usuPasword;
    protected String usuUsuario;

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdUsuario(Integer value) {
        this.idUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad usuNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuNombre() {
        return usuNombre;
    }

    /**
     * Define el valor de la propiedad usuNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuNombre(String value) {
        this.usuNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad usuPasword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuPasword() {
        return usuPasword;
    }

    /**
     * Define el valor de la propiedad usuPasword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuPasword(String value) {
        this.usuPasword = value;
    }

    /**
     * Obtiene el valor de la propiedad usuUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuUsuario() {
        return usuUsuario;
    }

    /**
     * Define el valor de la propiedad usuUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuUsuario(String value) {
        this.usuUsuario = value;
    }

}
