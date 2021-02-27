import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {



    public static int calculator(int num1, char operator, int num2) {
        int j = 0;
        if (num1 !=0 && num2 !=0) {
            switch (operator) {
                case '+':
                    j = num1 + num2;
                    break;
                case '-':
                    j = num1 - num2;
                    break;
                case '*':
                    j = num1 * num2;
                    break;
                case '/':
                    j = num1 / num2;
                    break;

            }
            return j;
        }
        return 0;
    }

    public static int countTrue(boolean[] arr) {
        int j = 0;
        if(arr == null) return 0;
        for(boolean b : arr){
            if(b){
                j+=1;
            }
        }
        return j;
    }

    public static int mod(int a, int b) {
        int j = Math.round(a/b);
        return a-(j*b);
    }

    public static boolean divisibleByFive(int num) {
        return num%5 == 0?true:false;
    }

    public static boolean equalSlices(int total, int people, int each) {
        if(people==0){
            return true;
        }
        if(people*each<=total){
            return true;
        }
        return false;
    }

    public static boolean comp(String str1, String str2) {
        return str1.length() == str2.length()? true:false;
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        int j=0;
        for(int[] a : stops){
            j+= a[0] - a[1];
        }
        return j;
    }

    public static boolean isTriangle(int a, int b, int c){
        return a + b > c && a + c > b && c + b > a;
    }

    public static String whoLikesIt(String... names) {
        String f = "";
        if(names.length == 0){
            return "no one likes this";
        }
        if(names.length<2){
            f = names[0] + " likes this";
        } else if(names.length<3){
            f = names[0] + " and " + names[1] + " like this";
        } else if(names.length<4){
            f = names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            f= names[0] + ", " + names[1] + " and " + (names.length-2) + " others like this";
        }
        return f;
    }

    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]","");
    }

    static String encode(String word){
        String f = "";
        char[] charArray = word.toLowerCase().toCharArray();
        for(char ch : charArray){
            if(word.toLowerCase().chars().filter(n -> n == ch ).count() > 1){
                f +=")";
            } else {
                f+= "(";
            }
        }
        return f;
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
//        String s = binary.stream()
//                .map(n -> String.valueOf(n))
//                .collect(Collectors.joining());
//        return Integer.parseInt(s, 2);

        String f = "";
        for(Integer i : binary){
            f += String.valueOf(i);
        }
        return Integer.parseInt(f, 2);
    }

    public static String camelCase(String input) {
//        String f = "";
//        for(int i = 0; i<input.length();i++){
//            if(input.charAt(i) == input.toUpperCase().charAt(i)){
//                f+= " " + input.charAt(i);
//            } else{
//                f+= input.charAt(i);
//            }
//        }
//        return f;

        return input.replaceAll("([A-Z])", " $1");
    }

    public static boolean scramble(String str1, String str2) {
        char[] charArray = str2.toCharArray();
        int cnt = 0;
        for(int i =0; i<str1.length();i++){
            for(int j =0; j<str2.length();j++){
                if(str1.charAt(i) == charArray[j]){
                    charArray[j] = ' ';
                    cnt++;
                    break;
                }
            }
            if(cnt == str2.length()){
                return true;
            }
        }
        return false;
    }

    public static boolean scrambleBetter(String str1, String str2) {
        if (str2.length() > str1.length()) return false;
        for (String s: str2.split("")) {
            if (!str1.contains(s))  return false;
            str1 = str1.replaceFirst(s,"");
        }

        return true;
    }

//    public static String solution(int n) {
//        String f = "";
//        while(n > 0){
//            if(String.valueOf(n).length() > 3){
//                f += "M";
//                n -= 1000;
//            }else if(n<1000 && n>=900){
//                f += "CM";
//                n -= 900;
//            }else if(String.valueOf(n).length() >2 && n >500){
//                f += "D";
//                n -= 500;
//            }else if(n<500 && n>=400){
//                f+= "CD";
//                n -= 400;
//            }else if(String.valueOf(n).length() >2 && n<500){
//                f += "C";
//                n -= 100;
//            }else if(n<100 && n >= 90){
//                f += "XC";
//                n -= 90;
//            }else if(String.valueOf(n).length()>1 && n >50){
//                f += "L";
//                n -= 50;
//            }else if (n<50 && n >=40){
//                f += "XL";
//                n -=40;
//            }else if(String.valueOf(n).length()>1 && n < 50){
//                f += "X";
//                n -= 10;
//            }else if(n==9){
//                f += "IX";
//                n -= 9;
//            }else if(String.valueOf(n).length() == 1 && n > 5){
//                f += "V";
//                n -= 5;
//            }else if(n==4){
//                f += "IV";
//                n -= 4;
//            }else if(String.valueOf(n).length() == 1 && n < 5){
//                f += "I";
//                n -= 1;
//            }
//        }
//        return f;
//    }

    public static String solution(int n) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        int l =  map.floorKey(n);
        if ( n == l ) {
            return map.get(n);
        }
        return map.get(l) + solution(n-l);

    }

    public static void main(String[] args) {

//        System.out.println(whoLikesIt());
//        System.out.println(disemvowel("NO offense but,\\nYour writing is among the worst I've ever read"));
//        System.out.println(encode("Prespecialized"));
//        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
//        System.out.println(camelCase("camelCasePetRe"));
//        System.out.println(scramble("katas", "steak"));
//        System.out.println(scrambleBetter("katas", "steak"));
        System.out.println(solution(1000));

    }


}























