package singleton;

class SingletonClassic {
    private static SingletonClassic instance;

    private SingletonClassic() {
    }

    public static synchronized SingletonClassic getInstance() {
        if (instance == null) {
            instance = new SingletonClassic();
        }
        return instance;
    }

}
