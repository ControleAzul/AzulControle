package br.com.azul.controle.model;

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
 * Entidade para armazenar os impostos obrigatórios nas operações de compra e venda
 *
 */

@Entity
public class Imposto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false, length=10)
	private String descricao;
	
	@Column(nullable=false, length=1)
	private String abrangencia; // Define a abrangencia do imposto [M]unicipal,[E]stadual ou [F]ederal
	
	@Column(nullable=false, length=1)
	private String incidencia; //Define a incidencia do imposto: [P]rodutos ou [S]erviços

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAbrangencia() {
		return abrangencia;
	}
	public void setAbrangencia(String abrangencia) {
		this.abrangencia = abrangencia;
	}

	public String getIncidencia() {
		return incidencia;
	}
	public void setIncidencia(String incidencia) {
		this.incidencia = incidencia;
	}	
}