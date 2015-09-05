import java.util.*;

public class Search extends Observable {
	private int arreglo[];
	private static int position;
	//public static int size=20;

	public int getPosition() {
		return position;
	}

	public void iniciarArreglo(int size) {
		double rnd;

		arreglo = new int[size];

		for(int x=0; x<size; ++x) {
			rnd = Math.round(Math.random()*100+1);
			arreglo[x] = (int) rnd;
		}

		Arrays.sort(arreglo);
	}

	public boolean busqueda(int key) {
		int low = 0;
		int high = this.arreglo.length-1;
		int middle;

		while(high>=low) {
			middle=(high+low)/2;

			if(key==arreglo[middle]){
				this.position = middle;
				setChanged();
				return true;
			}

			if(key<arreglo[middle])
				high = middle-1;

			if(key>arreglo[middle])
				low = middle+1;
		}

		return false;
	}
}
