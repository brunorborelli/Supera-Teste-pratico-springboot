package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "data_operacao")
    private String data;

    @Column(name = "nome_operador")
    private String nomeOperador;

    private String valorOperacao;

	private String tipoOperacao;

    public User() {

    }

    public User(String data, String nomeOperador, String valorOperacao, String tipoOperacao) {
        super();
        this.data = data;
        this.nomeOperador = nomeOperador;
        this.valorOperacao = valorOperacao;
        this.tipoOperacao = tipoOperacao;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getdata() {
        return data;
    }
    public void setdata(String data) {
        this.data = data;
    }
    public String getvalorOperacao(String valorOperacao) {
        return valorOperacao;
    }
    public void setvalorOperacao(String valorOperacao) {
        this.valorOperacao = valorOperacao;
    }

	public String getvalorOperacao() {
		return valorOperacao;
	}
	 public String gettipoOperacao() {
	        return tipoOperacao;
	    }
	    public void settipoOperacao(String tipoOperacao) {
	        this.tipoOperacao = tipoOperacao;
	    }
    public String getnomeOperador() {
        return nomeOperador;
    }
    public void setnomeOperador(String nomeOperador) {
        this.nomeOperador = nomeOperador;
    }
   
   
	
}