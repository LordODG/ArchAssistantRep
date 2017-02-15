
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObtenerRationaleQAW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObtenerRationaleQAW"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idpro" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="paso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObtenerRationaleQAW", propOrder = {
    "idpro",
    "paso"
})
public class ObtenerRationaleQAW {

    protected int idpro;
    protected String paso;

    /**
     * Obtiene el valor de la propiedad idpro.
     * 
     */
    public int getIdpro() {
        return idpro;
    }

    /**
     * Define el valor de la propiedad idpro.
     * 
     */
    public void setIdpro(int value) {
        this.idpro = value;
    }

    /**
     * Obtiene el valor de la propiedad paso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaso() {
        return paso;
    }

    /**
     * Define el valor de la propiedad paso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaso(String value) {
        this.paso = value;
    }

}
