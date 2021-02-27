package stack;

public class App {

    public static void main(String[] args) {
        Stack stack = new Stack(10);

        reverse("slnko");

    }

    public static void reverse(String word){
        String word2 = "";
        for(int i = 0; i<word.length();i++){
            word2 += word.charAt((word.length()-1)-i);
        }
        System.out.println(word2);
    }

}
