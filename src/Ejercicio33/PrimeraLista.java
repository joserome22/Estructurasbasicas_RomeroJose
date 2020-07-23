package Ejercicio33;

import java.util.ArrayList;
import java.util.List;

public class PrimeraLista {

	public static void main(String[] args) {
		
		List<String> letters=new ArrayList();
		letters.add("a");
		letters.add("b");
		letters.add("c");
		System.out.println(letters.get(0));
		System.out.println(letters.get(1));
		System.out.println(letters.get(2));
		System.out.println(letters.size());
		letters.add(0,"x");
		System.out.println(letters.get(0));
		
		

	}

}
