package Entidades;

public class Produtos {
	
	protected String nome;
	protected Double preco;
	
	
	public Produtos() {
		super();
	}

	
	
	public Produtos(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public String entiqueta() {
		return "Nome: " + nome + " Preco: R$" + preco;
	}
	
}
