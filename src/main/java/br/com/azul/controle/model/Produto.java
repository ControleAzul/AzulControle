package br.com.azul.controle.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * Data: 25/07/2016
 * Projeto - AzulControle
 * @author Cesar Luis Gelain - gelain.cesar@gmail.com
 * Entidade para armazenar os produtos/serviços comercializados pelo proprietario da conta
 *
 */

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id;
	
	@Column(nullable=false, length=2)
	private String tipo; //Define o tipo do produto/serviço: Serviço, mercadoria para revenda, materia prima, embalagem...
	
	@Column(length=100)
	private String codigoReferencia; //Define qualquer referencia externa do produto que o usuario queira utilizar
	
	@Column(nullable=false, length=120)
	private String descricao;
	
	@Column(nullable=false, length=6)
	private String unidadeVenda; //Define a unidade de coemrcialização do produto: UN, PCTE, CX...
	
	@Column(length=14)
	private String codigoEan;
	
	@Column(precision=15, scale=2)
	private BigDecimal precoCusto;
	
	@Column(precision=15, scale=2)
	private BigDecimal precoVenda;
	
	@Column(precision=7, scale=3)
	private BigDecimal margemlucro;
	
	@Column(precision=12, scale=3)
	private BigDecimal pesoBruto;
	
	@Column(precision=12, scale=3)
	private BigDecimal pesoLiquido;
	
	@Column(precision=12, scale=3)
	private BigDecimal estoqueAtual;
	
	@Column(precision=12, scale=3)
	private BigDecimal estoqueMinimo;
	
	@Column(precision=12, scale=3)
	private BigDecimal estoqueMaximo;
	
	@Column(nullable=false)
	private Boolean controlaEstoque; //Define o obrigatoriedade de controlar o estoque
	
	@Column(length=150)
	private String localizao; //Define a localiaçao fisica do produto
	
	@Column(nullable=false, length=1)
	private String situacao; //Define a situação do produto [A]tivo ou [I]nativo
	
	private byte[] imagem;
	
	@Column(nullable=false)
	private LocalDateTime dataCadastro;
	
	@Column(nullable=false)
	private LocalDateTime dataAlteracao;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCodigoReferencia() {
		return codigoReferencia;
	}
	public void setCodigoReferencia(String codigoReferencia) {
		this.codigoReferencia = codigoReferencia;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUnidadeVenda() {
		return unidadeVenda;
	}
	public void setUnidadeVenda(String unidadeVenda) {
		this.unidadeVenda = unidadeVenda;
	}

	public String getCodigoEan() {
		return codigoEan;
	}
	public void setCodigoEan(String codigoEan) {
		this.codigoEan = codigoEan;
	}

	public BigDecimal getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(BigDecimal precoCusto) {
		this.precoCusto = precoCusto;
	}

	public BigDecimal getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(BigDecimal precoVenda) {
		this.precoVenda = precoVenda;
	}

	public BigDecimal getMargemlucro() {
		return margemlucro;
	}
	public void setMargemlucro(BigDecimal margemlucro) {
		this.margemlucro = margemlucro;
	}

	public BigDecimal getPesoBruto() {
		return pesoBruto;
	}
	public void setPesoBruto(BigDecimal pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	public BigDecimal getPesoLiquido() {
		return pesoLiquido;
	}
	public void setPesoLiquido(BigDecimal pesoLiquido) {
		this.pesoLiquido = pesoLiquido;
	}

	public BigDecimal getEstoqueAtual() {
		return estoqueAtual;
	}
	public void setEstoqueAtual(BigDecimal estoqueAtual) {
		this.estoqueAtual = estoqueAtual;
	}

	public BigDecimal getEstoqueMinimo() {
		return estoqueMinimo;
	}
	public void setEstoqueMinimo(BigDecimal estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public BigDecimal getEstoqueMaximo() {
		return estoqueMaximo;
	}
	public void setEstoqueMaximo(BigDecimal estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}

	public Boolean getControlaEstoque() {
		return controlaEstoque;
	}
	public void setControlaEstoque(Boolean controlaEstoque) {
		this.controlaEstoque = controlaEstoque;
	}

	public String getLocalizao() {
		return localizao;
	}
	public void setLocalizao(String localizao) {
		this.localizao = localizao;
	}

	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public byte[] getImagem() {
		return imagem;
	}
	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDateTime getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(LocalDateTime dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
}