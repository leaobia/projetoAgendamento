package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

	private String nome;
	private String descriçao;

	// Métodos de acesso aos atributos

	public void setNome(String nome) {
		if (nome.length() >= 3) {
			this.nome = nome;
		} else {

			JOptionPane.showMessageDialog(null, nome + " não é um nome válido \n deve conter pelo menos três letras",
					"Corrija o nome", JOptionPane.ERROR_MESSAGE);
		}
	}

	public String getNome() {
		return nome;

	}

	///

	public void setDescriçao(String descriçao) {
		if (descriçao.length() >= 10) {
			this.descriçao = descriçao;
		} else {

			JOptionPane.showMessageDialog(null,
					nome + " não é uma descrição válida \n deve conter pelo menos dez letras", "Escrita insuficiente",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public String getDescriçao() {
		return descriçao;
	}

}
