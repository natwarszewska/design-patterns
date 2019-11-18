package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.factory.*;
import patterns.creational.abstractfactory.beans.Computer;

public class App {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.createComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));

        Computer server = ComputerFactory.createComputer(new ServerFactory("2 GB","500 GB","2.4 GHz"));

        Computer laptop = ComputerFactory.createComputer(new LaptopFactory());
    }

}