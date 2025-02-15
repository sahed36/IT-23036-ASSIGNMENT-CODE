public class SingletonExample {

    // Step 1: Private static variable to hold the single instance of the class
    private static volatile SingletonExample instance;

    // Step 2: Private constructor to prevent instantiation from outside
    private SingletonExample() {
        // Private constructor to prevent direct instantiation
    }

    // Step 3: Public method to provide access to the instance
    public static SingletonExample getInstance() {
        if (instance == null) {
            // Step 4: Synchronize only the first time the instance is created
            synchronized (SingletonExample.class) {
                // Double-checking that the instance is still null before creating a new one
                if (instance == null) {
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }

    // Step 5: A method to demonstrate the functionality of the Singleton
    public void showMessage() {
        System.out.println("Hello from SingletonExample!");
    }

    // Main method to test the Singleton class
    public static void main(String[] args) {
        // Get the single instance of SingletonExample
        SingletonExample singleton = SingletonExample.getInstance();

        // Call the method to demonstrate functionality
        singleton.showMessage();

        // Verifying that only one instance exists
        SingletonExample anotherSingleton = SingletonExample.getInstance();
        System.out.println("Are both instances the same? " + (singleton == anotherSingleton));
    }
}
