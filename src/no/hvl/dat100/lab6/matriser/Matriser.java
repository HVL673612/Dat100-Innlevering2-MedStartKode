package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
<<<<<<< Updated upstream
=======

		int rows = matrise.length;
		int colu = matrise[0].length;
		int[][] skalertMatrix = new int [rows][colu];
>>>>>>> Stashed changes
		
		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
<<<<<<< Updated upstream
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
=======
		//throw new UnsupportedOperationException("Metoden erLik ikke implementert");
        // om Matrix is rader eller colloner er ikke like
        if (a.length != b.length || a[0].length != b[0].length) {
            return false; 
        }

        // om ele i matrix er ikke lik, vis sann return false
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false; 
                }
            }
        }
        //eller return true
        return true;
>>>>>>> Stashed changes
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		
		//kopiert fra tidlige, bare forandret nav og satt opp at matrisen blir speilet.
		int rows = matrise.length;
		int colu = matrise[0].length;
		int[][] speiletMatrix = new int [rows][colu];
		
		for(int i = 0; i < rows; i++ ) {
			for( int j = 0; j < colu; j++) {
				speiletMatrix[i][j] = matrise[j][i];
			}
		}
		return speiletMatrix;
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		int RaderA = a.length;
		int ColumA = a[0].length;
		int RaderB = a.length;
		int ColumB = a[0].length;
		
		// sjekke om Vi har lov å multiplisere to matriser hvis antall kolonner i den første matrisen er lik antall rekker i den andre
		if(ColumA != RaderB) {
			throw new IllegalArgumentException("feil størelse på matrisene");
		}
		int [][] MulPlyMatrix = new int[ColumA][RaderB];
		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
