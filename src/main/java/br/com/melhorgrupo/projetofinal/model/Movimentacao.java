package br.com.melhorgrupo.projetofinal.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_movimentacao")
public class Movimentacao {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="num_se")
	private int numSeq;
	@Column(name="data_operacao")
	private LocalDate data;
	@Column(name="valor")
	private double valor;
	@Column(name="tipo_operacao")
	private int tipoOperacao;
	@Column(name="descricao", length=255)
	private String descricao;
	@ManyToOne
	@JoinColumn(name="numero_conta")
	private int numConta;
	
	
	public int getNumSeq() {
		return numSeq;
	}
	public void setNumSeq(int numSeq) {
		this.numSeq = numSeq;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getTipoOperacao() {
		return tipoOperacao;
	}
	public void setTipoOperacao(int tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	} 
	
	
	
}
