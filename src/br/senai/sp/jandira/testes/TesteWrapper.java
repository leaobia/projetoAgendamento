package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =5;
		
		Integer b = 5;
		
		Double x = 2.9;
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		
		// posiçao 0
		Especialidade e1 = new Especialidade();
		//e1.setNome("Cardiologia");
		e1.setDescriçao("Não deixa ter um ataque");
		
		// posicao 1
		Especialidade e2 = new Especialidade("Gastroenterologia");
		e2.setNome("Gastroenterogia");
		e2.setDescriçao("Não deixa ficar com dos de barriga");
		
		especialidades.add(e1);
		especialidades.add(e2);
		
		// posição 2
		Especialidade e3 = new Especialidade("Fisioterapia");
		e3.setNome("Fisioterapia");
		e3.setDescriçao("Não deica ficar com dor nas costas");
		
		especialidades.add(e3);
		
		// posição 3
		Especialidade e4 = new Especialidade("Clínico Geral");
		e4.setNome("Clinico Geral");
		e4.setDescriçao("Sabe de tudo de tudo um pouco");
		
		// Vetor Simples : Especialidade[] especialidades = {e1,e2,e3,e4};
		//Especialidade[4] = e5; Não finciona nao existe a posição 4
		Especialidade e5 = new Especialidade();
		e5.setNome("Pediatria");
		e5.setDescriçao("Cuida das crianças");
		
		especialidades.add(e4);
		especialidades.add(e5);
		
		System.out.println(especialidades.size());
		
		//Integer é uma classe que recebe um objeto
		ArrayList<Integer> notas = new ArrayList<>();
		notas.add(50);
		notas.add(12);
		notas.add(25);
		notas.add(28);
		//System.out.println(notas.size());
		
		System.out.println(notas.size());
		
		//Queremos ver o nome da especialidade na posição 3 do Arrayliste Especialidades
		
		System.out.println(especialidades.get(3).getNome());
		
		especialidades.get(1).setNome("Teste");
		System.out.println(especialidades.get(1).getNome());
		
		//Especialidades Quarda o nome do local na memoria e nova recebe o objeto que esta dentro da memoria
		Especialidade nova = especialidades.get(2);

		System.out.println(nova.getNome());
		
		Especialidade xy = new Especialidade("xy");
		System.out.println(xy.getNome());
		
	}


	}


