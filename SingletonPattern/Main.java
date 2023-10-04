public class Main {
    public static void main(String[] args) {
        int l = 5;
        Thread[] threads = new Thread[l];

        for (int i = 0; i < l; i++) {
            threads[i] = new Thread(() -> {
                Singleton singleton = Singleton.getInstance();
                singleton.incrementValue();
            });
            threads[i].start();
        }

        for (int i = 0; i < l; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Singleton singleton = Singleton.getInstance();
        System.out.println("Final value: " + singleton.getValue());

    }
}