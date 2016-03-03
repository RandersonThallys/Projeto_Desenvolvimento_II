package br.aeso.aula05.cliente;

import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class Cliente {

	
	private String codigo;
	private String nome;
	private String cpf;


	public Cliente(String codigo, String nome, String cpf){
		
	
	
	this.codigo = codigo;
	this.nome = nome;
	this.cpf = cpf;
	
	
	
	}
	
	public String getcodigo(){
	return codigo;
	
	}
	
	public  String getNome(){
		return nome;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}

	public void serNome(String nome){
		this.nome = nome;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
	}
	
	
	public String cpfFormatado() {
		return cpf.substring(0, 3) + '.' + cpf.substring(3, 6) + '.' + 
			   cpf.substring(6, 9)+ '-' + cpf.substring(9, 11);
	}
	
		
	@Override
	public String toString(){
		return "Cliente [codigo=" + codigo +", nome=" + nome + ", cpf=" + cpf +"]";
	}

	public String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
