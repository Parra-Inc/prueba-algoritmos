//Solucion numero 2
import java.util.List;
import java.util.ArrayList;

public class Receta {
	private List<String> ingredientes;

	public Receta() {
		ingredientes = new ArrayList<String>();
		ingredientes.add("Café");
		ingredientes.add("Mantequilla");
		ingredientes.add("Arroz");
		ingredientes.add("Habichuela");
		ingredientes.add("Carne");
		ingredientes.add("Ensalada");
		ingredientes.add("Azucar");
	}

	public static void main(String[] args) {
		Receta receta = new Receta();
		String ing = receta.crearReceta(1250);
		System.out.println(receta.recetaFinal(ing));//output: Azucar y Ensalada y Mantequilla
	}

	public String crearReceta(int num) {
		int n = num;
		int seq[] = new int[]{1,2,4,8,16,32,64};
		String receta = "";

		for(int i=seq.length-1; i>0; i--) {
			if(n >= seq[i]) {
				n -= (n/seq[i] * seq[i]);
				receta += " "+ingredientes.get(i);
			}	
		}
		
		return receta;
	}

	public String recetaFinal(String rec) {
		rec = rec.replaceFirst("\\s+","");
		return rec = rec.replaceAll("\\s+", " y ");
	}
}
