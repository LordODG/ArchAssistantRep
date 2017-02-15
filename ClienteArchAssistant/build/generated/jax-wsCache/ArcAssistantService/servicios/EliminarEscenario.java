
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EliminarEscenario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EliminarEscenario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parameter" type="{http://Servicios/}escenario" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EliminarEscenario", propOrder = {
    "parameter"
})
public class EliminarEscenario {

    protected Escenario parameter;

    /**
     * Obtiene el valor de la propiedad parameter.
     * 
     * @return
     *     possible object is
     *     {@link Escenario }
     *     
     */
    public Escenario getParameter() {
        return parameter;
    }

    /**
     * Define el valor de la propiedad parameter.
     * 
     * @param value
     *     allowed object is
     *     {@link Escenario }
     *     
     */
    public void setParameter(Escenario value) {
        this.parameter = value;
    }

}
