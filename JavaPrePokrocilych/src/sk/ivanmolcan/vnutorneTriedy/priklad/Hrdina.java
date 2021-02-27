package sk.ivanmolcan.vnutorneTriedy.priklad;

public class Hrdina {
    private String name;

    public Hrdina(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Hrdina hr1 = new Hrdina("Smrtihlav");
        Hrdina hr2 = new Hrdina("Drakobijec");

        hr1.schopnosti(new IHrdina() {
            @Override
            public void pouziSchopnost() {
                System.out.println(hr1.getName() + " utoci kuzlom.");
            }

            @Override
            public void zastavSchopnost() {
                System.out.println(hr1.getName() + " brani sa stitom.");
            }
        });

        hr2.schopnosti(new IHrdina() {
            @Override
            public void pouziSchopnost() {
                System.out.println(hr2.getName() + " zahana sa mecom.");
            }

            @Override
            public void zastavSchopnost() {
                System.out.println(hr2.getName() + " uskakuje dozadu.");
            }
        });

    }

    public void schopnosti(IHrdina inter){
        inter.pouziSchopnost();
        inter.zastavSchopnost();
    }
}
