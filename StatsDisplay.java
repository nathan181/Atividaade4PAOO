package br.com.bossini.fatec_ipi_paoo_observer;

public class StatsDisplay implements Observer {
	private double historicoTemps;
	private int qtdeTemps;
	public void update(double t, double h, double p) {
          historicoTemps += t;
          qtdeTemps+= 1;
          System.out.println("média");
          System.out.printf("%.2fC\n", (historicoTemps/qtdeTemps));
	}
}

