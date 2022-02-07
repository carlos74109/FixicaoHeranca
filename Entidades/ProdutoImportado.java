package Entidades;

public class ProdutoImportado extends Produtos {

	private Double frete;

	public ProdutoImportado(String nome, Double preco, Double frete) {
		super(nome, preco);
		this.frete = frete;
	}

	public Double getFrete() {
		return frete;
	}

	public void setFrete(Double frete) {
		this.frete = frete;
	}
	
	public Double precoTotal() {
		return preco + frete;
	}
	
	@Override
	public String entiqueta() {
		return super.entiqueta() + " Preco total: R$" + precoTotal();
	}
	
}
