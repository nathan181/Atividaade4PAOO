package br.com.bossini.fatec_ipi_paoo_observer;

public class Ultimas10Display implements Observer {
	
	private LinkedList<Double> temps;
	
	public Ultimas10Display() {
		temps = new LinkedList<Double>();
	}
	
	
	public void update(double t, double h, double p) {
		
		if(temps.size()>=10) {
			temps.remove(0);
		}
		temps.add(t);
		
		if (temps.size() == 10) {
			for (Double d : temps) {
				System.out.printf("%.2f\n", temps[d]);
			}
						
			}
	}
}
