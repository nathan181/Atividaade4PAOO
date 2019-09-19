package br.com.bossini.fatec_ipi_paoo_observer;

public interface Subject {
	public void addObserver (Observer observer);
	public void removeObserver (Observer observer);
	public void notifyObservers ();
}
