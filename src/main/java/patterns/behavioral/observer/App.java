package patterns.behavioral.observer;

import patterns.behavioral.observer.model.CEO;
import patterns.behavioral.observer.model.LeadProgrammer;
import patterns.behavioral.observer.model.Manager;
import patterns.behavioral.observer.model.Programmer;

public class App {

    public static void main(String[] args) {
        Programmer programmer = new Programmer();

        new CEO(programmer);
        new Manager(programmer);
        new LeadProgrammer(programmer);

        System.out.println("Programmer successfully did his job!");
        programmer.setState("Successful");
        System.out.println("Programmer failed his new assignment.");
        programmer.setState("Failed");
    }

}
