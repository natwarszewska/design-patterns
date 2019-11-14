package patterns.creational.builder;

public class ComputerClient {

    public static void main(String[] args) {

        Computer comp1 = new Computer.Builder("2GB", "2TB", "Intel i7").build();
        Computer comp2 = new Computer.Builder("2GB", "2TB", "Intel i7").setGraphicsCardEnabled(true).build();

        Computer comp3 = new ComputerBuilderDirector().getBasicComputer();
        Computer comp4 = new ComputerBuilderDirector().getGraphicsCardEnabledComputer();

    }
}
