package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanodeSaude {

	private String operadora;
	private String categoria;
	private String numeroCarteirinha;
	private LocalDate validadeDoPlano;

	// Métodos de acessos aos atributos

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setNumeroCarteirinha(String numeroCarteirinha) {
		this.numeroCarteirinha = numeroCarteirinha;
	}

	public String getNumeroCarteirinha() {
		return numeroCarteirinha;
	}

	public void setValidadePlano(LocalDate validadeDoPlano) {
		this.validadeDoPlano = validadeDoPlano;
	}

	public LocalDate getValidadeDoPlano() {
		return validadeDoPlano;
	}

}
