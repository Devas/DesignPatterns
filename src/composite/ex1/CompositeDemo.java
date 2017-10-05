package composite.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * "Component"
 */
interface Graphic {

    void print();
}

/**
 * "Composite"
 * <p>
 * The key concept is that you can manipulate a single instance of the object just as you would manipulate a group of them.
 * Leaf objects perform a request directly, and Composite objects forward the request to their child components
 * recursively downwards the tree structure. This makes client classes easier to implement, change, test, and reuse.
 */
class CompositeGraphic implements Graphic {

    private List<Graphic> childGraphics = new ArrayList<>();

    @Override
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }

    public List<Graphic> getChildren() {
        return childGraphics;
    }
}

/**
 * "Leaf"
 */
class Ellipse implements Graphic {

    @Override
    public void print() {
        System.out.println("Ellipse");
    }
}

/**
 * Client
 */
public class CompositeDemo {

    public static void main(String[] args) {
        //Initialize four ellipses
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        //Initialize three composite graphics
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        //Composes the graphics
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        graphic2.add(ellipse4);

        graphic.add(graphic1);
        graphic.add(graphic2);

        //Prints the complete graphic (four times the string "Ellipse").
        graphic.print();
    }
}
