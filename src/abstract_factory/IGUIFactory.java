package abstract_factory;

interface IGUIFactory {

    IButton createButton();
}

class WinFactory implements IGUIFactory {

    @Override
    public IButton createButton() {
        return new WinButton();
    }
}

class OSXFactory implements IGUIFactory {

    @Override
    public IButton createButton() {
        return new OSXButton();
    }
}