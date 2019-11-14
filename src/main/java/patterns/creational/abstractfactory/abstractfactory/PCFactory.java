package patterns.creational.abstractfactory.abstractfactory;

import patterns.creational.abstractfactory.beans.PC;
import patterns.creational.abstractfactory.beans.Computer;

public class PCFactory implements ComputerAbstractFactory {

    public Computer createComputer() {
        return new PC(this.RAM, this.HDD, this.CPU);
    }

    private String RAM;
    private String HDD;
    private String CPU;

    public PCFactory(String ram, String hdd, String cpu) {
        this.RAM = ram;
        this.HDD = hdd;
        this.CPU = cpu;
    }
}
