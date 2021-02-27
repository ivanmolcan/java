package aggregators;

import fileprocessors.StockFileReader;

import java.io.IOException;
import java.util.*;
import java.lang.*;

import static client.StockFileApplication.populateStockFileData;

public class AggregatorProcessor<T extends Aggregator>{

    T aggr;
    String file;

    public AggregatorProcessor(T aggr, String filePath) {
        this.aggr = aggr;
        this.file = filePath;
    }

    //From course
    public double runAggregator(int colIdx) throws IOException{
        StockFileReader fileReader = new StockFileReader(file);
        List<String> lines = fileReader.readFileData();
        colIdx--;
        for(String line : lines){
            String[] numbers = line.split(",");
            double value = Double.parseDouble(numbers[colIdx]);
            aggr.add(value);
        }

        double number = aggr.calculate();
        return  number;
    }


    public double runAggregator (int column) throws IOException {
        StockFileReader stock = new StockFileReader(file);
        List<HashMap<String, Double>> dataResult = populateStockFileData(stock.getHeaders(), stock.readFileData());
        List<Double> dbl = new ArrayList<>();
        int cnt = 0;
        String header = "";

        //header selection
        for(String s : stock.getHeaders()){
            if(cnt == column--){
                header = s;
            }
            cnt++;
        }

        for(HashMap h : dataResult ){
            for(Object s : h.keySet()){
                if(s.equals(header)){
                    dbl.add((Double) h.get(s));
                }
            }
        }

        for(Double d : dbl){
            aggr.add(d);
        }

        double numbers = aggr.calculate();

    return numbers;
    }
	
}
