package patterns.creational.factorymethod;

import patterns.creational.factorymethod.beans.Computer;
import patterns.creational.factorymethod.factory.ComputerFactory;
import patterns.creational.factorymethod.factory.ComputerType;

public class App {


    public static void main(String[] args) {

        Computer pc = ComputerFactory.createComputer(ComputerType.PC, "1GB", "256GB", "Intel Core 2 Duo");
        Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "32GB", "1TB", "AMD Ryzen 7 2700X");
    }

}
