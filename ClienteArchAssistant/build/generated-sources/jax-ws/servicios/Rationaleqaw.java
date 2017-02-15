
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rationaleqaw complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rationaleqaw"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ratQawArchivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ratQawDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ratQawID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ratQawPaso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "rationaleqaw", propOrder = {
    "ratQawArchivo",
    "ratQawDescripcion",
    "ratQawID",
    "ratQawPaso",
    "tblProyectoProID"
})
public class Rationaleqaw {

    protected String ratQawArchivo;
    protected String ratQawDescripcion;
    protected Integer ratQawID;
    protected String ratQawPaso;
    protected Proyecto tblProyectoProID;

    /**
     * Obtiene el valor de la propiedad ratQawArchivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatQawArchivo() {
        return ratQawArchivo;
    }

    /**
     * Define el valor de la propiedad ratQawArchivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatQawArchivo(String value) {
        this.ratQawArchivo = value;
    }

    /**
     * Obtiene el valor de la propiedad ratQawDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatQawDescripcion() {
        return ratQawDescripcion;
    }

    /**
     * Define el valor de la propiedad ratQawDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatQawDescripcion(String value) {
        this.ratQawDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad ratQawID.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatQawID() {
        return ratQawID;
    }

    /**
     * Define el valor de la propiedad ratQawID.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatQawID(Integer value) {
        this.ratQawID = value;
    }

    /**
     * Obtiene el valor de la propiedad ratQawPaso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatQawPaso() {
        return ratQawPaso;
    }

    /**
     * Define el valor de la propiedad ratQawPaso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatQawPaso(String value) {
        this.ratQawPaso = value;
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
