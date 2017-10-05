package abstract_factory;

import java.util.Random;

public class AbstractFactoryDemo {

    public static void main(final String[] arguments) throws Exception {
        IGUIFactory factory;

        final String appearance = randomAppearance();

        if (appearance.equals("OSX")) {
            factory = new OSXFactory();
        } else if (appearance.equals("Windows")) {
            factory = new WinFactory();
        } else {
            throw new Exception("No such operating system");
        }

        final IButton button = factory.createButton();

        button.paint();
    }

    /**
     * This is just for the sake of testing this program, and doesn't have to do with Abstract Factory pattern.
     */
    public static String randomAppearance() {
        final String[] appearanceArray = new String[3];

        appearanceArray[0] = "OSX";
        appearanceArray[1] = "Windows";
        appearanceArray[2] = "error";

        final int randomNumber = new Random().nextInt(3);

        return appearanceArray[randomNumber];
    }
}
