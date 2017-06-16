package singleton;

/**
 * Instance is static final variable so it's initialized when class is first loaded into memory it's thread-safe.
 */
public class SingletonWithStaticFactoryMethod {
    //initailzed during class loading
    private static final SingletonWithStaticFactoryMethod instance = new SingletonWithStaticFactoryMethod();

    //to prevent creating another instance of Singleton
    private SingletonWithStaticFactoryMethod() {
    }

    public static SingletonWithStaticFactoryMethod getSingleton() {
        return instance;
    }
}
