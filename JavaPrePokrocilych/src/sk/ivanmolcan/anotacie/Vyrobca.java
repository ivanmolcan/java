package sk.ivanmolcan.anotacie;

import java.lang.annotation.Repeatable;

@Repeatable(Vyrobcovia.class)
public @interface Vyrobca {
    String nazov();
}
