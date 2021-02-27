import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda {

    public class Solution {
        public int solution(int number) {
            return IntStream.range(0, number)
                    .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                    .sum();
        }
    }

    public static int countPassengers2(ArrayList<int[]> stops) {
        return stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
    }

    static String encode2(String word){
        return word.toLowerCase()
                .chars()
                .mapToObj(i -> String.valueOf((char)i))
                .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.printf(encode2("Prespecialized"));
    }
}
