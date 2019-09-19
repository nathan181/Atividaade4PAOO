package br.com.bossini.fatec_ipi_paoo_observer;

public class testeestação {
 public static void main(String [] args) {
	 WeatherData estacaoMonitoramento = new WeatherData();
	 CurrentConditionsDisplay ccd = new CurrentConditionsDisplay();
	 StatsDisplay sd = new StatsDisplay();
	 ForecastDisplay fd = new ForecastDisplay();
	 estacaoMonitoramento.addObserver(ccd);
	 estacaoMonitoramento.addObserver(sd);
	 estacaoMonitoramento.addObserver(fd);
	 estacaoMonitoramento.iniciar();
 }
}
