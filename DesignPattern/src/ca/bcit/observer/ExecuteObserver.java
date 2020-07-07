package ca.bcit.observer;

import java.util.Observable;
import java.util.Observer;

public class ExecuteObserver {

	public static void main(String[] args) {
		WeatherData observable = new WeatherData();
		Observer observer = new CurrentConditionDisplay(observable);
		observable.addObserver(observer);
		observable.setMeasurement(30.00f, 20.00f, 10.00f);
	}

}
