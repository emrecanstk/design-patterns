public class StaticBlock {

    private static StaticBlock instance;
    
    private StaticBlock() {

    }
    
    static {
        try {
            instance = new StaticBlock();
        }
        catch(Exception e) {
            throw new RuntimeException("Exception has occurred.");
        }
    }
    
    public static StaticBlock getInstance(){
        return instance;
    }

    // Both eager initialization and static block initialization creates the instance even before it’s being used and that is not the best practice to use.
    // So in further sections, we will learn how to create a Singleton class that supports lazy initialization.
}
