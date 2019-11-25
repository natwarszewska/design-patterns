package patterns.behavioral.state;

import patterns.behavioral.state.impl.ApplicationFinish;
import patterns.behavioral.state.impl.ApplicationStart;
import patterns.behavioral.state.model.Context;

public class App {

    public static void main(String[] args) {
        Context context = new Context();

        ApplicationStart start = new ApplicationStart();
        start.doAction(context);

        System.out.println(context.getState());

        ApplicationFinish finish = new ApplicationFinish();
        finish.doAction(context);

        System.out.println(context.getState());
    }

}
