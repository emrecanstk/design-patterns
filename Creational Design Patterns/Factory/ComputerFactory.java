public class ComputerFactory {
    public static Computer createComputer(Class aClass) throws IllegalAccessException, InstantiationException {
            return (Computer) aClass.newInstance();
    }
}

// The method takes one Class type parameter.
// This parameter is to understand which class we want to create, but the factory class does not know which class it created.