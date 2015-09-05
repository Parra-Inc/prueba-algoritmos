
public class Main {
	public static void main(String[] args) {
		Clima clima = new Clima();
		Observador observador = new Observador();

		clima.addObserver(observador);
		clima.setClima(32);
		clima.notifyObservers();
	}
}
