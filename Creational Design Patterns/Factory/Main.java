public class Main {

    public static void main(String[] args) {

        try {
            Asus asus = (Asus) ComputerFactory.createComputer(Asus.class);
            asus.since(1234);
            asus.name();

            Mac mac = (Mac) ComputerFactory.createComputer(Mac.class);
            mac.name();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

// To summarize, while you are creating a class, you can cluster the classes you will use by using interfaces from time to time,
// however, you can write your code in a more abstract and understandable way by adding a factory class.