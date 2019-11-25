package patterns.behavioral.command.impl;

import patterns.behavioral.command.model.Application;
import patterns.behavioral.command.model.Order;

public class SellApplication implements Order {
    private Application application;

    public SellApplication(Application application) {
        this.application = application;
    }

    @Override
    public void placeOrder() {
        application.sell();
    }
}