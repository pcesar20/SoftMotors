package com.sm.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_contratos")
public class Contratos implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Date data_inicio;
	
	@Column(nullable = false)
	private Date data_fim;
	
	@OneToOne
	@JoinColumn(name = "usuario_id")
	private Usuarios usuario;
	
	@OneToOne
	@JoinColumn(name = "moto")
	private Motos moto;
	
	@OneToOne
	@JoinColumn(name = "cliente_id")
	private Clientes cleinte;

	public Contratos(Long id, Date data_inicio, Date data_fim) {
		super();
		this.id = id;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
	}

	public Contratos() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Date getData_fim() {
		return data_fim;
	}

	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}
	
	

}
