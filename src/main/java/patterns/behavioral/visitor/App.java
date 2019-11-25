package patterns.behavioral.visitor;

import patterns.behavioral.visitor.impl.VisitorImpl;
import patterns.behavioral.visitor.model.Item;
import patterns.behavioral.visitor.model.Notebook;
import patterns.behavioral.visitor.model.Pen;
import patterns.behavioral.visitor.model.Visitor;

public class App {

    public static void main(String[] args) {
        Item[] items = new Item[]{
                new Pen(10, "Parker"),
                new Pen(5, "Pilot"),
                new Notebook(50, 150),
                new Notebook(75, 300)
        };

        int total = getTotalPrice(items);
        System.out.println("Total price of items: " + total);
    }

    private static int getTotalPrice(Item[] items) {
        Visitor visitor = new VisitorImpl();
        int result = 0;
        for(Item item : items) {
            result = result + item.accept(visitor);
        }
        return result;
    }

}
