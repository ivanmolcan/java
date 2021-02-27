package client;

import java.io.IOException;
import java.util.*;

import fileprocessors.StockFileData;
import fileprocessors.StockFileReader;

public class StockFileApplication {
	
	public static void main(String args[]) throws IOException{
		StockFileReader fr = new StockFileReader("table.csv");

		List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());
		StockFileData fileData = new StockFileData();
		fileData.addData(dataResult);
		fileData.printData();
		System.out.println(dataResult.size());
	}
	/**
	 * Complete the method body so that it returns the given structure needed to 
	 * populate the data field in the StockFileData class. 
	 * @param headers
	 * @param lines
	 * @return List
	 */
	public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines){
		List<HashMap<String, Double>> dataResult = new ArrayList<>();
		// Insert your code here..
//		List<Double> val = new LinkedList<>();
//		int multi = 0;
//
//		for(int i = 0; i<lines.size();i++){
//			for(String j : (lines.get(i)).split(",")){
//				val.add(Double.parseDouble(j));
//			}
//		}

		//Z prikladu
		for(String line : lines){
			String[] values = line.split(",");
			int cnt = 0;
			HashMap<String, Double> headerValueMap = new HashMap<>();
			for(String value : values){
				double dval = Double.parseDouble(value);
				headerValueMap.put(headers.get(cnt), dval);
				cnt++;
			}
			dataResult.add(headerValueMap);
		}

		//
		//

//		for(int i = 0; i<val.size()/6;i++){
//			HashMap<String, Double> hash = new LinkedHashMap<>();
//
//			for (int j = 0; j < headers.size(); j++) {
//				if(multi+j < val.size()-1/6){
//					hash.put(headers.get(j), val.get(j + multi));
//				}
//			}
//
//			dataResult.add(hash);
//			multi += 6;
//
//		}

		return dataResult;
	}
	
	
}
