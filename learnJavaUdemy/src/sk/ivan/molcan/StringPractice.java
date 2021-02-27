package sk.ivan.molcan;

public class StringPractice {

    public static void main(String[] args) {

//        String a = "hello";
//        String b = "there";
//        String c = "Hello there yogi there";
//
//        System.out.println(a.indexOf("o",3));
//        System.out.println(c.lastIndexOf("there"));

        String str = "We have a large inventory of things in our warehouse falling in "
                + "the category:apperal and the slightly "
                + "more in demand category:makeup along with the category:furniture and ...";
//        whileLoop(str);

        backward("0101010101");

    }



    static void backward(String str){
        for(int i = 0; i < str.length(); i+=2){
            System.out.println(str.charAt(i));
        }
    }

    static void whileLoop(String str){
        str = str.substring(str.indexOf("category"));
        String text1 = "";
        String text2 = "";
        String text3 = "";
        int i = 0;
        int j = 0;
        int k = 0;

        while(str.charAt(i) != ' '){
            text1 += str.charAt(i);
            i++;
        }

        str = str.substring(text1.length());
        str = str.substring(str.indexOf("category"));

        while(str.charAt(j) != ' '){
            text2 += str.charAt(j);
            j++;
        }

        str = str.substring(text2.length());
        str = str.substring(str.indexOf("category"));

        while(str.charAt(k) != ' '){
            text3 += str.charAt(k);
            k++;
        }

        text1 = text1.substring(text1.indexOf(":")+1);
        text2 = text2.substring(text2.indexOf(":")+1);
        text3 = text3.substring(text3.indexOf(":")+1);

        System.out.println("Text1: " + text1);
        System.out.println("Text2: " + text2);
        System.out.println("Text3: " + text3);
    }
}
