/*
    Napíš metódu, kde na vstupe bude text – veľký text a na vstupe bude aj slovo, ktoré v texte hľadám. 
    Na výstupe bude počet výskytov daného slova v texte. 

    Na vyhľadávanie použi postup hľadania a porovnávania po znakoch. 

    Pri porovnaní zhody znakov je povolené použiť len charAt metódu v Stringu. 

    Cykly, pomocné premenné alebo podmienky, samozrejme môžeš použiť.
*/
package sk.ada.Ulohy;

/**
 *
 * @author ankha
 */
public class HladamSlovo {
    private String someString = "The outcome of the presidential race remains unknown, but investors are betting business is a winner."
                   + "Stock markets recorded their biggest post-election leap in decades on Wednesday. "
                   + "That's because investors bet the closer-than-expected race would reduce the chance of big change for companies."
                   + "Health and tech firms, which are now seen as less likely to face regulation, led the gains."
                   + "Analysts said the likelihood of divided government meant a no-go for proposals backed by challenger "
                   + "Joe Biden, like higher taxes on companies, even if he emerges the victor.";

    private String word;
    private int pocet;

    public void setLookForWord(String word) {
        this.word = word;
        findWord(word, someString);
    }

    
    private static void findWord(String word, String someString) {
        String lookForWord = word.toLowerCase();
        int count = 0;
        char someChar;
        int numb = 0;
        int lengthOfLookFor = lookForWord.length();
        
        String smallLetterSomeString = someString.toLowerCase();
        
        String searchWord = " " + lookForWord + " ";
        
//        System.out.println(searchWord);
                 
        for (int i = 0; i < smallLetterSomeString.length(); i++) {
            
            if (numb != lengthOfLookFor) {
                
                if (searchWord.charAt(numb) == smallLetterSomeString.charAt(i)) {
                    
                    if (searchWord.charAt(numb+1) == smallLetterSomeString.charAt(i+1)){
                        numb++;
                    }
                }
                
            } else {
                numb = 0;
                count++;
            }
        }
        System.out.println("Hladany vyraz " + word + " sa v stanovenom texte nachadza " + count + "-krat");
    }

   

   

    


}
