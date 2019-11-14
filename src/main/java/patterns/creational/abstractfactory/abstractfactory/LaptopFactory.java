package patterns.creational.abstractfactory.abstractfactory;

import patterns.creational.abstractfactory.beans.Computer;
import patterns.creational.abstractfactory.beans.Laptop;

public class LaptopFactory implements ComputerAbstractFactory {

    public Computer createComputer() {
        return new Laptop();
    }

}
