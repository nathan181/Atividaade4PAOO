package br.com.bossini.fatec_ipi_paoo_observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class WeatherData implements Subject {
	
	//CurrentConditionsDisplay currentConditionsDisplay;
	//StatsDisplay statsDisplay;
	//ForecastDisplay forecastDisplay;
	
	private List <Observer>observers;
	private Random gerador=new Random();
	private double temperature, humidity, pressure;
	
	public WeatherData() {
		observers = new LinkedList<Observer>();
	}
	
	public double getTemperature () {
		//throw new UnsupportedOperationException();
		return this.temperature;
	}
	public double getHumidity () {
		//throw new UnsupportedOperationException();
		return this.humidity;
	}
	public double getPressure () {
		//throw new UnsupportedOperationException();
		return this.pressure;
	}
	
	public void measurementsChanged () {
		notifyObservers();
	}
	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
		
	}
	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
		
	}
	@Override
	public void notifyObservers() {
		for(Observer o: observers) {
			o.update(getTemperature(), getHumidity(), getPressure());
		}
		
	}
	
	public void setMeasurements() {
		this.temperature = 10 + gerador.nextDouble() * 30;
		this.humidity = gerador.nextDouble();
		this.pressure = gerador.nextDouble() * 500 + 500;
		measurementsChanged();
	}
	
	public void iniciar() {
		while(true) {
			setMeasurements();		
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
}
