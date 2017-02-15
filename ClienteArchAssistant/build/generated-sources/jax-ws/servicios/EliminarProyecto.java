
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EliminarProyecto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EliminarProyecto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="proyecto" type="{http://Servicios/}proyecto" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EliminarProyecto", propOrder = {
    "proyecto",
    "usuario"
})
public class EliminarProyecto {

    protected Proyecto proyecto;
    protected int usuario;

    /**
     * Obtiene el valor de la propiedad proyecto.
     * 
     * @return
     *     possible object is
     *     {@link Proyecto }
     *     
     */
    public Proyecto getProyecto() {
        return proyecto;
    }

    /**
     * Define el valor de la propiedad proyecto.
     * 
     * @param value
     *     allowed object is
     *     {@link Proyecto }
     *     
     */
    public void setProyecto(Proyecto value) {
        this.proyecto = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     */
    public int getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     */
    public void setUsuario(int value) {
        this.usuario = value;
    }

}
