
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSOperations", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSOperations {


    /**
     * 
     * @param kelvin
     * @return
     *     returns int
     */
    @WebMethod(operationName = "KelvinToCelsiusConverter")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "KelvinToCelsiusConverter", targetNamespace = "http://ws/", className = "ws.KelvinToCelsiusConverter")
    @ResponseWrapper(localName = "KelvinToCelsiusConverterResponse", targetNamespace = "http://ws/", className = "ws.KelvinToCelsiusConverterResponse")
    @Action(input = "http://ws/WSOperations/KelvinToCelsiusConverterRequest", output = "http://ws/WSOperations/KelvinToCelsiusConverterResponse")
    public int kelvinToCelsiusConverter(
        @WebParam(name = "kelvin", targetNamespace = "")
        int kelvin);

    /**
     * 
     * @param tiempo
     * @param velocidad
     * @return
     *     returns int
     */
    @WebMethod(operationName = "DistanciaCarro")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DistanciaCarro", targetNamespace = "http://ws/", className = "ws.DistanciaCarro")
    @ResponseWrapper(localName = "DistanciaCarroResponse", targetNamespace = "http://ws/", className = "ws.DistanciaCarroResponse")
    @Action(input = "http://ws/WSOperations/DistanciaCarroRequest", output = "http://ws/WSOperations/DistanciaCarroResponse")
    public int distanciaCarro(
        @WebParam(name = "velocidad", targetNamespace = "")
        int velocidad,
        @WebParam(name = "tiempo", targetNamespace = "")
        int tiempo);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "resta", targetNamespace = "http://ws/", className = "ws.Resta")
    @ResponseWrapper(localName = "restaResponse", targetNamespace = "http://ws/", className = "ws.RestaResponse")
    @Action(input = "http://ws/WSOperations/restaRequest", output = "http://ws/WSOperations/restaResponse")
    public int resta(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiplicacion", targetNamespace = "http://ws/", className = "ws.Multiplicacion")
    @ResponseWrapper(localName = "multiplicacionResponse", targetNamespace = "http://ws/", className = "ws.MultiplicacionResponse")
    @Action(input = "http://ws/WSOperations/multiplicacionRequest", output = "http://ws/WSOperations/multiplicacionResponse")
    public int multiplicacion(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "division", targetNamespace = "http://ws/", className = "ws.Division")
    @ResponseWrapper(localName = "divisionResponse", targetNamespace = "http://ws/", className = "ws.DivisionResponse")
    @Action(input = "http://ws/WSOperations/divisionRequest", output = "http://ws/WSOperations/divisionResponse")
    public double division(
        @WebParam(name = "a", targetNamespace = "")
        double a,
        @WebParam(name = "b", targetNamespace = "")
        double b);

    /**
     * 
     * @param usuario
     * @param contrasena
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "Login")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Login", targetNamespace = "http://ws/", className = "ws.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://ws/", className = "ws.LoginResponse")
    @Action(input = "http://ws/WSOperations/LoginRequest", output = "http://ws/WSOperations/LoginResponse")
    public boolean login(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "suma", targetNamespace = "http://ws/", className = "ws.Suma")
    @ResponseWrapper(localName = "sumaResponse", targetNamespace = "http://ws/", className = "ws.SumaResponse")
    @Action(input = "http://ws/WSOperations/sumaRequest", output = "http://ws/WSOperations/sumaResponse")
    public int suma(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param masa
     * @param altura
     * @return
     *     returns double
     */
    @WebMethod(operationName = "EnergiaPotencial")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "EnergiaPotencial", targetNamespace = "http://ws/", className = "ws.EnergiaPotencial")
    @ResponseWrapper(localName = "EnergiaPotencialResponse", targetNamespace = "http://ws/", className = "ws.EnergiaPotencialResponse")
    @Action(input = "http://ws/WSOperations/EnergiaPotencialRequest", output = "http://ws/WSOperations/EnergiaPotencialResponse")
    public double energiaPotencial(
        @WebParam(name = "masa", targetNamespace = "")
        int masa,
        @WebParam(name = "altura", targetNamespace = "")
        int altura);

}