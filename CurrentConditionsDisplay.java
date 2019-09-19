package br.com.bossini.fatec_ipi_paoo_observer;

import java.text.NumberFormat;

public class CurrentConditionsDisplay implements Observer{
	private NumberFormat percentFormat = NumberFormat.getPercentInstance();
	public void update (double t, double h, double p) {
		System.out.println("condicoes atuais");
		System.out.printf("temp: %.2f, hum : %s, pres: %.2f", t, percentFormat.format(h) , p);
	}
}
