package br.com.azul.controle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * Data: 22/07/2016
 * Projeto - AzulControle
 * @author Cesar Luis Gelain - gelain.cesar@gmail.com
 * Entidade pra armazenar os dados da tabela cfop do governo
 * 
 */

@Entity
public class Cfop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 4)
	private String codigoCfop;

	@Column(nullable = false)
	private String descricao;

	@Column(nullable = false, length = 1)
	private String tipoCfop; //Define se o cfop é de [E]ntrada ou [S]aida

	@Column(nullable = false, length = 1)
	private String OrigemDestino; //Define a origem ou destino do cfop [D]ento do Estado, [F]ora do Estado ou [E]xterior
	
	@Column(length = 4)
	private String codigoCfopEquivalente; // Define o código do cfop equivalente, quando houver equivalencia entre entrada e saida 

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoCfop() {
		return codigoCfop;
	}
	public void setCodigoCfop(String codigoCfop) {
		this.codigoCfop = codigoCfop;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipoCfop() {
		return tipoCfop;
	}
	public void setTipoCfop(String tipoCfop) {
		this.tipoCfop = tipoCfop;
	}

	public String getOrigemDestino() {
		return OrigemDestino;
	}
	public void setOrigemDestino(String origemDestino) {
		OrigemDestino = origemDestino;
	}

	public String getCodigoCfopEquivalente() {
		return codigoCfopEquivalente;
	}
	public void setCodigoCfopEquivalente(String codigoCfopEquivalente) {
		this.codigoCfopEquivalente = codigoCfopEquivalente;
	}
}
