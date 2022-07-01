public enum Enum {

    instance;
    
    public static void doSomething() {
        // do something
    }

    // Since Java Enum values are globally accessible, so is the singleton.
    // The drawback is that the enum type is somewhat inflexible; for example, it does not allow lazy initialization.

}