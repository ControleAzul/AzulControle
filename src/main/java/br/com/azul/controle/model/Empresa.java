package br.com.azul.controle.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * 
 * Data: 25/07/2016
 * Projeto - AzulControle
 * @author Cesar Luis Gelain - gelain.cesar@gmail.com
 * Entidade para armazenar a Empresa(pessoa) proprietaria da conta
 * A chave Primaria será a mesma utilizada na entidade Pessoa
 * 
 */

@Entity
public class Empresa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne
	@JoinColumn(name = "pessoaId")	
	private Pessoa pessoa;
	
	@Column(length=15)
	private String inscricaoMunicipal;
	
	@Column(length=7)
	private String codigoCnae;
	
	@Column(nullable = false, length=1)
	private String regimeTributario; // Define o regime tributario da Empresa proprietaria [S]imples, Lucro [R]eal ou lucro [P]resumido
	
	@Column
	private String calculoImpostoIss; //Define a forma do cálculo do imposto sobre serviços
	
	@Column(precision=7, scale=3)
	private BigDecimal percentualImpostoIss; //Define o percentual do imposto sobre serviços
		
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}
	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public String getCodigoCnae() {
		return codigoCnae;
	}
	public void setCodigoCnae(String codigoCnae) {
		this.codigoCnae = codigoCnae;
	}

	public String getRegimeTributario() {
		return regimeTributario;
	}
	public void setRegimeTributario(String regimeTributario) {
		this.regimeTributario = regimeTributario;
	}

	public String getCalculoImpostoIss() {
		return calculoImpostoIss;
	}
	public void setCalculoImpostoIss(String calculoImpostoIss) {
		this.calculoImpostoIss = calculoImpostoIss;
	}

	public BigDecimal getPercentualImpostoIss() {
		return percentualImpostoIss;
	}
	public void setPercentualImpostoIss(BigDecimal percentualImpostoIss) {
		this.percentualImpostoIss = percentualImpostoIss;
	}	
}
