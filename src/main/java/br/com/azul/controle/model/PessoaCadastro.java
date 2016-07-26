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
 * Entidade para armazenar os tipos de cadastros que cada pessoa
 * interage no sitema(Cliente = venda, Fornecedor = compra)
 * Chave primaria composta pelo id da pessoa(Entidade Pessoa) + tipoCadastro
 *
 */

@Entity
public class PessoaCadastro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "pessoaId")	
	private Pessoa pessoa;
	
	@Id
	@Column(nullable=false)
	private String tipoCadastro; //Define o tipo do cadastro da pessoa (Cliente, Fornecedor, Transportador...)
	
	@Column(nullable=false)
	private String ramoAtividade; // Define o ramo de atividade do cadastro (Comercio, Industria, Atacado...)
	
	@Column(nullable=false, length=1)
	private String situacao; //Define se o cadastro esta [A]tivo ou [I]nativo
	
	@Column
	private String observacao;
	
	@Column(nullable=false)
	private LocalDateTime dataAlteracao;	
	
	@Column
	private Boolean contribuinteIcms; //Define se o cadastro é  Contribuinte[T] ou  Consumidor Final[F]

	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getTipoCadastro() {
		return tipoCadastro;
	}
	public void setTipoCadastro(String tipoCadastro) {
		this.tipoCadastro = tipoCadastro;
	}

	public String getRamoAtividade() {
		return ramoAtividade;
	}
	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public LocalDateTime getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(LocalDateTime dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public Boolean getContribuinteIcms() {
		return contribuinteIcms;
	}
	public void setContribuinteIcms(Boolean contribuinteIcms) {
		this.contribuinteIcms = contribuinteIcms;
	}
}