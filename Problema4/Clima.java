import java.util.Observable;

public class Clima extends Observable {
	private int clima;

	public int getClima() {
		return clima;
	}

	public void setClima(int clima) {
		this.clima = clima;
		setChanged();
	}
}
