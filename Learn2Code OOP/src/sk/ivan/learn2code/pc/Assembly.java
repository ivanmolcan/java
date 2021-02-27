package sk.ivan.learn2code.pc;

import sk.ivan.learn2code.pc.equipments.GPU;
import sk.ivan.learn2code.pc.equipments.Memory;
import sk.ivan.learn2code.pc.equipments.Processor;
import sk.ivan.learn2code.pc.equipments.Tower;

public class Assembly {
    private Processor cpu;
    private Memory ram;
    private GPU gpu;
    private Tower tower;

    public Assembly(Processor cpu, Memory ram, GPU gpu, Tower tower) {
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        this.tower = tower;
    }

    public Processor getCpu() {
        return cpu;
    }

    public Memory getRam() {
        return ram;
    }

    public GPU getGpu() {
        return gpu;
    }

    public Tower getTower() {
        return tower;
    }

    @Override
    public String toString() {
        return "Assembly{" +
                "cpu=" + cpu +
                ", ram=" + ram +
                ", gpu=" + gpu +
                ", tower=" + tower +
                '}';
    }
}
