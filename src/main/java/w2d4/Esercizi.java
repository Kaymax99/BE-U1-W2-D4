package w2d4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Esercizi {

	static Product LOTR1 = new Product(1, "The Fellowship of the Ring", "Books", 101);
	static Product LOTR2 = new Product(1, "The Two Towers", "Books", 125);
	static Product LOTR3 = new Product(1, "The Return of the King", "Books", 150);
	static Product LGDE = new Product(1, "La guerra degli elfi", "Books", 100);
	static Product BOTT = new Product(1, "Bottiglia placcata in oro", "Living", 130);
	static Product DPR = new Product(1, "Diapers", "Baby", 20);
	static Product BBR = new Product(1, "Biberon", "Baby", 20);
	static Customer C1 = new Customer("Doge", 1);
	static Customer C2 = new Customer("Much", 1);
	static Customer C3 = new Customer("Very", 2);
	static Customer C4 = new Customer("Wow", 2);
	
	static List<Product> listaOggetti1 = new ArrayList<Product>();
	static List<Product> listaOggetti2 = new ArrayList<Product>();
	static List<Product> listaOggetti3 = new ArrayList<Product>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		esercizio1();
		esercizio2();
	}
	
	public static void esercizio1() {
		System.out.println("Lista attuale: ");
		listaOggetti1.add(LOTR1);
		listaOggetti1.add(LOTR2);
		listaOggetti1.add(LOTR3);
		listaOggetti1.add(LGDE);
		listaOggetti1.add(DPR);
		
		for (Product elem : listaOggetti1) {
			System.out.println(elem.getName() + " - " + elem.getPrice() + "€");
		}
		System.out.println("\n");
		
		System.out.println("Lista filtrata per libri con costo maggiore di 100: ");
		Stream<Product> match = listaOggetti1.stream().filter(element -> element.getCategory() == "Books").filter(element -> element.getPrice() > 100);
		match.forEach(elem -> System.out.println(elem.getName() + " - "+ elem.getPrice() + "€"));
		System.out.println("\n");
	}
	
	public static void esercizio2() {
		System.out.println("\n");
		
		listaOggetti2.add(BOTT);
		listaOggetti3.add(BBR);
		
		Order o1 = new Order(1, listaOggetti1, C1);
		Order o2 = new Order(2, listaOggetti2, C2);
		Order o3 = new Order(3, listaOggetti3, C3);
		
		List<Order> listaOrdini = new ArrayList<Order>();
		listaOrdini.add(o1);
		listaOrdini.add(o2);
		listaOrdini.add(o3);
		
		Stream<Order> streamOrdini = listaOrdini.stream();
		streamOrdini.forEach(elem -> System.out.println(elem.getList()));
		
	}
}
