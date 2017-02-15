
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GuardarRationaleAdd complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GuardarRationaleAdd"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parameter" type="{http://Servicios/}rationaleadd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuardarRationaleAdd", propOrder = {
    "parameter"
})
public class GuardarRationaleAdd {

    protected Rationaleadd parameter;

    /**
     * Obtiene el valor de la propiedad parameter.
     * 
     * @return
     *     possible object is
     *     {@link Rationaleadd }
     *     
     */
    public Rationaleadd getParameter() {
        return parameter;
    }

    /**
     * Define el valor de la propiedad parameter.
     * 
     * @param value
     *     allowed object is
     *     {@link Rationaleadd }
     *     
     */
    public void setParameter(Rationaleadd value) {
        this.parameter = value;
    }

}
