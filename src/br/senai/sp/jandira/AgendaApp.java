package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanodeSaude;


public class AgendaApp {

	public static void main(String[] args) {
			 
		
		Especialidade especialidade = new Especialidade();
		Especialidade especialidade2 = new Especialidade();
		Especialidade especialidade3 = new Especialidade();
		Especialidade especialidade4 = new Especialidade();
		Especialidade especialidade5 = new Especialidade();
		
		
		
		especialidade.setNome("cardiologia");
		especialidade2.setNome("otorrinolaringologista");
		especialidade3.setNome("gastroenterologia");
		especialidade4.setNome("fisioterapia");
		especialidade5.setNome("clínica geral");
		
		
		
		
		especialidade.setDescriçao("Cardiologia é a especialidade médica que se ocupa do diagnóstico e tratamento das doenças que acometem o coração bem como os outros componentes do sistema circulatório");
		especialidade2.setDescriçao("A otorrinolaringologia é uma especialidade médica com características clínicas e cirúrgicas.");
		especialidade3.setDescriçao("gastroenterologia é para o estomago");
		especialidade4.setDescriçao("fisioterapia é para o físico");
		especialidade5.setDescriçao("clínica geral serve para o geral");
		
		System.out.println(especialidade.getNome() + "\n" + especialidade.getDescriçao() + "\n" + "-------------------------" + "\n" + especialidade2.getNome() + "\n" + especialidade2.getDescriçao() + "\n"
				+ "-------------------------" + "\n" + especialidade3.getNome() +"\n" + especialidade3.getDescriçao() + "\n------------------" + "\n" + especialidade4.getNome() + "\n" + especialidade4.getDescriçao() +
				"\n----------------------" + "\n" + especialidade5.getNome() + "\n" + especialidade5.getDescriçao() + "\n-----------------");
		
		
		
		
		// Criar dois médicos 
		
		Especialidade[] especialidades = {especialidade3, especialidade4 };
		Medico medico1 = new Medico();
		medico1.setNome("Otávio Alfonso");
		medico1.setEmail("Otávinho@gmail.com");
		medico1.setCrm("<33333333");
		medico1.setTelefone("3333333333");
		Especialidade[] especialidades1 = { 
				especialidade, 
				especialidade5};
		medico1.setEspecialidade(especialidades1);
		
		Medico medico2 = new Medico();
		medico2.setNome("Bianca Leão");
		medico2.setEmail("Bianquinha@gmail.com");
		medico2.setCrm("<3333333333");
		medico2.setTelefone("888888888");
		Especialidade[] especialidades2 = { especialidade, 
		especialidade4, especialidade5	};
		medico2.setEspecialidade(especialidades2);
		
		// Exibir dados dos dois médicos 
		
		

		
			System.out.println("Nome do médico: " + medico1.getNome() + "\n" + "CRM do médico:" + medico1.getCrm() + "\n" + "Email do médico: " + medico1.getEmail()  + "\n" + "Telefone do médico:" + medico1.getTelefone());
			System.out.printf("Especialidade:");
		int i = 0;
		while (i < medico1.getEspecialidade().length ) {
			System.out.printf(medico1.getEspecialidade()[i].getNome() + " ");
		
		i++;}
		
		System.out.println("\n" + "----------------------");
		System.out.println("Nome do médico: " + medico2.getNome() + "\n" + "CRM do médico:" + medico2.getCrm() + "\n" + "Email do médico: " + medico2.getEmail()  + "\n" + "Telefone do médico:" + medico2.getTelefone());
		System.out.printf("Especialidade:");
	    int b = 0;
	    while (b < medico2.getEspecialidade().length ) {
		System.out.printf(medico2.getEspecialidade()[b].getNome() + " ");
	
	b++;}
		
	    // Criar dois endereços 
	    
	    Endereco endereco1 = new Endereco();
		endereco1.setBairro("Vila São Nicolau");
		endereco1.setCep("06620-20");
		endereco1.setCidade("Jandira");
		endereco1.setComplemento(" ");
		endereco1.setEstado("SP");
		endereco1.setLogradouro("Rua Guarujá");
		endereco1.setNumero("85");
		
		
		Endereco endereco2 = new Endereco();
		endereco2.setBairro("Vale do Sol");
		endereco2.setCep("06620-60");
		endereco2.setCidade("Barueri");
		endereco2.setComplemento(" Prédio ");
		endereco2.setEstado("SP");
		endereco2.setLogradouro("Rua Maranduva");
		endereco2.setNumero("110");
		
		
		//System.out.println("\n" + "--------------" + "\n"+ endereco1.getBairro() + "\n "+ endereco1.getCep() + "\n" + endereco1.getCidade()  + endereco1.getComplemento() + "\n" +endereco1.getLogradouro() + "\n"+ endereco1.getNumero());
		
		// Criando planos de saúde 
		
				PlanodeSaude planoDeSaude1 = new PlanodeSaude();
				planoDeSaude1.setCategoria("Ouro");
				planoDeSaude1.setNumeroCarteirinha("18888999");
				planoDeSaude1.setOperadora("Amil");
				planoDeSaude1.setValidadePlano(LocalDate.of(2025, 9, 23));
				
				PlanodeSaude planoDeSaude2 = new PlanodeSaude();
				planoDeSaude2.setCategoria("Bronze");
				planoDeSaude2.setNumeroCarteirinha("17788999");
				planoDeSaude2.setOperadora("Unimed");
				planoDeSaude2.setValidadePlano(LocalDate.of(2023, 8, 13));
	
		
//		JOptionPane.showMessageDialog(null, especialidade2.getNome());
//		System.out.println(especialidade.getNome());
//		
//		JOptionPane.showMessageDialog(null, especialidade2.getDescriçao());
//		System.out.println(especialidade.getDescriçao());
		
		
			Paciente paciente1 = new Paciente();
			paciente1.setNome("Bibis");
			paciente1.setCpf("06620-020");
			paciente1.setDataDeNascimento(LocalDate.of(2005, 11, 6));
			paciente1.setRg("33356662");
			paciente1.setTelefone("11958667824");
			paciente1.setPlanoDeSaude(planoDeSaude1);
			paciente1.setEndereco(endereco1);
			
			Paciente paciente2 = new Paciente();
			paciente2.setNome("Gustavo");
			paciente2.setCpf("06620-020");
			paciente2.setDataDeNascimento(LocalDate.of(1997, 11, 6));
			paciente2.setRg("333562");
			paciente2.setTelefone("1195867724");
			paciente2.setPlanoDeSaude(planoDeSaude2);
			paciente2.setEndereco(endereco2);
			
			System.out.println("\n" + "--------------" + "\n" + paciente2.getNome() + "\n" + paciente1.getCpf() + "\n" 
					+ paciente2.getRg() + "\n" + paciente2.getTelefone() + "\n" + paciente2.getDataDeNascimento() + "\n" + paciente2.getEndereco().getEstado()
					 );
			System.out.println("Operadora:" + paciente2.getPlanoDeSaude().getOperadora());
			System.out.println("Categoria:" + paciente2.getPlanoDeSaude().getCategoria());
			
			// Exibir um relátorio com dados do paciente - nome, data de nascimento, telefone, cidade, estado, operadora do plano de saúde
			
			System.out.println( "--------------");
			System.out.println("Nome: " + paciente1.getNome());
			System.out.println("Data de nascimento:" + paciente1.getDataDeNascimento());
			System.out.println("Telefone:" + paciente1.getTelefone());
			System.out.println("Cidade: " + paciente1.getEndereco().getCidade());
			System.out.println("Estado:" + paciente1.getEndereco().getEstado());
			System.out.println("Operadora:" + paciente1.getPlanoDeSaude().getOperadora());
			
			// Agendar para o paciente 1 uma consulta com fisioterapeuta 
			// para o dia 27/09/2023 as 15:45
			
			Agenda agenda1 = new Agenda();
			agenda1.setPaciente(paciente1);
			agenda1.setMedico(medico2);
			agenda1.setHorarioDaConsulta(LocalTime.of(15, 45));
			agenda1.setDataDaConsulta(LocalDate.of(2023, 9, 27));
			agenda1.setEspecialidade(especialidade4);
			
			// Exibir agenda do paciente 1 
			
			System.out.println( "--------------");
			System.out.println("Nome do paciente: " + agenda1.getPaciente().getNome());
			System.out.println("Data da consulta: " + agenda1.getDataDaConsulta());
			System.out.println("Horário da consulta: " + agenda1.getHorarioDaConsulta());
			System.out.println("Médico: " + agenda1.getMedico().getNome());
			System.out.println("Nome da especialidade: " + agenda1.getEspecialidade().getNome());
			System.out.println("Plano de saúde: " + agenda1.getPaciente().getPlanoDeSaude( ).getOperadora());
			System.out.println("Telefone do paciente: " + agenda1.getPaciente().getTelefone());
	}

}
