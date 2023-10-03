package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for(int i = 0; i <tabell.length; i++) {
			System.out.print(i+" ");
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		if (tabell == null) {
			return "[]";
		}
		else{
			String strArr = "[";
			for(int i = 0; i <tabell.length; i++) {
		
			strArr = strArr + tabell[i];
				
			if(i<tabell.length-1) {
					strArr= strArr + ",";
			}
		}
	
			strArr= strArr + "]";
			return strArr;
	}
}
		

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;
		
		//med utvided forløkke
		for(int num: tabell) {
			sum += num;
		}
		return sum;
		
//		//med for løkke
//		for(int i = 0; i <tabell.length; i++) {
//			sum += tabell[i];
//		}
//		return sum;
//		
//		//med while løkke
//		int x = 0;
//		while(x < tabell.length) {
//			sum +=tabell[x];
//			x++;
//		}
//		return sum;
	}		

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for(int i = 0; i <tabell.length; i++) {
			if (tabell[i] == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		for(int i = 0; i <tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
		
	}


	// f)
	public static int[] reverser(int[] tabell) {

		int lengde = tabell.length;
		int i = lengde - 1;
		int nypos = 0;
		int[] revtab = new int[lengde];
		while(i >= 0 && nypos < lengde) {
			revtab[nypos] = tabell[i];
			i--;
			nypos++;
		}
		return revtab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int i = 0;
		boolean sorted = true;
		while (i < tabell.length-1) {
			if(tabell[i]>tabell[i+1]) {
				sorted = false;
			}
			i++;
		}
		return sorted;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		// TODO
		//throw new UnsupportedOperationException("Metoden settSammen ikke implementert");
		int n1 = tabell1.length;
		int n2 = tabell2.length;
		int[] combTab = new int [n1+n2];
		for(int i = 0; i < n1; i++) {
			combTab[i] = tabell1[i];
		}
		for(int i = 0; i < n2; i++) {
			combTab[n1 + i] = tabell2[i];
		}	
		return combTab;
	}
}
