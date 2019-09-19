package br.com.bossini.fatec_ipi_paoo_observer;

import java.util.List;
import java.util.LinkedList;

public class Temperatura implements Observer {
	private List <Temperatura>temperaturas;
	
	public Temperatura(){
		temperaturas = new LinkedList<Temperatura>();
	}
	public void update(Temperatura t) {
		if(temperaturas.size()>=10) {
			temperaturas.remove(0);
		}
		else {
			temperaturas.add(t);
		}
	}
	@Override
	public void update(double t, double h, double p) {
		// TODO Auto-generated method stub
		
	}

}
