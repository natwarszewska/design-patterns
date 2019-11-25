package patterns.behavioral.command;

import patterns.behavioral.command.impl.MakeApplication;
import patterns.behavioral.command.impl.SellApplication;
import patterns.behavioral.command.model.Application;
import patterns.behavioral.command.model.Programmer;

public class App {

    public static void main(String[] args) {
        // command
        Application application = new Application();

        // wrapping requests
        MakeApplication makeApplication = new MakeApplication(application);
        SellApplication sellApplication = new SellApplication(application);

        // invoker
        Programmer programmer = new Programmer();
        programmer.takeOrder(makeApplication);
        programmer.takeOrder(sellApplication);

        // invoker processed the wrapped request
        programmer.placeOrders();
    }

}
