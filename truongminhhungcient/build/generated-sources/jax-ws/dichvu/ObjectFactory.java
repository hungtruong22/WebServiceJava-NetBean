
package dichvu;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dichvu package. 
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

    private final static QName _ThongKeTrungBinhLuongResponse_QNAME = new QName("http://DichVu/", "thongKeTrungBinhLuongResponse");
    private final static QName _Hello_QNAME = new QName("http://DichVu/", "hello");
    private final static QName _TimKiemNhanVienResponse_QNAME = new QName("http://DichVu/", "timKiemNhanVienResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://DichVu/", "helloResponse");
    private final static QName _GetPBResponse_QNAME = new QName("http://DichVu/", "getPBResponse");
    private final static QName _GetNVByML_QNAME = new QName("http://DichVu/", "getNVByML");
    private final static QName _GetPB_QNAME = new QName("http://DichVu/", "getPB");
    private final static QName _ThongKeTrungBinhLuong_QNAME = new QName("http://DichVu/", "thongKeTrungBinhLuong");
    private final static QName _GetNVByMLResponse_QNAME = new QName("http://DichVu/", "getNVByMLResponse");
    private final static QName _DangNhap_QNAME = new QName("http://DichVu/", "dangNhap");
    private final static QName _GetNV_QNAME = new QName("http://DichVu/", "getNV");
    private final static QName _DangNhapResponse_QNAME = new QName("http://DichVu/", "dangNhapResponse");
    private final static QName _GetNVResponse_QNAME = new QName("http://DichVu/", "getNVResponse");
    private final static QName _TimKiemNhanVien_QNAME = new QName("http://DichVu/", "timKiemNhanVien");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dichvu
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DangNhapResponse }
     * 
     */
    public DangNhapResponse createDangNhapResponse() {
        return new DangNhapResponse();
    }

    /**
     * Create an instance of {@link GetNVResponse }
     * 
     */
    public GetNVResponse createGetNVResponse() {
        return new GetNVResponse();
    }

    /**
     * Create an instance of {@link TimKiemNhanVien }
     * 
     */
    public TimKiemNhanVien createTimKiemNhanVien() {
        return new TimKiemNhanVien();
    }

    /**
     * Create an instance of {@link GetNV }
     * 
     */
    public GetNV createGetNV() {
        return new GetNV();
    }

    /**
     * Create an instance of {@link DangNhap }
     * 
     */
    public DangNhap createDangNhap() {
        return new DangNhap();
    }

    /**
     * Create an instance of {@link GetPBResponse }
     * 
     */
    public GetPBResponse createGetPBResponse() {
        return new GetPBResponse();
    }

    /**
     * Create an instance of {@link GetNVByMLResponse }
     * 
     */
    public GetNVByMLResponse createGetNVByMLResponse() {
        return new GetNVByMLResponse();
    }

    /**
     * Create an instance of {@link GetNVByML }
     * 
     */
    public GetNVByML createGetNVByML() {
        return new GetNVByML();
    }

    /**
     * Create an instance of {@link GetPB }
     * 
     */
    public GetPB createGetPB() {
        return new GetPB();
    }

    /**
     * Create an instance of {@link ThongKeTrungBinhLuong }
     * 
     */
    public ThongKeTrungBinhLuong createThongKeTrungBinhLuong() {
        return new ThongKeTrungBinhLuong();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link TimKiemNhanVienResponse }
     * 
     */
    public TimKiemNhanVienResponse createTimKiemNhanVienResponse() {
        return new TimKiemNhanVienResponse();
    }

    /**
     * Create an instance of {@link ThongKeTrungBinhLuongResponse }
     * 
     */
    public ThongKeTrungBinhLuongResponse createThongKeTrungBinhLuongResponse() {
        return new ThongKeTrungBinhLuongResponse();
    }

    /**
     * Create an instance of {@link NhanVienBean }
     * 
     */
    public NhanVienBean createNhanVienBean() {
        return new NhanVienBean();
    }

    /**
     * Create an instance of {@link PhongBanBean }
     * 
     */
    public PhongBanBean createPhongBanBean() {
        return new PhongBanBean();
    }

    /**
     * Create an instance of {@link ThongKeBean }
     * 
     */
    public ThongKeBean createThongKeBean() {
        return new ThongKeBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThongKeTrungBinhLuongResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "thongKeTrungBinhLuongResponse")
    public JAXBElement<ThongKeTrungBinhLuongResponse> createThongKeTrungBinhLuongResponse(ThongKeTrungBinhLuongResponse value) {
        return new JAXBElement<ThongKeTrungBinhLuongResponse>(_ThongKeTrungBinhLuongResponse_QNAME, ThongKeTrungBinhLuongResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimKiemNhanVienResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "timKiemNhanVienResponse")
    public JAXBElement<TimKiemNhanVienResponse> createTimKiemNhanVienResponse(TimKiemNhanVienResponse value) {
        return new JAXBElement<TimKiemNhanVienResponse>(_TimKiemNhanVienResponse_QNAME, TimKiemNhanVienResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "getPBResponse")
    public JAXBElement<GetPBResponse> createGetPBResponse(GetPBResponse value) {
        return new JAXBElement<GetPBResponse>(_GetPBResponse_QNAME, GetPBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNVByML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "getNVByML")
    public JAXBElement<GetNVByML> createGetNVByML(GetNVByML value) {
        return new JAXBElement<GetNVByML>(_GetNVByML_QNAME, GetNVByML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "getPB")
    public JAXBElement<GetPB> createGetPB(GetPB value) {
        return new JAXBElement<GetPB>(_GetPB_QNAME, GetPB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThongKeTrungBinhLuong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "thongKeTrungBinhLuong")
    public JAXBElement<ThongKeTrungBinhLuong> createThongKeTrungBinhLuong(ThongKeTrungBinhLuong value) {
        return new JAXBElement<ThongKeTrungBinhLuong>(_ThongKeTrungBinhLuong_QNAME, ThongKeTrungBinhLuong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNVByMLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "getNVByMLResponse")
    public JAXBElement<GetNVByMLResponse> createGetNVByMLResponse(GetNVByMLResponse value) {
        return new JAXBElement<GetNVByMLResponse>(_GetNVByMLResponse_QNAME, GetNVByMLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DangNhap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "dangNhap")
    public JAXBElement<DangNhap> createDangNhap(DangNhap value) {
        return new JAXBElement<DangNhap>(_DangNhap_QNAME, DangNhap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNV }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "getNV")
    public JAXBElement<GetNV> createGetNV(GetNV value) {
        return new JAXBElement<GetNV>(_GetNV_QNAME, GetNV.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DangNhapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "dangNhapResponse")
    public JAXBElement<DangNhapResponse> createDangNhapResponse(DangNhapResponse value) {
        return new JAXBElement<DangNhapResponse>(_DangNhapResponse_QNAME, DangNhapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNVResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "getNVResponse")
    public JAXBElement<GetNVResponse> createGetNVResponse(GetNVResponse value) {
        return new JAXBElement<GetNVResponse>(_GetNVResponse_QNAME, GetNVResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimKiemNhanVien }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "timKiemNhanVien")
    public JAXBElement<TimKiemNhanVien> createTimKiemNhanVien(TimKiemNhanVien value) {
        return new JAXBElement<TimKiemNhanVien>(_TimKiemNhanVien_QNAME, TimKiemNhanVien.class, null, value);
    }

}
