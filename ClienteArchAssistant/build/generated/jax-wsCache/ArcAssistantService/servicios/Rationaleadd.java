
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rationaleadd complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rationaleadd"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ratAddArchivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ratAddDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ratAddID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ratAddPaso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tblProyectoProID" type="{http://Servicios/}proyecto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rationaleadd", propOrder = {
    "ratAddArchivo",
    "ratAddDescripcion",
    "ratAddID",
    "ratAddPaso",
    "tblProyectoProID"
})
public class Rationaleadd {

    protected String ratAddArchivo;
    protected String ratAddDescripcion;
    protected Integer ratAddID;
    protected String ratAddPaso;
    protected Proyecto tblProyectoProID;

    /**
     * Obtiene el valor de la propiedad ratAddArchivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatAddArchivo() {
        return ratAddArchivo;
    }

    /**
     * Define el valor de la propiedad ratAddArchivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatAddArchivo(String value) {
        this.ratAddArchivo = value;
    }

    /**
     * Obtiene el valor de la propiedad ratAddDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatAddDescripcion() {
        return ratAddDescripcion;
    }

    /**
     * Define el valor de la propiedad ratAddDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatAddDescripcion(String value) {
        this.ratAddDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad ratAddID.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatAddID() {
        return ratAddID;
    }

    /**
     * Define el valor de la propiedad ratAddID.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatAddID(Integer value) {
        this.ratAddID = value;
    }

    /**
     * Obtiene el valor de la propiedad ratAddPaso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatAddPaso() {
        return ratAddPaso;
    }

    /**
     * Define el valor de la propiedad ratAddPaso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatAddPaso(String value) {
        this.ratAddPaso = value;
    }

    /**
     * Obtiene el valor de la propiedad tblProyectoProID.
     * 
     * @return
     *     possible object is
     *     {@link Proyecto }
     *     
     */
    public Proyecto getTblProyectoProID() {
        return tblProyectoProID;
    }

    /**
     * Define el valor de la propiedad tblProyectoProID.
     * 
     * @param value
     *     allowed object is
     *     {@link Proyecto }
     *     
     */
    public void setTblProyectoProID(Proyecto value) {
        this.tblProyectoProID = value;
    }

}
