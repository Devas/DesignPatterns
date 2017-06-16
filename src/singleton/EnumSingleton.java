package singleton;

enum EnumSingleton {
    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}

/**
 * Enum Singletons handle serialization by default.
 * By default creation of Enum instance is thread safe but any other method on Enum is programmers responsibility.
 */
class EnumSingletonDemo {
    public static void main(String[] args) {
        EnumSingleton es = EnumSingleton.INSTANCE;
        System.out.println(es);

    }
}