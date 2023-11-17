
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EnergiaPotencial complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EnergiaPotencial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="masa" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergiaPotencial", propOrder = {
    "masa",
    "altura"
})
public class EnergiaPotencial {

    protected int masa;
    protected int altura;

    /**
     * Obtiene el valor de la propiedad masa.
     * 
     */
    public int getMasa() {
        return masa;
    }

    /**
     * Define el valor de la propiedad masa.
     * 
     */
    public void setMasa(int value) {
        this.masa = value;
    }

    /**
     * Obtiene el valor de la propiedad altura.
     * 
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Define el valor de la propiedad altura.
     * 
     */
    public void setAltura(int value) {
        this.altura = value;
    }

}
