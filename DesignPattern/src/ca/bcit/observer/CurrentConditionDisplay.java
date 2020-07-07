package ca.bcit.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, IDisplayElement  {

	private Observable observable;
	private float temparature;
	private float humidity;
	
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.temparature = weatherData.getTemparature();
			this.humidity = weatherData .getHumidity();
			display();
		}
		
	}

	@Override
	public void display() {
		System.out.println("Current conditions : " + temparature + "F degrees and  " + humidity + "% humidity");		
	}

}
