
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modulo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modulo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="modDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="modNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tblModuloModId" type="{http://Servicios/}modulo" minOccurs="0"/&gt;
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
@XmlType(name = "modulo", propOrder = {
    "modDescripcion",
    "modFinal",
    "modId",
    "modNombre",
    "tblModuloModId",
    "tblProyectoProID"
})
public class Modulo {

    protected String modDescripcion;
    protected String modFinal;
    protected Integer modId;
    protected String modNombre;
    protected Modulo tblModuloModId;
    protected Proyecto tblProyectoProID;

    /**
     * Obtiene el valor de la propiedad modDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModDescripcion() {
        return modDescripcion;
    }

    /**
     * Define el valor de la propiedad modDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModDescripcion(String value) {
        this.modDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad modFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModFinal() {
        return modFinal;
    }

    /**
     * Define el valor de la propiedad modFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModFinal(String value) {
        this.modFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad modId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getModId() {
        return modId;
    }

    /**
     * Define el valor de la propiedad modId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModId(Integer value) {
        this.modId = value;
    }

    /**
     * Obtiene el valor de la propiedad modNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModNombre() {
        return modNombre;
    }

    /**
     * Define el valor de la propiedad modNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModNombre(String value) {
        this.modNombre = value;
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
