package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Paciente {

	private LocalDate dataDeNascimento;
	private String telefone;
	private String rg;
	private String cpf;
	private Endereco endereco;
	private PlanodeSaude planoDeSaude;
	private String nome;

	// Métodos de acesso

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public PlanodeSaude getPlanoDeSaude() {
		return planoDeSaude;
	}

	public void setPlanoDeSaude(PlanodeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}

}
