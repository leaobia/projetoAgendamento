package br.senai.sp.jandira.testes;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanodeSaude;

public class TesteObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Especialidade e1 = new Especialidade("Cardiologia");
		e1.setNome("cardiologia");
		e1.setDescriçao("Não deixa ter um ataque");
                            
		
		// posicao 1
		Especialidade e2 = new Especialidade("Gastroenterologia");
		e2.setNome("Gastroenterogia");
		e2.setDescriçao("Não deixa ficar com dos de barriga");
		
		Especialidade e3 = new Especialidade();
		e3.setNome("QUALQUER COISA");
		
		Especialidade e4 = new Especialidade("Cirurgiã", "uma boa médica");
                
                             Especialidade e5 = new Especialidade();
		e5.setNome("Especialidade 5");
                
                            System.out.println("Total  de especialidades  ------------------------->" + e1.getContador());
                            
                           System.out.println(e1.getCódigo() + "----" + e1.getNome());
                           System.out.println(e2.getCódigo() + "----" + e2.getNome());
                           System.out.println(e3.getCódigo() + "----" + e3.getNome());
                           System.out.println(e4.getCódigo() + "----" + e4.getNome());
                           System.out.println(e5.getCódigo() + "----" + e5.getNome());
                          
                  
                            
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		especialidades.add(e1);
		especialidades.add(e2);
		especialidades.add(e3);
		System.out.println(especialidades.size());
		
		// Imprimir nos consoles os nomes das especializades armazenadas no ArrayList
		System.out.println("-------WHILE----------");
		int i = 0; 
		while (i < especialidades.size()) {
			System.out.println(especialidades.get(i).getNome());
			i++;
		}
		
		System.out.println("-------FOR----------");
		
		// Utilização do for para iteração no ArrayList
		
		for (int x = 0; x < especialidades.size(); x++) {
			System.out.println(especialidades.get(x).getNome());
		}
		
		System.out.println("-------FOR EACH----------");
		
		// FOR EACH -> para cada
		
		for (Especialidade e : especialidades) {
			System.out.println(e.getNome());
			
		}
		
		// Criar 3 planos de saúde e armazenar em um ArrayList e exibir o nome da operadora
		
		System.out.println("Criação de novos planos");

		PlanodeSaude planoDeSaude11 = new PlanodeSaude();
		planoDeSaude11.setOperadora("Amil");
		
		PlanodeSaude planoDeSaude22 = new PlanodeSaude();
		planoDeSaude22.setOperadora("Unimed");
		
		PlanodeSaude planoDeSaude33 = new PlanodeSaude();
		planoDeSaude33.setOperadora("Notredame");
		
		ArrayList<PlanodeSaude> planos = new ArrayList<>();
		planos.add(planoDeSaude11);
		planos.add(planoDeSaude22);
		planos.add(planoDeSaude33);
		
		System.out.println("-------FOR EACH PLANOS----------");
		
		for (PlanodeSaude o : planos ) {
			System.out.println(o.getOperadora());
			System.out.println(o.getQuantidade());
			System.out.println(PlanodeSaude.getQuantidade());
			
			AgendaApp.main(args);
			System.out.println(PlanodeSaude.getQuantidade());
		}
		
		
	}

}
