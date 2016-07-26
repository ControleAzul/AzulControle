package br.com.azul.controle.model;

import java.math.BigDecimal;

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
 * Entidade para armazenar os dados das tabelas de Ncm e Cest do Governo
 *
 */

@Entity
public class NcmCest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false, length=8)
	private String ncm;
	
	@Column(nullable=false, length=200)
	private String descricaoNcm;
	
	@Column(precision=10, scale=3)
	private BigDecimal aliquota;
	
	@Column(length=7)
	private String cest;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getNcm() {
		return ncm;
	}
	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public String getDescricaoNcm() {
		return descricaoNcm;
	}
	public void setDescricaoNcm(String descricaoNcm) {
		this.descricaoNcm = descricaoNcm;
	}

	public BigDecimal getAliquota() {
		return aliquota;
	}
	public void setAliquota(BigDecimal aliquota) {
		this.aliquota = aliquota;
	}

	public String getCest() {
		return cest;
	}
	public void setCest(String cest) {
		this.cest = cest;
	}
}
