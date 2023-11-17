
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DistanciaCarro_QNAME = new QName("http://ws/", "DistanciaCarro");
    private final static QName _DistanciaCarroResponse_QNAME = new QName("http://ws/", "DistanciaCarroResponse");
    private final static QName _EnergiaPotencial_QNAME = new QName("http://ws/", "EnergiaPotencial");
    private final static QName _EnergiaPotencialResponse_QNAME = new QName("http://ws/", "EnergiaPotencialResponse");
    private final static QName _KelvinToCelsiusConverter_QNAME = new QName("http://ws/", "KelvinToCelsiusConverter");
    private final static QName _KelvinToCelsiusConverterResponse_QNAME = new QName("http://ws/", "KelvinToCelsiusConverterResponse");
    private final static QName _Login_QNAME = new QName("http://ws/", "Login");
    private final static QName _LoginResponse_QNAME = new QName("http://ws/", "LoginResponse");
    private final static QName _Division_QNAME = new QName("http://ws/", "division");
    private final static QName _DivisionResponse_QNAME = new QName("http://ws/", "divisionResponse");
    private final static QName _Multiplicacion_QNAME = new QName("http://ws/", "multiplicacion");
    private final static QName _MultiplicacionResponse_QNAME = new QName("http://ws/", "multiplicacionResponse");
    private final static QName _Resta_QNAME = new QName("http://ws/", "resta");
    private final static QName _RestaResponse_QNAME = new QName("http://ws/", "restaResponse");
    private final static QName _Suma_QNAME = new QName("http://ws/", "suma");
    private final static QName _SumaResponse_QNAME = new QName("http://ws/", "sumaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DistanciaCarro }
     * 
     */
    public DistanciaCarro createDistanciaCarro() {
        return new DistanciaCarro();
    }

    /**
     * Create an instance of {@link DistanciaCarroResponse }
     * 
     */
    public DistanciaCarroResponse createDistanciaCarroResponse() {
        return new DistanciaCarroResponse();
    }

    /**
     * Create an instance of {@link EnergiaPotencial }
     * 
     */
    public EnergiaPotencial createEnergiaPotencial() {
        return new EnergiaPotencial();
    }

    /**
     * Create an instance of {@link EnergiaPotencialResponse }
     * 
     */
    public EnergiaPotencialResponse createEnergiaPotencialResponse() {
        return new EnergiaPotencialResponse();
    }

    /**
     * Create an instance of {@link KelvinToCelsiusConverter }
     * 
     */
    public KelvinToCelsiusConverter createKelvinToCelsiusConverter() {
        return new KelvinToCelsiusConverter();
    }

    /**
     * Create an instance of {@link KelvinToCelsiusConverterResponse }
     * 
     */
    public KelvinToCelsiusConverterResponse createKelvinToCelsiusConverterResponse() {
        return new KelvinToCelsiusConverterResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Division }
     * 
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link Multiplicacion }
     * 
     */
    public Multiplicacion createMultiplicacion() {
        return new Multiplicacion();
    }

    /**
     * Create an instance of {@link MultiplicacionResponse }
     * 
     */
    public MultiplicacionResponse createMultiplicacionResponse() {
        return new MultiplicacionResponse();
    }

    /**
     * Create an instance of {@link Resta }
     * 
     */
    public Resta createResta() {
        return new Resta();
    }

    /**
     * Create an instance of {@link RestaResponse }
     * 
     */
    public RestaResponse createRestaResponse() {
        return new RestaResponse();
    }

    /**
     * Create an instance of {@link Suma }
     * 
     */
    public Suma createSuma() {
        return new Suma();
    }

    /**
     * Create an instance of {@link SumaResponse }
     * 
     */
    public SumaResponse createSumaResponse() {
        return new SumaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistanciaCarro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DistanciaCarro }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "DistanciaCarro")
    public JAXBElement<DistanciaCarro> createDistanciaCarro(DistanciaCarro value) {
        return new JAXBElement<DistanciaCarro>(_DistanciaCarro_QNAME, DistanciaCarro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistanciaCarroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DistanciaCarroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "DistanciaCarroResponse")
    public JAXBElement<DistanciaCarroResponse> createDistanciaCarroResponse(DistanciaCarroResponse value) {
        return new JAXBElement<DistanciaCarroResponse>(_DistanciaCarroResponse_QNAME, DistanciaCarroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergiaPotencial }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnergiaPotencial }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "EnergiaPotencial")
    public JAXBElement<EnergiaPotencial> createEnergiaPotencial(EnergiaPotencial value) {
        return new JAXBElement<EnergiaPotencial>(_EnergiaPotencial_QNAME, EnergiaPotencial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergiaPotencialResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnergiaPotencialResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "EnergiaPotencialResponse")
    public JAXBElement<EnergiaPotencialResponse> createEnergiaPotencialResponse(EnergiaPotencialResponse value) {
        return new JAXBElement<EnergiaPotencialResponse>(_EnergiaPotencialResponse_QNAME, EnergiaPotencialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KelvinToCelsiusConverter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KelvinToCelsiusConverter }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "KelvinToCelsiusConverter")
    public JAXBElement<KelvinToCelsiusConverter> createKelvinToCelsiusConverter(KelvinToCelsiusConverter value) {
        return new JAXBElement<KelvinToCelsiusConverter>(_KelvinToCelsiusConverter_QNAME, KelvinToCelsiusConverter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KelvinToCelsiusConverterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KelvinToCelsiusConverterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "KelvinToCelsiusConverterResponse")
    public JAXBElement<KelvinToCelsiusConverterResponse> createKelvinToCelsiusConverterResponse(KelvinToCelsiusConverterResponse value) {
        return new JAXBElement<KelvinToCelsiusConverterResponse>(_KelvinToCelsiusConverterResponse_QNAME, KelvinToCelsiusConverterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<Division>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "divisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<DivisionResponse>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplicacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Multiplicacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "multiplicacion")
    public JAXBElement<Multiplicacion> createMultiplicacion(Multiplicacion value) {
        return new JAXBElement<Multiplicacion>(_Multiplicacion_QNAME, Multiplicacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplicacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "multiplicacionResponse")
    public JAXBElement<MultiplicacionResponse> createMultiplicacionResponse(MultiplicacionResponse value) {
        return new JAXBElement<MultiplicacionResponse>(_MultiplicacionResponse_QNAME, MultiplicacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Resta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Resta }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "resta")
    public JAXBElement<Resta> createResta(Resta value) {
        return new JAXBElement<Resta>(_Resta_QNAME, Resta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RestaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "restaResponse")
    public JAXBElement<RestaResponse> createRestaResponse(RestaResponse value) {
        return new JAXBElement<RestaResponse>(_RestaResponse_QNAME, RestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "suma")
    public JAXBElement<Suma> createSuma(Suma value) {
        return new JAXBElement<Suma>(_Suma_QNAME, Suma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "sumaResponse")
    public JAXBElement<SumaResponse> createSumaResponse(SumaResponse value) {
        return new JAXBElement<SumaResponse>(_SumaResponse_QNAME, SumaResponse.class, null, value);
    }

}
