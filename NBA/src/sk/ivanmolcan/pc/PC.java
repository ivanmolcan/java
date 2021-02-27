package sk.ivanmolcan.pc;

import sk.ivanmolcan.pc.components.*;

import java.util.Arrays;


public class PC {

    private GraphicCard gcard;
    private Mainboard mb;
    private NetworkCard net;
    private Procesor cpu;
    private Ram[] memory;

    private static Configuration config = new Configuration();

    public PC generujPc(){
        PC computer = new PC();
        computer.setGcard(config.getGraphicCard());
        computer.setMb(config.getMainboard());
        computer.setNet(config.getNetworkcard());
        computer.setCpu(config.getCPU());
        computer.setMemory(config.getRam(4));
        return computer;
    }

    public GraphicCard getGcard() {
        return gcard;
    }

    public void setGcard(GraphicCard gcard) {
        this.gcard = gcard;
    }

    public Mainboard getMb() {
        return mb;
    }

    public void setMb(Mainboard mb) {
        this.mb = mb;
    }

    public NetworkCard getNet() {
        return net;
    }

    public void setNet(NetworkCard net) {
        this.net = net;
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Ram[] getMemory() {
        return memory;
    }

    public void setMemory(Ram[] memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "PC{" +
                "gcard=" + gcard +
                ", mb=" + mb +
                ", net=" + net +
                ", cpu=" + cpu +
                ", memory=" + Arrays.toString(memory) +
                '}';
    }
}
