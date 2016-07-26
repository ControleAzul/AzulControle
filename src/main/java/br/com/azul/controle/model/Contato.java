package br.com.azul.controle.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 
 * Data: 22/07/2016
 * Projeto - AzulControle
 * @author Cesar Luis Gelain - gelain.cesar@gmail.com
 * Entidade para armazenar os contatos das pessoas
 *  
 */

@Entity
public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "pessoaId")	
	private Pessoa pessoa;
	
	@Id	
	@Column(nullable=false, length=1)
	private String tipo; // Define o tipo do contato: Telefone, Fax, Email, Whatsapp, Nextel...
	
	@Id
	@Column(nullable=false, length=60)
	private String nome;
	
	@Column(nullable=false, length=60)
	private String contato; // num do telefone, conta do email, numero do whatsapp
	
	@Column
	private Boolean enviaEmail; // Quando o contato for do tipo email, define se envia arquivos para esse email
	
	@Column
	private String Observacao;

	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}

	public Boolean getEnviaEmail() {
		return enviaEmail;
	}
	public void setEnviaEmail(Boolean enviaEmail) {
		this.enviaEmail = enviaEmail;
	}

	public String getObservacao() {
		return Observacao;
	}
	public void setObservacao(String observacao) {
		Observacao = observacao;
	}

}