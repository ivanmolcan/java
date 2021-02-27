package sk.ivan.molcan.files;

public class MyFileUtils {

    public int substract(int number) throws Exception{
        if(number < 10){
            throw new Exception("Wrong number");
        }
        return number - 10;
    }

}
