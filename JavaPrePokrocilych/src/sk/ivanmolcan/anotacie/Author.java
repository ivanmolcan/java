package sk.ivanmolcan.anotacie;

import java.lang.annotation.*;

//Ze sa ma zahrnut do dokumentacie
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    //Len primitivne datove typy + String
    String name();
    String date();
    String company() default "PosAm";
    int vek();
}
