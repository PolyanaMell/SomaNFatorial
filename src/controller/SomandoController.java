package controller;

public class SomandoController {
	
	public SomandoController() {
		super();
	}
	
	public int soma(int numero) {
		//Condição de parada deve ser 0
	 if (numero == 0) {
      return 0;	
      //Caso seja diferente de 0, deverá somar numero + (numero - 1)
	 }else {
		 //numero + (numero - 1)
		 return numero + soma(numero - 1);
	 }
	 
}
}