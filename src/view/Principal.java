package view;

import java.util.*;

//Importando a classe de controle do Fatorial
import controller.SomandoController;

public class Principal {

	public static void main(String[] args) {
		//Método construtor
		SomandoController sm = new SomandoController();
		//Definindo um valor para o fatorial
		
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		System.out.println("Digite o número:");
		numero = sc.nextInt();
		//variavel que recebe o resultado
		int resultado = sm.soma(numero);
		System.out.println("Resultado: "+resultado);

	}

}