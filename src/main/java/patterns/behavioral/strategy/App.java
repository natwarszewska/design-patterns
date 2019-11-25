package patterns.behavioral.strategy;

import patterns.behavioral.strategy.model.BuildContext;
import patterns.behavioral.strategy.model.House;
import patterns.behavioral.strategy.model.Mall;
import patterns.behavioral.strategy.model.Skyscraper;

public class App {

    public static void main(String[] args) {
        BuildContext buildContext = new BuildContext(new Skyscraper());
        System.out.println("Requesting a skyscraper: " + buildContext.executeStrategy("Downtown"));

        buildContext = new BuildContext(new House());
        System.out.println("Requesting a house: " + buildContext.executeStrategy("Outskirts"));

        buildContext = new BuildContext(new Mall());
        System.out.println("Requesting a mall: " + buildContext.executeStrategy("City Centre"));
    }

}
