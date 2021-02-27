package client;

import java.io.IOException;

import aggregators.*;

public class AggregatorApp {

	public static void main(String[] args) throws IOException, NoSuchMethodException {
		
		MeanAggregator agg = new MeanAggregator();
		AggregatorProcessor<MeanAggregator> aggsProcessor = new AggregatorProcessor<>(agg, "table.csv");
		double value = aggsProcessor.runAggregator(2);
		System.out.println(value);

	}

}
