
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ModificarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ModificarUsuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parameter" type="{http://Servicios/}usuario" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificarUsuario", propOrder = {
    "parameter"
})
public class ModificarUsuario {

    protected Usuario parameter;

    /**
     * Obtiene el valor de la propiedad parameter.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getParameter() {
        return parameter;
    }

    /**
     * Define el valor de la propiedad parameter.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setParameter(Usuario value) {
        this.parameter = value;
    }

}
