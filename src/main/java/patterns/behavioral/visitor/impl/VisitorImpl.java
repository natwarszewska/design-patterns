package patterns.behavioral.visitor.impl;

import patterns.behavioral.visitor.model.Notebook;
import patterns.behavioral.visitor.model.Pen;
import patterns.behavioral.visitor.model.Visitor;

public class VisitorImpl implements Visitor {

    @Override
    public int visit(Pen pen) {
        int price = pen.getPrice();
        System.out.println(pen.getModel() + " costs " + price);
        return price;
    }

    @Override
    public int visit(Notebook notebook) {
        int price = 0;
        if(notebook.getNumberOfPages() > 250) {
            price = notebook.getPrice()-5;
        } else {
            price = notebook.getPrice();
        }
        System.out.println("Notebook costs " + price);

        return price;
    }
}