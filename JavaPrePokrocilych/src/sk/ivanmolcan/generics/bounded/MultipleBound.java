package sk.ivanmolcan.generics.bounded;

import java.io.Serializable;

public class MultipleBound<P extends Pes & Serializable> {
    private P object;

    public P getObject() {
        return object;
    }

    public void setObject(P object) {
        this.object = object;
    }

    public static void main(String[] args) {
        MultipleBound<NejakyPesSerialized> nejakyPesSerialized = new MultipleBound<>();
        nejakyPesSerialized.setObject(new NejakyPesSerialized("Dunco"));
    }
}
