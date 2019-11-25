package patterns.behavioral.templatemethod;

import patterns.behavioral.templatemethod.model.*;

public class App {

    public static void main(String[] args) {
        Employee employee = new Programmer();
        employee.comeToWork();

        System.out.println();

        employee = new Manager();
        employee.comeToWork();
    }

}
