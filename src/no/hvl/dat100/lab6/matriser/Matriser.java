package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int [] rad: matrise) {
			for(int element: rad) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String strMatrix = "";
		//Row acros
		for (int [] rad: matrise) {
			//elements in row
			for(int element: rad) {
				//add ele i string
				strMatrix += element;
				// add space utenom når ele == sistete tallet i en rad
				//kan bli broblem vis matrisen frk. {1, 2, 2} da ville denne kodden ikke ligetill mellomromm mellom
				// 2 og 2. kan fikse med å alltid ligge mellomrom till, og fjerene mellomromet før \n med no mer kode
				if (element != rad[rad.length-1]);{
					strMatrix += " ";
				}
			}
			//ny linje
			strMatrix += "\n";
		}
		return strMatrix;
	}		

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		// TODO
		//throw new UnsupportedOperationException("Metoden skaler ikke implementert");
		int rows = matrise.length;
		int colu = matrise[0].length;
		int[][] skalertMatrix = new int [rows][colu];
		
		for(int i = 0; i < rows; i++ ) {
			for( int j = 0; j < colu; j++) {
				skalertMatrix[i][j] = matrise[i][j] * tall;
			}
		}
		return skalertMatrix;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		//throw new UnsupportedOperationException("Metoden erLik ikke implementert");
        // Sjekk om matrisene har samme antall rader og kolonner
        if (a.length != b.length || a[0].length != b[0].length) {
            return false; // Matrisene er ikke like hvis dimensjonene er ulike
        }

        // Sjekk element for element om matrisene er like
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false; // Matrisene er ikke like hvis et element er ulikt
                }
            }
        }
        return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

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
		if (a[0].length != b.length) {
			throw new IllegalArgumentException("feil størelse på matrisene, nr i koloner i a == nr i rad i b");
		        }
		int[][] c = new int[a.length][b[0].length];
  
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
					int sum = 0;
		                for (int k = 0; k < a[0].length; k++) {
		                    sum += a[i][k] * b[k][j];
		                }
		                c[i][j] = sum;
					}
				}
		return c;
		
		}			
	}

