public class BillPugh {

    private BillPugh() {

    }
    
    private static class SingletonHelper {
        private static final BillPugh instance = new BillPugh();
    }
    
    public static BillPugh getInstance() {
        return SingletonHelper.instance;
    }
    
    // Notice the private inner static class that contains the instance of the singleton class.
    // When the singleton class is loaded, SingletonHelper class is not loaded into memory and only when someone calls the getInstance method, this class gets loaded and creates the Singleton class instance.
    // This is the most widely used approach for Singleton class as it doesn’t require synchronization.

}
