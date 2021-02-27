package sk.ivan.learn2code;

public class Uloha2 {

    private String sometext = "The outcome of the presidential race remains unknown, but investors are betting business is a winner."
            + "Stock markets recorded their biggest post-election leap in decades on Wednesday. "
            + "That's because investors bet the closer-than-expected race would reduce the chance of big change for companies."
            + "Health and tech firms, which are now seen as less likely to face regulation, led the gains."
            + "Analysts said the likelihood of divided government meant a no-go for proposals backed by challenger "
            + "Joe Biden, like higher taxes on companies, even if he emerges the victor.";

    private String word;

    public void lookForWord(String word){
        this.word = word;
        findWord(word, sometext);
    }

    private void findWord(String word, String sometext) {
        String smallSomeText = sometext.toLowerCase();
        String smallWord = word.toLowerCase() + " ";
        int lengthOfWord = word.length();
        int numb = 0;
        int count = 0;

        for(int i=0; i < smallSomeText.length(); i++){

            if(numb != lengthOfWord){

                if(smallWord.charAt(numb) == smallSomeText.charAt(i)){

                    if(smallWord.charAt(numb+1) == smallSomeText.charAt(i+1)){
                        numb++;
                    }

                }

            } else {
                numb = 0;
                count ++;
            }
        }
        System.out.println("Hladany vyraz " + word + " sa v stanovenom texte nachadza " + count + "-krat");
    }

//    private static void hladamSlovo(String text, String slovo){
//        int zhoda = 0;
//
//        for(int i =0; i<text.length();i++){
//            if(text.charAt(i) == slovo.charAt(0)){
//                int c = 0;
//                while(text.charAt(c+i) == slovo.charAt(c)){
//                    c++;
//                    if(c == slovo.length() /*&& (text.charAt(c+i+1)==' ')*/){
//                        zhoda++;
//                        System.out.println("Nasiel zhodu " + zhoda);
//                        break;
//                    }
//                }
//            }
//        }
//
//    }
}
