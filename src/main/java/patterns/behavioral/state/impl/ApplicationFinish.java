package patterns.behavioral.state.impl;

import patterns.behavioral.state.model.Context;
import patterns.behavioral.state.model.State;

public class ApplicationFinish implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("The application is in the finished state of development.");
        context.setState(this);
    }
    public String toString() {
        return "Finished state.";
    }
}