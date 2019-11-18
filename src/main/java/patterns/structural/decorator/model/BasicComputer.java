package patterns.structural.decorator.model;

public class BasicComputer implements Computer {
    @Override
    public void assemble() {
        System.out.print("Assembling a basic computer.");
    }
}