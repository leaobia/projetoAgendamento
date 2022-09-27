package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {
	
	// atributos 
	
	private String nome;
	private String descriçao;

	//Construtores
		//Construtor é chamado sempre que eu uso o new
		public Especialidade(String nome) {
			this.nome = nome;
			
		}
		
		//Construtor defull, esse construtor tem o nome de classe
		public Especialidade(String nome, String descriçao) {
			this.nome = nome;
			this.descriçao = descriçao;
			
		}

		public Especialidade() { // Construtor default, o padrão
			
			
		}
	
	

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
