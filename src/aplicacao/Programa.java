package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Produto;
import util.ProdutoPredicado;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Produto> lista = new ArrayList<>();

		lista.add(new Produto("TV", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Notebook", 1200.00));
		lista.add(new Produto("Tablet", 450.00));
		lista.add(new Produto("HD Case", 80.90));

		lista.removeIf(Produto::staticProdutoPredicado);

		for (Produto p : lista) {
			System.out.println(p);
		}
	}

}
