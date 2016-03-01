package br.aeso.aula05.cliente;
import br.aeso.aula05.fachada.*;
public class TelaCadastroCliente {
	
	public static void main(String[] args){
		
		  Cliente cliente = new Cliente("1258","Randerson","094.062.724-82");
		 
		// System.out.println(cliente);
		 
		 Fachada fachada = new Fachada();
		 fachada.cadastrarCliente(cliente);
		 
	       
	}
		
		

}
