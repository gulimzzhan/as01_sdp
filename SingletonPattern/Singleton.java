public class Singleton {
    private static Singleton instance;

    private int value;

    private Singleton() {
        value = 0;
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getValue() {
        return value;
    }

    public void incrementValue() {
        value++;
    }
}
