package model;

import java.util.Stack;

public class ClasseExecutoraComandos {
	private Stack<DigitalizarArquivosContrato> comandosFeitos;
	private Stack<DigitalizarArquivosContrato> comandosDesfeitos;
	
	public ClasseExecutoraComandos() {
		// TODO Auto-generated constructor stub
		super();
		this.comandosFeitos = new Stack<DigitalizarArquivosContrato>();
		this.comandosDesfeitos = new Stack<DigitalizarArquivosContrato>();
	}
	
	public String fazer(DigitalizarArquivosContrato digitalArquivos) {
		comandosFeitos.push(digitalArquivos);
		comandosDesfeitos.clear();
		return digitalArquivos.fazer();
	}
	
	public String desfazer() {
		if(comandosFeitos.isEmpty()) {
			return "";
		}
		
		DigitalizarArquivosContrato d = comandosFeitos.pop();
		comandosDesfeitos.push(d);
		return d.desfazer();
	}
	
	public String refazerOperacao() {
		if(comandosDesfeitos.isEmpty()) {
			return "";
		}
		DigitalizarArquivosContrato d = comandosDesfeitos.pop();
		comandosFeitos.push(d);
		return d.fazer();
	}
}
