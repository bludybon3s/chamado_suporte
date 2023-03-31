package chamado;

import java.util.Date;

public class Chamado {
	private int id;
	private int numero;
	private Date dataAbertura;
	private String nomeUsuario;
	private String descricaoProblema;
	private String status;
	
	//Constructor
	public Chamado(int id, int numero, Date dataAbertura, String nomeUsuario, String descricaoProblema, String statu) {
		this.id = id;
		this.numero = numero;
		this.dataAbertura = dataAbertura;
		this.nomeUsuario = nomeUsuario;
		this.descricaoProblema = descricaoProblema;
		this.status = "aberto"; // novo chamado sempre em aberto
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getDescricaoProblema() {
		return descricaoProblema;
	}

	public void setDescricaoProblema(String descricaoProblema) {
		this.descricaoProblema = descricaoProblema;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
