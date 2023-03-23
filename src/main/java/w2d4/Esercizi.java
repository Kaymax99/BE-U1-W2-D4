package w2d4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Esercizi {

	static Product LOTR1 = new Product(1, "The Fellowship of the Ring", "Books", 101);
	static Product LOTR2 = new Product(1, "The Two Towers", "Books", 125);
	static Product LOTR3 = new Product(1, "The Return of the King", "Books", 150);
	static Product LGDE = new Product(1, "La guerra degli elfi", "Books", 100);
	static Product BOTT = new Product(1, "Bottiglia placcata in oro", "Living", 130);
	static Product DPR = new Product(1, "Diapers", "Baby", 20);
	static Product BBR = new Product(1, "Biberon", "Baby", 20);
	static Product CAR = new Product(1, "Modellino Lamborghini", "Boys", 20);
	static Product BIKE = new Product(1, "Modellino Kawasaki Ninja", "Boys", 20);
	static Customer C1 = new Customer("Doge", 1);
	static Customer C2 = new Customer("Much", 1);
	static Customer C3 = new Customer("Very", 2);
	static Customer C4 = new Customer("Wow", 2);
	
	static List<Product> listaOggetti1 = new ArrayList<Product>();
	static List<Product> listaOggetti2 = new ArrayList<Product>();
	static List<Product> listaOggetti3 = new ArrayList<Product>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		listaOggetti2.add(BOTT);
		listaOggetti2.add(CAR);
		listaOggetti3.add(BBR);
		listaOggetti3.add(BIKE);

		Order o1 = new Order(1, "s1", LocalDate.of(2021, 3, 12), LocalDate.of(2021, 3, 14), listaOggetti1, C1);
		Order o2 = new Order(1, "s2", LocalDate.of(2021, 3, 12), LocalDate.of(2021, 3, 14), listaOggetti2, C2);
		Order o3 = new Order(1, "s3", LocalDate.of(2021, 3, 12), LocalDate.of(2021, 3, 14), listaOggetti3, C3);
		
		List<Order> listaOrdini = new ArrayList<Order>();
		listaOrdini.add(o1);
		listaOrdini.add(o2);
		listaOrdini.add(o3);
		CAR.toString();
		esercizio1();
		esercizio2(listaOrdini);
		esercizio3(listaOrdini);
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
		Stream<Product> match = listaOggetti1.stream()
				.filter(element -> element.getCategory() == "Books")
				.filter(element -> element.getPrice() > 100);
		match.forEach(elem -> System.out.println(elem.getName() + " - "+ elem.getPrice() + "€"));
		System.out.println("\n");
	}
	
	public static void esercizio2(List<Order> list) {
		System.out.println("\n Esercizio 2");
		List<Product> l = list.stream()
				.map(o -> {return o.getProducts();})
				.flatMap(p -> p.stream())
				.filter(p -> p.getCategory().equals("Baby"))
				.collect(Collectors.toList());
		l.forEach(elem -> System.out.println(elem.toString()));
	}
	
	public static void esercizio3(List<Order> list) {
		System.out.println("\n Esercizio 3");
		List<Product> l = list.stream()
				.map(o -> {return o.getProducts();})
				.flatMap(p -> p.stream())
				.filter(p -> p.getCategory().equals("Boys"))
				.collect(Collectors.toList());
		l.forEach(elem -> elem.setPrice((elem.getPrice() - (elem.getPrice()* 0.1))));
		l.forEach(elem -> System.out.println(elem.toString()));
	}
}
