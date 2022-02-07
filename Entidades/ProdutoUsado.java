package Entidades;

import java.util.Date;

public class ProdutoUsado extends Produtos {
	
	private Date valorFabricacao;

	public ProdutoUsado() {
		super();
	}

	

	public ProdutoUsado(String nome, Double preco, Date valorFabricacao) {
		super(nome, preco);
		this.valorFabricacao = valorFabricacao;
	}



	public Date getValorFabricacao() {
		return valorFabricacao;
	}

	public void setValorFabricacao(Date valorFabricacao) {
		this.valorFabricacao = valorFabricacao;
	}
	
	@Override
	public String entiqueta() {
		
		return super.entiqueta() + " Data de fabricação: " + valorFabricacao;
	}
	
}
