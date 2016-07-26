package br.com.azul.controle.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 
 * Data: 22/07/2016
 * Projeto - AzulControle
 * @author Cesar Luis Gelain - gelain.cesar@gmail.com
 * Entidade para armazenar os dados das pessoas fisicas o juridicas
 * 
 */

@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false, length=1)
	private String tipo; // Define o tipo da pessoa [F]isica ou [J]uridica
	
	@Column(nullable=false, length = 60)
	private String nome;
	
	@Column(length = 60)
	private String apelido;
	
	@Column(unique=true,length=14)
	private String cpfCnpj;
	
	@Column(length=14)
	private String rgInscricaoEstadual;
	
	@Column(nullable=false, length=2)
	private String ufEmissor;	
	
	@Column
	private LocalDate dataNascimento;
	
	@Column(nullable=false)
	private LocalDate dataCadastro;
	
	@OneToMany(mappedBy = "pessoa")
	private List<Contato> contatos;
	
	@OneToMany(mappedBy = "pessoa")
	private List<PessoaCadastro> cadastros;
	
	@OneToMany(mappedBy = "pessoa")
	private List<Endereco> enderecos;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getRgInscricaoEstadual() {
		return rgInscricaoEstadual;
	}
	public void setRgInscricaoEstadual(String rgInscricaoEstadual) {
		this.rgInscricaoEstadual = rgInscricaoEstadual;
	}

	public String getUfEmissor() {
		return ufEmissor;
	}
	public void setUfEmissor(String ufEmissor) {
		this.ufEmissor = ufEmissor;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public List<Contato> getContatos() {
		return contatos;
	}
	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	public List<PessoaCadastro> getCadastros() {
		return cadastros;
	}
	public void setCadastros(List<PessoaCadastro> cadastros) {
		this.cadastros = cadastros;
		
	}
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
}
