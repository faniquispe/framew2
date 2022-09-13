package br.edu.ifms.detran.Dto;

import java.io.Serializable;

import br.edu.ifms.detran.model.Carro;
import br.edu.ifms.detran.model.Infracao;
import br.edu.ifms.detran.model.Multa;

public class MultaDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String cidade;
	private int ano;
	private Carro carro;
	private Infracao infracao;
	
	public MultaDto() {
		// TODO Auto-generated constructor stub
	}

	public MultaDto(Multa obj) {
		super();
		this.id = obj.getId();
		this.cidade = obj.getCidade();
		this.ano = obj.getAno();
		this.carro = obj.getCarro();
		this.infracao = obj.getInfracao();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Infracao getInfracao() {
		return infracao;
	}

	public void setInfracao(Infracao infracao) {
		this.infracao = infracao;
	}
	
	
	
}
