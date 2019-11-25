package patterns.behavioral.command.impl;

import patterns.behavioral.command.model.Application;
import patterns.behavioral.command.model.Order;

public class MakeApplication implements Order {
    private Application application;

    public MakeApplication(Application application) {
        this.application = application;
    }

    @Override
    public void placeOrder() {
        application.make();
    }
}
