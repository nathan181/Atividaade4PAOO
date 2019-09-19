package br.com.bossini.fatec_ipi_paoo_observer;

public class MediaHistoricaDisplay implements Observer {
	
	private LinkedList<Double> temps;
	
	public MediaHistoricaDisplay() {
		temps = new LinkedList<Double>();
	}
	
	private double somaTemp = 0;
	public void update(double t, double h, double p) {
		
		if(temps.size()>=10) {
			temps.remove(0);
		}
		temps.add(t);
		
		if (temps.size() == 10) {
			for (Double d : temps) {
				somaTemp += d;
			}
			
			System.out.println("Média histórica ");
			System.out.printf("%.2f\n", (somaTemp/10));
		}
	}
}
