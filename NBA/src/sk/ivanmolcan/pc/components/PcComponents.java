package sk.ivanmolcan.pc.components;

public interface PcComponents {
    GraphicCard getGraphicCard();
    Mainboard getMainboard();
    NetworkCard getNetworkcard();
    Procesor getCPU();
    Ram[] getRam(int count);
}
