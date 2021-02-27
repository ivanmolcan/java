package sk.ivan.learn2code;

public class Uloha1 {

    private static void obratenePoradie(String jedna, String dva) {
         char[] ch = new char[jedna.length()];
         char[] ch2 = new char[dva.length()];

        String str = "";

        for(int i = jedna.length(); i >0; i--) {
            ch[jedna.length()-i] = jedna.charAt(i-1);
        }

        for(int j = dva.length(); j >0; j--) {
            ch2[dva.length()-j] = dva.charAt(j-1);
        }

        System.out.println(str.valueOf(ch) + " " + str.valueOf(ch2));

    }

    public static void main(String[] args) {
//        obratenePoradie("Jaroslav", "Beňo");
        obratenePoradie("Malý", "medveď");
    }

}


