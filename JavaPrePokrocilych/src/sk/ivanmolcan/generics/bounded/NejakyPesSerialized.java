package sk.ivanmolcan.generics.bounded;

import java.io.Serializable;

public class NejakyPesSerialized extends Pes implements Serializable {
    private String meno;

    public NejakyPesSerialized(String meno) {
        this.meno = meno;
    }
}
