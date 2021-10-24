package Projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class testeProjeto {


	public static void main(String[] args) {
		
		
		ArrayList<calculos> Pacientes = new ArrayList();		
		
		int opcao, contador=0, posicao=0, posicaoPaciente=0;
		String op; 
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("********SEJA BEM VINDE AO PROGRAM'ÁGUA !!*********");
		
		do
		{
			System.out.println("\n------------------LISTA DE OPÇÕES---------------------");
			System.out.println("\n(1) Deseja adicionar novo paciente.");
			System.out.println("\n(2) Deseja remover paciente do sistema.");
			System.out.println("\n(3) Deseja atualizar alguma informação do paciente.");
			System.out.println("\n(4) Deseja mostrar lista de pacientes.");
			System.out.println("\n(5) Deseja visualizar quantidade necessária de água e IMC de pacientes.");
			System.out.println("\n(0) Deseja sair do programa.");
			System.out.println("\n------------------------------------------------------");
			System.out.println("\nDigite uma opção: ");
			opcao = ler.nextInt();
			
			switch(opcao)
			{
			case 0:
				System.err.println("\nFinalizando o programa...");//Imprime a mensagem com a cor vermelha			
				
			case 1:		
				ler.nextLine(); //limpeza de cashes			
				Pacientes.add(new calculos());
				Pacientes.get(posicaoPaciente).preencher();	
				posicaoPaciente++;
				
				break;				
				
			case 2:
				ler.nextLine();//limpeza de caches
				System.out.println("\nDigite o nome do paciente que deseja remover do sistema");
				String removePaciente = ler.nextLine(); //
				
				for(calculos lista:Pacientes) 
				{
					if(lista.getNome().equals(removePaciente)) 
					{
						Pacientes.remove(lista); 
						System.err.println("\nPaciente removido do sistema!");
						posicaoPaciente--;
						break;
					}					
				}
				break;				
				
			case 3:
				ler.nextLine();//limpeza de caches
				System.out.println("\nDigite o nome do paciente que deseja atualizar as informações:");
				String  verificar = ler.nextLine();

				System.out.println("\n------------------------------------------------------");
				System.out.println("\n(A) Deseja alterar o peso do paciente.");
				System.out.println("\n(B) Deseja alterar a estatura do paciente.");
				System.out.println("\n(C) Deseja alterar a idade do paciente.");
				System.out.println("\n(D) Deseja alterar o gênero do paciente.");
				System.out.println("\n------------------------------------------------------");
				System.out.println("\nDigite uma opção: ");
				op = ler.nextLine();
				
				while(contador<Pacientes.size()) //laço de repetição para percorrer a lista 
				{
					if(Pacientes.get(contador).getNome().equals(verificar)) //condicional para verificar se o atributo pertence ao objeto Pacientes
					{
						posicao=contador;	//posiçao referente ao atributo que foi inserido				
					}
					contador++;
				}
				
				switch (op)  
				{
				case "A":
					System.out.println("\nDigite o peso atual do paciente.");
					float novoPeso = ler.nextFloat();
					
					Pacientes.get(posicao).setPeso(novoPeso);	
					System.out.println("\nInformações com o peso atual do paciente: ");
					Pacientes.get(posicao).imprimirInfo();
					break;
					
				case "B":
					System.out.println("\nDigite a estatura atual do paciente.");
					float novaEstatura = ler.nextFloat();
					
					Pacientes.get(posicao).setEstatura(novaEstatura);	
					System.out.println("\nInformações com a estatura atual do paciente: ");
					Pacientes.get(posicao).imprimirInfo();
					break;					
					
				case "C":
					System.out.println("\nDigite a idade atual do paciente.");
					int novaIdade = ler.nextInt();
					
					Pacientes.get(posicao).setIdade(novaIdade);	
					System.out.println("\nInformações com a idade atual do paciente: ");
					Pacientes.get(posicao).imprimirInfo();
					break;
				
				case "D":
					System.out.println("\nDigite o gênero atual do paciente.");
					String novoGenero = ler.nextLine();
					
					Pacientes.get(posicao).setGenero(novoGenero);
					System.out.println("\nInformações com o gênero atual do paciente: ");
					Pacientes.get(posicao).imprimirInfo();
					break;							
				}
				contador = 0;
				break;		
			
			case 4:
				ler.nextLine();//limpeza de cashes	
				System.out.println("\nLista de pacientes: ");
				
				for (contador=0;contador<Pacientes.size(); contador++) 
				{
					Pacientes.get(contador).imprimirInfo();
				}				
				break;
				
			case 5:
				ler.nextLine();//limpeza de cashes
				System.out.println("\nDigite o nome do paciente que deseja visualizar as informações: ");
				String vizualizar = ler.nextLine();
				for(calculos lista:Pacientes) 
				{
					if(lista.getNome().equals(vizualizar)) 
					{
						lista.QtdAguaNecessaria();
						lista.Imc();
						break;
					}					
				}	
				break;
			default:
				System.err.println("\nPor favor insira uma opção válida!!!"); //Imprime mensagem de erro
			}
		}
		while(opcao != 0);		

	}

}
