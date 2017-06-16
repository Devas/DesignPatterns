package singleton;

/**
 * SingletonClassic pattern example with Double checked Locking pattern.
 * This is broken in Java 4 and earlier. It works perfectly in Java 5 memory model with guaranteed volatile variable.
 * https://en.wikipedia.org/wiki/Double-checked_locking
 * http://stackoverflow.com/questions/18093735/double-checked-locking-in-singleton
 * http://www.ibm.com/developerworks/java/library/j-dcl/index.html
 */
class DoubleCheckedLockingSingleton {

    private volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {}

    public DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) { // double checking SingletonClassic instance
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}