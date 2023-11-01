package util;

public class Moeda {
	public final double IOF = 0.06;
	
	public double dolar;
	public double quantity;

	public double reais() {
		return (dolar * quantity * IOF) + (dolar * quantity);
	}
}
