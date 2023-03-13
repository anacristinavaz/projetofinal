package br.com.melhorgrupo.projetofinal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_conta")
public class Conta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="numero_conta")
	private int numeroConta;
	@Column(name="agencia", nullable=false)
	private int agencia;
	@Column(name="tipo_conta")
	private int tipoConta;
	@Column(name="saldo")
	private double saldo;
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
