
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para interface complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="interface"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="intDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="intNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tblModuloModId" type="{http://Servicios/}modulo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "interface", propOrder = {
    "intDescripcion",
    "intId",
    "intNombre",
    "intTipo",
    "tblModuloModId"
})
public class Interface {

    protected String intDescripcion;
    protected Integer intId;
    protected String intNombre;
    protected String intTipo;
    protected Modulo tblModuloModId;

    /**
     * Obtiene el valor de la propiedad intDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntDescripcion() {
        return intDescripcion;
    }

    /**
     * Define el valor de la propiedad intDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntDescripcion(String value) {
        this.intDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad intId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntId() {
        return intId;
    }

    /**
     * Define el valor de la propiedad intId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntId(Integer value) {
        this.intId = value;
    }

    /**
     * Obtiene el valor de la propiedad intNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntNombre() {
        return intNombre;
    }

    /**
     * Define el valor de la propiedad intNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntNombre(String value) {
        this.intNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad intTipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntTipo() {
        return intTipo;
    }

    /**
     * Define el valor de la propiedad intTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntTipo(String value) {
        this.intTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad tblModuloModId.
     * 
     * @return
     *     possible object is
     *     {@link Modulo }
     *     
     */
    public Modulo getTblModuloModId() {
        return tblModuloModId;
    }

    /**
     * Define el valor de la propiedad tblModuloModId.
     * 
     * @param value
     *     allowed object is
     *     {@link Modulo }
     *     
     */
    public void setTblModuloModId(Modulo value) {
        this.tblModuloModId = value;
    }

}
