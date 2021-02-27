package aggregators;

import client.StockFileApplication;
import fileprocessors.StockFileReader;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import static client.StockFileApplication.populateStockFileData;

public class MinAggregator extends Aggregator{

	public MinAggregator() {
	}

	public MinAggregator(List<Double> numbers) {
		super(numbers);
	}

	@Override
	public double calculate() {
		double min = numbers.get(0);
		for(double number : numbers){
			if(number < min){
				min = number;
			}
		}
		return min;
	}

	@Override
	public List<Double> getValues() {
		return numbers;
	}
}
