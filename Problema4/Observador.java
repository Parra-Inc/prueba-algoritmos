import java.util.Observable;
import java.util.Observer;

public class Observador implements Observer {
	
	@Override
	public void update(Observable observable, Object value) {
		System.out.println("Se encontro el elemento en la posición: "+
			((Search) observable).getPosition());
	}
}
