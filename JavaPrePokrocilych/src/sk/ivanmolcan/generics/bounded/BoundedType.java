package sk.ivanmolcan.generics.bounded;

public class BoundedType <P extends Pes>{
    private P objectPsa;

    public P getObjectPsa() {
        return objectPsa;
    }

    public void setObjectPsa(P objectPsa) {
        this.objectPsa = objectPsa;
    }

    public void stekaj(){
        objectPsa.stekaj();
    }

    public static void main(String[] args) {
        BoundedType<Pes> pes = new BoundedType<>();
        BoundedType<NejakyPes> pesBoundType = new BoundedType<>();
        pesBoundType.setObjectPsa(new NejakyPes());

        pesBoundType.stekaj();
    }
}
