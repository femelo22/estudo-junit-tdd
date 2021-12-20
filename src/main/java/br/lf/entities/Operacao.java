package br.lf.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.lf.enums.TipoOperacao;

@Entity
@Table(name = "TB_OPERACAO")
public class Operacao {
	
	private Cliente cliente;
	
	private TipoOperacao tipo;
	
	@Column(name = "valor_operacao")
	private Double valorOperacao;
	
	@Column(name = "data_operacao")
	private Date dataOperacao;
	
	public Operacao() {
		
	}

	public Operacao(Cliente cliente, TipoOperacao tipo, Double valorOperacao, Date dataOperacao) {
		super();
		this.cliente = cliente;
		this.tipo = tipo;
		this.valorOperacao = valorOperacao;
		this.dataOperacao = dataOperacao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public TipoOperacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoOperacao tipo) {
		this.tipo = tipo;
	}

	public Double getValorOperacao() {
		return valorOperacao;
	}

	public void setValorOperacao(Double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}

	public Date getDataOperacao() {
		return dataOperacao;
	}

	public void setDataOperacao(Date dataOperacao) {
		this.dataOperacao = dataOperacao;
	}
	
	

}
