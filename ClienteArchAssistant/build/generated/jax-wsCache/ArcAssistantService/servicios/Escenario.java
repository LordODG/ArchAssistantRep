
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para escenario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="escenario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="escAmbiente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="escArtefacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="escEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="escEstimulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="escFuente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="escID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="escMedidaRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="escNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="escPrioridad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="escRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tblAtributoCalidadacID" type="{http://Servicios/}atributocalidad" minOccurs="0"/&gt;
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
@XmlType(name = "escenario", propOrder = {
    "escAmbiente",
    "escArtefacto",
    "escEstado",
    "escEstimulo",
    "escFuente",
    "escID",
    "escMedidaRespuesta",
    "escNombre",
    "escPrioridad",
    "escRespuesta",
    "tblAtributoCalidadacID",
    "tblModuloModId",
    "tblProyectoProID"
})
public class Escenario {

    protected String escAmbiente;
    protected String escArtefacto;
    protected String escEstado;
    protected String escEstimulo;
    protected String escFuente;
    protected Integer escID;
    protected String escMedidaRespuesta;
    protected String escNombre;
    protected Integer escPrioridad;
    protected String escRespuesta;
    protected Atributocalidad tblAtributoCalidadacID;
    protected Modulo tblModuloModId;
    protected Proyecto tblProyectoProID;

    /**
     * Obtiene el valor de la propiedad escAmbiente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscAmbiente() {
        return escAmbiente;
    }

    /**
     * Define el valor de la propiedad escAmbiente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscAmbiente(String value) {
        this.escAmbiente = value;
    }

    /**
     * Obtiene el valor de la propiedad escArtefacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscArtefacto() {
        return escArtefacto;
    }

    /**
     * Define el valor de la propiedad escArtefacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscArtefacto(String value) {
        this.escArtefacto = value;
    }

    /**
     * Obtiene el valor de la propiedad escEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscEstado() {
        return escEstado;
    }

    /**
     * Define el valor de la propiedad escEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscEstado(String value) {
        this.escEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad escEstimulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscEstimulo() {
        return escEstimulo;
    }

    /**
     * Define el valor de la propiedad escEstimulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscEstimulo(String value) {
        this.escEstimulo = value;
    }

    /**
     * Obtiene el valor de la propiedad escFuente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscFuente() {
        return escFuente;
    }

    /**
     * Define el valor de la propiedad escFuente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscFuente(String value) {
        this.escFuente = value;
    }

    /**
     * Obtiene el valor de la propiedad escID.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEscID() {
        return escID;
    }

    /**
     * Define el valor de la propiedad escID.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEscID(Integer value) {
        this.escID = value;
    }

    /**
     * Obtiene el valor de la propiedad escMedidaRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscMedidaRespuesta() {
        return escMedidaRespuesta;
    }

    /**
     * Define el valor de la propiedad escMedidaRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscMedidaRespuesta(String value) {
        this.escMedidaRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad escNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscNombre() {
        return escNombre;
    }

    /**
     * Define el valor de la propiedad escNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscNombre(String value) {
        this.escNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad escPrioridad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEscPrioridad() {
        return escPrioridad;
    }

    /**
     * Define el valor de la propiedad escPrioridad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEscPrioridad(Integer value) {
        this.escPrioridad = value;
    }

    /**
     * Obtiene el valor de la propiedad escRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscRespuesta() {
        return escRespuesta;
    }

    /**
     * Define el valor de la propiedad escRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscRespuesta(String value) {
        this.escRespuesta = value;
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
