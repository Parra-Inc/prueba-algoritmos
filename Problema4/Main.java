
public class Main {
	public static void main(String[] args) {
		Search s = new Search();
		Observador obs = new Observador();

		s.addObserver(obs);
		s.iniciarArreglo(20);
		System.out.println(s.busqueda(15));
		s.notifyObservers();
	}
}
