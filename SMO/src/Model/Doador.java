package Model;
// Generated Oct 9, 2016 7:43:41 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Doador generated by hbm2java
 */
public class Doador  implements java.io.Serializable {


     private int iddoador;
     private Responsavel responsavel;
     private Usuario usuario;
     private String nome;
     private String cpf;
     private String uf;
     private String endereco;
     private String tipoSanguineo;
     private String cidade;
     private String bairro;
     private String cep;
     private String rg;
     private Date horaObito;
     private Date nascimento;
     private String orgaoDoado;
     private Set orgaos = new HashSet(0);

    public Doador() {
    }

	
    public Doador(int iddoador, Responsavel responsavel, Usuario usuario) {
        this.iddoador = iddoador;
        this.responsavel = responsavel;
        this.usuario = usuario;
    }
    public Doador(int iddoador, Responsavel responsavel, Usuario usuario, String nome, String cpf, String uf, String endereco, String tipoSanguineo, String cidade, String bairro, String cep, String rg, Date horaObito, Date nascimento, String orgaoDoado, Set orgaos) {
       this.iddoador = iddoador;
       this.responsavel = responsavel;
       this.usuario = usuario;
       this.nome = nome;
       this.cpf = cpf;
       this.uf = uf;
       this.endereco = endereco;
       this.tipoSanguineo = tipoSanguineo;
       this.cidade = cidade;
       this.bairro = bairro;
       this.cep = cep;
       this.rg = rg;
       this.horaObito = horaObito;
       this.nascimento = nascimento;
       this.orgaoDoado = orgaoDoado;
       this.orgaos = orgaos;
    }
   
    public int getIddoador() {
        return this.iddoador;
    }
    
    public void setIddoador(int iddoador) {
        this.iddoador = iddoador;
    }
    public Responsavel getResponsavel() {
        return this.responsavel;
    }
    
    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getUf() {
        return this.uf;
    }
    
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTipoSanguineo() {
        return this.tipoSanguineo;
    }
    
    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getRg() {
        return this.rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    public Date getHoraObito() {
        return this.horaObito;
    }
    
    public void setHoraObito(Date horaObito) {
        this.horaObito = horaObito;
    }
    public Date getNascimento() {
        return this.nascimento;
    }
    
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    public String getOrgaoDoado() {
        return this.orgaoDoado;
    }
    
    public void setOrgaoDoado(String orgaoDoado) {
        this.orgaoDoado = orgaoDoado;
    }
    public Set getOrgaos() {
        return this.orgaos;
    }
    
    public void setOrgaos(Set orgaos) {
        this.orgaos = orgaos;
    }




}

