package ar.com.educacionit.D4;

public class MainCollection {
	public static void main(String[] args) {
		CollectionCustom<String> cc = new CollectionCustom<String>();
		
	
		System.out.println("Se creo el array con " + cc.size() + " elementos.");
		
	
		cc.add("10");
		cc.add("20");
		cc.add("30");
		cc.add("40");
		System.out.println("\nSe agregaron " + cc.size() + " elementos. => " + cc);
		
	
		cc.addFirst("1");
		System.out.println("\nAdd 1 first => " + cc);
		
	
		cc.addLast("50");
		System.out.println("\nAdd 50 at the end => " + cc);
				
	
		cc.remove("20");
		System.out.println("\nSe removio el 20. => " + cc);
		
	
		cc.removeAll();
		System.out.println("\nClean list");
		
	
		System.out.println("\nEmpty? => " + cc.empty());
	}
}