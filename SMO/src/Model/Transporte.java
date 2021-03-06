package Model;
// Generated Oct 13, 2016 9:39:59 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Transporte generated by hbm2java
 */
@Entity
@Table(name = "transporte",
        schema = "public"
)
public class Transporte implements java.io.Serializable {

    private String idtransporte;
    private Aparelho aparelho;
    private Caixa caixa;
    private Motorista motorista;
    private String tempFinal;
    private String tempInicial;
    private Date horaSaida;
    private String origem;
    private Date data;
    private String latitudeInicial;
    private String latitudeFinal;
    private String longitudeInicial;
    private String destino;
    private String longitudeFinal;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idtransporte", nullable = false, length = 10)
    public String getIdtransporte() {
        return this.idtransporte;
    }

    public void setIdtransporte(String idtransporte) {
        this.idtransporte = idtransporte;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idaparelho", nullable = false)
    public Aparelho getAparelho() {
        return this.aparelho;
    }

    public void setAparelho(Aparelho aparelho) {
        this.aparelho = aparelho;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcaixa", nullable = false)
    public Caixa getCaixa() {
        return this.caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idmotorista", nullable = false)
    public Motorista getMotorista() {
        return this.motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Column(name = "temp_final", length = 5)
    public String getTempFinal() {
        return this.tempFinal;
    }

    public void setTempFinal(String tempFinal) {
        this.tempFinal = tempFinal;
    }

    @Column(name = "temp_inicial", length = 5)
    public String getTempInicial() {
        return this.tempInicial;
    }

    public void setTempInicial(String tempInicial) {
        this.tempInicial = tempInicial;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "hora_saida", length = 15)
    public Date getHoraSaida() {
        return this.horaSaida;
    }

    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }

    @Column(name = "origem", length = 150)
    public String getOrigem() {
        return this.origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "data", length = 13)
    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Column(name = "latitude_inicial", length = 10)
    public String getLatitudeInicial() {
        return this.latitudeInicial;
    }

    public void setLatitudeInicial(String latitudeInicial) {
        this.latitudeInicial = latitudeInicial;
    }

    @Column(name = "latitude_final", length = 10)
    public String getLatitudeFinal() {
        return this.latitudeFinal;
    }

    public void setLatitudeFinal(String latitudeFinal) {
        this.latitudeFinal = latitudeFinal;
    }

    @Column(name = "longitude_inicial", length = 10)
    public String getLongitudeInicial() {
        return this.longitudeInicial;
    }

    public void setLongitudeInicial(String longitudeInicial) {
        this.longitudeInicial = longitudeInicial;
    }

    @Column(name = "destino", length = 150)
    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Column(name = "longitude_final", length = 10)
    public String getLongitudeFinal() {
        return this.longitudeFinal;
    }

    public void setLongitudeFinal(String longitudeFinal) {
        this.longitudeFinal = longitudeFinal;
    }

}
