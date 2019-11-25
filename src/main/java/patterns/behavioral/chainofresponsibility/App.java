package patterns.behavioral.chainofresponsibility;

import patterns.behavioral.chainofresponsibility.model.Employee;
import patterns.behavioral.chainofresponsibility.model.LeadProgrammer;
import patterns.behavioral.chainofresponsibility.model.Manager;
import patterns.behavioral.chainofresponsibility.model.Programmer;

public class App {

    private static Employee getChainOfEmployees() {
        Employee programmer = new Programmer(Employee.PROGRAMER);
        Employee leadProgrammer = new LeadProgrammer(Employee.LEAD_PROGRAMER);
        Employee manager = new Manager(Employee.MANAGER);

        programmer.setNextEmployee(leadProgrammer);
        leadProgrammer.setNextEmployee(manager);

        return programmer;
    }

    public static void main(String[] args) {
        Employee employeeChain = getChainOfEmployees();

        employeeChain.doWork(Employee.PROGRAMER, "This is basic programming work.");
        employeeChain.doWork(Employee.LEAD_PROGRAMER, "This is marginally more sophisticated programming work.");
                employeeChain.doWork(Employee.MANAGER, "This is the work for a manager.");
    }

}
