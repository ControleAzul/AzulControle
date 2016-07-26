package br.com.azul.controle.model;

import java.io.Serializable;
import java.time.LocalDateTime;

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
 * Entidade para armazenar os Endereços das Pessoas
 * chave primaria composta pelo id da pessoa(Entidade Pessoa) + tipoEndereco
 *
 */

@Entity
public class Endereco implements Serializable {	

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "pessoaId")	
	private Pessoa pessoa;
	
	@Id
	@Column(nullable=false, length=1)
	private String tipoEndereco; //Define o tipo do endereço cadastrado (Padrão, Entrega, cobrança...)
	
	@Column(nullable=false, length=60)
	private String logradouro;
	
	@Column(nullable=false, length=60)
	private String numero;
	
	@Column(nullable=false, length=60)
	private String complemento;
	
	@Column(nullable=false, length=60)
	private String bairro;
	
	@Column(nullable=false, length=8)
	private String cep;
	
	@Column(nullable=false, length=7)
	private String codigoMunicipioIbge;
	
	@Column(nullable=false, length=60)
	private String municipio;
	
	@Column(nullable=false, length=2)
	private String uf;
	
	@Column(nullable=false)
	private LocalDateTime dataAlteracao;

	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getTipoEndereco() {
		return tipoEndereco;
	}
	public void setTipoEndereco(String tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCodigoMunicipioIbge() {
		return codigoMunicipioIbge;
	}
	public void setCodigoMunicipioIbge(String codigoMunicipioIbge) {
		this.codigoMunicipioIbge = codigoMunicipioIbge;
	}

	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}

	public LocalDateTime getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(LocalDateTime dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
}
