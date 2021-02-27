package practice;

public class Loops {

    public static void main(String[] args) {
        String str = "We have a large inventory of things in our warehouse falling in " +
                "the category:apperal and the slightly " +
                "more in demand category:makeup along with the category:furniture and ... .";

//        printCategories(str);
//        printCategories2(str);

        for(int i =0; i<21;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }

    }

    public static void printCategories(String str){
        String categories = "";

        while(str.contains("category:")) {
            int i = 0;
            str = str.substring(str.indexOf("category:") + 9);
            while (str.charAt(i) != ' ' && str.charAt(i) != '.') {
                i++;
            }
            categories += str.substring(0, i) + " ";
            str = str.substring(i);
        }
        System.out.println(categories);
    }

    //from course
    public static void printCategories2(String str){
        int i = 0;
        while(true){
            int found = str.indexOf("category:",i);
            if(found == -1) break;
            int start = found + 9;
            int end = str.indexOf(" ", start);
            System.out.println(str.substring(start, end));
            i = end +1;
        }

    }
}
