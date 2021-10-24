package Projeto;

import java.util.Scanner;

public class Formulario {

	private String nome;
	private String genero;
	private int idade;
	private float estatura;
	private float peso;
	
	Scanner leia = new Scanner (System.in);		
	
	public Formulario()
	{
		//Construtor instanciando objeto Formulário
	}
	
	public void preencher()
	{		
		
		System.out.println("\nInsira o nome do paciente:");
		nome = leia.next(); // Não aceita nome composto
		leia.nextLine();
		System.out.println("\nInsira o gênero do paciente:");
		genero = leia.next();
		System.out.println("\nInsira a idade do paciente:");
		idade = leia.nextInt();
		System.out.println("\nInsira a altura do paciente:");
		estatura = leia.nextFloat();
		System.out.println("\nInsira o peso do paciente:");
		peso = leia.nextFloat();
				
	}

	public void imprimirInfo() 
	{
		System.out.println("Nome: "+nome
				          +"\nIdade: "+idade
				          +"\nGênero: "+genero
				          +"\nEstatura: "+estatura
				          +"\nPeso: "+peso
				          +"\n");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
}

