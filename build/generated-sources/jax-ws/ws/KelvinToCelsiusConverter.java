
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para KelvinToCelsiusConverter complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="KelvinToCelsiusConverter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kelvin" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KelvinToCelsiusConverter", propOrder = {
    "kelvin"
})
public class KelvinToCelsiusConverter {

    protected int kelvin;

    /**
     * Obtiene el valor de la propiedad kelvin.
     * 
     */
    public int getKelvin() {
        return kelvin;
    }

    /**
     * Define el valor de la propiedad kelvin.
     * 
     */
    public void setKelvin(int value) {
        this.kelvin = value;
    }

}
