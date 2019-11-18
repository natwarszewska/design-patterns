package patterns.creational.abstractfactory.factory;

import patterns.creational.abstractfactory.beans.Computer;
import patterns.creational.abstractfactory.beans.Server;

public class ServerFactory implements ComputerAbstractFactory {

    public Computer createComputer() {
        return new Server(this.RAM, this.HDD, this.CPU);
    }

    private String RAM;
    private String HDD;
    private String CPU;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.RAM = ram;
        this.HDD = hdd;
        this.CPU = cpu;
    }
}