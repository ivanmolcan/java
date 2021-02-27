package sk.ivan.learn2code.pc;

import sk.ivan.learn2code.pc.enums.Brand;
import sk.ivan.learn2code.pc.enums.Material;
import sk.ivan.learn2code.pc.equipments.GPU;
import sk.ivan.learn2code.pc.equipments.Memory;
import sk.ivan.learn2code.pc.equipments.Processor;
import sk.ivan.learn2code.pc.equipments.Tower;

public class StaticData {

    public Processor cpu = new Processor(4.3, Brand.INTEL);
    public Memory ram = new Memory(2,1333,Brand.CORSAIR);
    public GPU gpu = new GPU(true, 1000, Brand.INTEL);
    public Tower tower = new Tower(Material.METAL, Brand.ASUS);

}
