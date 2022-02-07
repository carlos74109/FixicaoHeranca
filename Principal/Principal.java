package Principal;

import java.util.Date;

import Entidades.ProdutoImportado;
import Entidades.ProdutoUsado;
import Entidades.Produtos;

public class Principal {

	public static void main(String[] args) {
		
		Date data = new Date();
		
		Produtos prod = new Produtos("Tv", 1500.0);
		Produtos prodI = new ProdutoImportado("Notebook", 1005.0, 95.0);
		Produtos prod2 = new ProdutoUsado("ps5", 399.99, data);
		System.out.println(prod.entiqueta());
		System.out.println(prodI.entiqueta());
		System.out.println(prod2.entiqueta());

	}

}
