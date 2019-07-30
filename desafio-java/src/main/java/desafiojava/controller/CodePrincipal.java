package desafiojava.controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
@Path("/Listagem.html") 

public class CodePrincipal{
	
	private String nome;
	private String modalidade;
	private float altura;
	private float peso;
	private float IMC;
	private String situacao;
	
	@POST
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setIMC(float IMC) {
		this.IMC = (peso/altura);
	}
	
	public float getIMC() {
		return IMC;
	}
	
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	public String getModalidade() {
		return modalidade;
	}
	
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public String getSituacao() {
		return situacao;
	}
	
	/* Parte da programação quando o front ficar pronto.
	O atleta só possui seu IMC revelado quando a situacao dele for diferente de
 3 (Estudando)
 Esta classe serve apenas para desenvolvimento das classes para controle dos dados. 
Modalidade / Situação necessitam de um select.
     Conexão com o front e back devem acontecer para manipulação dos dados. */
}
