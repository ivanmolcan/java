package sk.ivanmolcan.pc.components;

public class Configuration implements PcComponents {

    @Override
    public GraphicCard getGraphicCard() {
        GraphicCard gcard = new GraphicCard(Brands.NVIDIA);
        return gcard;
    }

    @Override
    public Mainboard getMainboard() {
        Mainboard mb = new Mainboard(Brands.MSI);
        return mb;
    }

    @Override
    public NetworkCard getNetworkcard() {
        NetworkCard net = new NetworkCard(Brands.TPLINK);
        return net;
    }

    @Override
    public Procesor getCPU() {
        Procesor cpu = new Procesor(4.2, Brands.INTEL);
        return cpu;
    }

    @Override
    public Ram[] getRam(int count) {
        Ram[] ram = new Ram[count];
        for(int i=0; i<ram.length;i++){
            Ram ramka = new Ram(Brands.CORSAIR, 1333);
            ram[i] = ramka;
        }
        return ram;
    }
}
