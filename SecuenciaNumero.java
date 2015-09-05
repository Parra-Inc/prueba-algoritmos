//Solucion numero 1
import java.util.Arrays;

public class SecuenciaNumero {
	private int array[];

	private int[] populateArray(int size) {
		double d;
		array = new int[size];

		for(int x=0; x<size; ++x) {
			d = Math.round(Math.random()*size+1);
			array[x] = (int) d;
		}

		Arrays.sort(array);

		return array;
	}

	public int buscar(int[] array) {
		int tmp = 0;

		for (int i=0; i<array.length; ++i) {
			tmp = array[i];	
			for (int j=i+1; j<array.length; ++j) {
				if(array[j] == tmp) return tmp;			
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		SecuenciaNumero sq = new SecuenciaNumero();
		//llenar el array con numero aleatorios
		int arr[] = sq.populateArray(500); 
		System.out.println("En la secuencia aleatoria se repite el numero: > " + sq.buscar(arr));
		//llenar el array manualmente
		System.out.println("En la secuencia manual se repite el numero: > " + sq.buscar(new int[] {7,5,9,8,12,25,98,5,88,1}));
	}
}
