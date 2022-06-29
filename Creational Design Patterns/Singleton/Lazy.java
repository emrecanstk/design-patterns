public class Lazy {

    private static Lazy instance;
    
    private Lazy() {

    }
    
    public static Lazy getInstance() {
        if(instance == null) {
            instance = new Lazy();
        }
        return instance;
    }

    // The above implementation works fine in case of the single-threaded environment but when it comes to multithreaded systems, it can cause issues if multiple threads are inside the if condition at the same time.
    // It will destroy the singleton pattern and both threads will get the different instances of the singleton class.
    // In next section, we will see different ways to create a thread-safe singleton class.
}