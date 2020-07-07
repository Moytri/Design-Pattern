package ca.bcit.observer;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class WeatherData extends Observable {

	private float temparature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {}
	
	public void measurementChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurement(float temparature, float humidity, float pressure) {
		this.temparature = temparature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	public float getTemparature() {
		return temparature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
