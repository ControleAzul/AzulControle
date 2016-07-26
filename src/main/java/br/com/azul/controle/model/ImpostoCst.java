package br.com.azul.controle.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 
 * Data: 25/07/2016
 * Projeto - AzulControle
 * @author Cesar Luis Gelain - gelain.cesar@gmail.com
 * Entidade para armazenar os códigos das situações tributarias de cada imposto
 * Chave primaria composta pelo id do imposto (Entidade Imposto) + origemMercadoria + codigoSt(CSOSN QUANDO MICROEMPRESA)
 *
 */


@Entity
public class ImpostoCst implements Serializable {	

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "impostoId")	
	private Imposto imposto;
	
	@Id
	@Column(length=1)
	private String origemMercadoria;
	
	@Id
	@Column(nullable=false, length = 3)
	private String codigoSt; //Foi colocado o tamanho maximo(3) do campo CSOSN, campo equivalente a situação tributaria para Microempresa ou Empresa Simples  
	
	@Column(nullable=false, length=1)
	private String tipoSt; //Define o tipo do código de situação tributaria [E]ntrada ou [S]aida
	
	@Column(nullable=false, length=100)
	private String descricao;
	
	@Column(length=1)
	private String origemMercadoriaEquivalente; // Define o código de origem da mercadoria equivalente, quando houver equivalencia entre entrada e saida 
	
	@Column(length=3)
	private String codigoStEquivalente; // Define o código da situação tributaria equivalente, quando houver equivalencia entre entrada e saida

	public Imposto getImposto() {
		return imposto;
	}
	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}

	public String getOrigemMercadoria() {
		return origemMercadoria;
	}
	public void setOrigemMercadoria(String origemMercadoria) {
		this.origemMercadoria = origemMercadoria;
	}

	public String getCodigoSt() {
		return codigoSt;
	}
	public void setCodigoSt(String codigoSt) {
		this.codigoSt = codigoSt;
	}

	public String getTipoSt() {
		return tipoSt;
	}
	public void setTipoSt(String tipoSt) {
		this.tipoSt = tipoSt;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getOrigemMercadoriaEquivalente() {
		return origemMercadoriaEquivalente;
	}
	public void setOrigemMercadoriaEquivalente(String origemMercadoriaEquivalente) {
		this.origemMercadoriaEquivalente = origemMercadoriaEquivalente;
	}

	public String getCodigoStEquivalente() {
		return codigoStEquivalente;
	}
	public void setCodigoStEquivalente(String codigoStEquivalente) {
		this.codigoStEquivalente = codigoStEquivalente;
	}
}