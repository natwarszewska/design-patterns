package patterns.creational.abstractfactory.abstractfactory;

import patterns.creational.abstractfactory.beans.Computer;

public class ComputerFactory {

    public static Computer createComputer(ComputerAbstractFactory caf) {
        return caf.createComputer();
    }
}
