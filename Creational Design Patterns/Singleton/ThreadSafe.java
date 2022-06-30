public class ThreadSafe {

    private static ThreadSafe instance;
    
    private ThreadSafe() {

    }
    
    // Java keyword synchronized is used to create synchronized code and internally it uses locks on Object or Class to make sure only one thread is executing the synchronized code.
    public static synchronized ThreadSafe getInstance() {

        if(instance == null) {
            instance = new ThreadSafe();
        }

        return instance;
    }
    
}
