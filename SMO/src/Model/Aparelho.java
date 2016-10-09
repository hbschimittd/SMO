package Model;
// Generated Oct 9, 2016 7:43:41 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Aparelho generated by hbm2java
 */
public class Aparelho  implements java.io.Serializable {


     private int idaparelho;
     private String serie;
     private Date validade;
     private String modelo;
     private Set caixas = new HashSet(0);
     private Set localizacaos = new HashSet(0);
     private Set temperaturas = new HashSet(0);
     private Set transportes = new HashSet(0);

    public Aparelho() {
    }

	
    public Aparelho(int idaparelho) {
        this.idaparelho = idaparelho;
    }
    public Aparelho(int idaparelho, String serie, Date validade, String modelo, Set caixas, Set localizacaos, Set temperaturas, Set transportes) {
       this.idaparelho = idaparelho;
       this.serie = serie;
       this.validade = validade;
       this.modelo = modelo;
       this.caixas = caixas;
       this.localizacaos = localizacaos;
       this.temperaturas = temperaturas;
       this.transportes = transportes;
    }
   
    public int getIdaparelho() {
        return this.idaparelho;
    }
    
    public void setIdaparelho(int idaparelho) {
        this.idaparelho = idaparelho;
    }
    public String getSerie() {
        return this.serie;
    }
    
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public Date getValidade() {
        return this.validade;
    }
    
    public void setValidade(Date validade) {
        this.validade = validade;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Set getCaixas() {
        return this.caixas;
    }
    
    public void setCaixas(Set caixas) {
        this.caixas = caixas;
    }
    public Set getLocalizacaos() {
        return this.localizacaos;
    }
    
    public void setLocalizacaos(Set localizacaos) {
        this.localizacaos = localizacaos;
    }
    public Set getTemperaturas() {
        return this.temperaturas;
    }
    
    public void setTemperaturas(Set temperaturas) {
        this.temperaturas = temperaturas;
    }
    public Set getTransportes() {
        return this.transportes;
    }
    
    public void setTransportes(Set transportes) {
        this.transportes = transportes;
    }




}

