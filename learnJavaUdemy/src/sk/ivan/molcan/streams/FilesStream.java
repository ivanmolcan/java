package sk.ivan.molcan.streams;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesStream {

    public static void main(String[] args) throws IOException {
        Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"));
        lines.sorted()
                .filter(l -> l.length() >6)
                .forEach(x -> System.out.print(x + ", "));
        lines.close();
        System.out.println();

        List<String> words = Files.lines(Paths.get("files/wordFile.txt"))
                .filter(x -> x.contains("th"))
                .collect(Collectors.toList());
        words.forEach(x -> System.out.print(x + ", "));
        lines.close();
        System.out.println();

        Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));
        int rowCount = (int) rows
                .map(x -> x.split(","))
                .filter(x -> x.length > 3)
                .count();
        System.out.println(rowCount + " good rows.");
        rows.close();
        System.out.println();

        Stream<String> rows2 = Files.lines(Paths.get("files/stockDataCsv.txt"));
        rows2.map(x -> x.split(","))
                .filter(x -> x.length >3)
                .filter(x -> Integer.parseInt(x[1].trim()) > 15)
                .forEach(x -> System.out.println(x[0].trim() + " " + x[2].trim()
                + " " + x[3].trim()));
        rows.close();
    }

}
