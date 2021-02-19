package com.sm.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tb_motos")
public class Motos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String placa;
	
	@Column(nullable = false)
	private String ano_fab;
	
	@Column(nullable = false)
	private String ano_modelo;
	
	@Column(nullable = false)
	private String modelo;
	
	@Column(nullable = false)
	private String cor;
	
	@Column(nullable = false)
	private String valor_venda;
	
	
	public Motos() {
		super();
	}

	public Motos(Long id, String placa, String ano_fab, String ano_modelo, String modelo, String cor,
			String valor_venda) {
		this.id = id;
		this.placa = placa;
		this.ano_fab = ano_fab;
		this.ano_modelo = ano_modelo;
		this.modelo = modelo;
		this.cor = cor;
		this.valor_venda = valor_venda;
	}

	public String getValor_venda() {
		return valor_venda;
	}

	public void setValor_venda(String valor_venda) {
		this.valor_venda = valor_venda;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getAno_fab() {
		return ano_fab;
	}

	public void setAno_fab(String ano_fab) {
		this.ano_fab = ano_fab;
	}

	public String getAno_modelo() {
		return ano_modelo;
	}

	public void setAno_modelo(String ano_modelo) {
		this.ano_modelo = ano_modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motos other = (Motos) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
