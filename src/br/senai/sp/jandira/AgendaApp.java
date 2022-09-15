package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanodeSaude;


public class AgendaApp {

	public static void main(String[] args) {
		
		Especialidade especialidade = new Especialidade();
		Especialidade especialidade2 = new Especialidade();
		
		especialidade.setNome("cardiologia");
		especialidade2.setNome("otorrinolaringologista");
		
		
		
		especialidade.setDescriçao("Cardiologia é a especialidade médica que se ocupa do diagnóstico e tratamento das doenças que acometem o coração bem como os outros componentes do sistema circulatório");
		especialidade2.setDescriçao("A otorrinolaringologia é uma especialidade médica com características clínicas e cirúrgicas.");
		
		
		
		
		JOptionPane.showMessageDialog(null, especialidade2.getNome());
		System.out.println(especialidade.getNome());
		
		JOptionPane.showMessageDialog(null, especialidade2.getDescriçao());
		System.out.println(especialidade.getDescriçao());
		
		

	}

}
