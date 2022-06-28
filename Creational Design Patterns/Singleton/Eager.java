public class Eager {
    
    private static final Eager instance = new Eager();
    
    // An empty constructor to prevent the constructor from being used externally.
    private Eager() {

    }

    public static Eager getInstance() { // When this method is called from the class, the created object is returned.
        return instance;
    }

    // The disadvantage of this method is that the object is created even if it is not called.
}