package practice;

public class Strings {

    public static void main(String[] args) {
        System.out.println(middleThree("12345"));
        System.out.println(middleThree("apple"));
        System.out.println(middleThree("tiger"));
        System.out.println(middleThree("candy"));
        System.out.println(middleThree("add"));
        System.out.println(middleThree("ad"));
        System.out.println(middleThree("a"));
        System.out.println(middleThree(""));
        System.out.println(middleThree("del"));
        System.out.println(middleThree("denny"));
        System.out.println(middleThree("sfveaadelbb"));
    }

    //"12345","apple","tiger","candy","add","ad","a","","del","denny","sfveaadelbb"};
    //{"234","ppl","ige","and","add","ad","a","","del","enn","aad"};

    /**
     Given a string of odd length, return the middle 3 characters from the string,
     so the string <b>"Monitor"</b> yields <b>"nit"</b>.
     If the string length is less than 3, return the string as is. <br> <br>

     <b>EXPECTATIONS:</b><br>
     middleThree("bunny") <b>---></b> "unn" <br>
     middleThree("peter") <b>---></b> "ete" <br>
     middleThree("Jamaica") <b>---></b>"mai" <br>
     */

    public static String middleThree(String str){
        if(str.length() <= 3){
            return str;
        } else {
            return str.substring(str.length()/2 - 1, str.length()/2+2);
        }
    }

}
