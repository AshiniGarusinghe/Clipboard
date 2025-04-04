public class ClipboardLazy {
    private static volatile ClipboardLazy instance;
    private String data;

    // Private constructor to prevent instantiation
    private ClipboardLazy() {
        System.out.println("Clipboard instance created using lazy initialization.");
    }

    public static ClipboardLazy getInstance() {
        if (instance == null) {
            synchronized (ClipboardLazy.class) {
                if (instance == null) {
                    instance = new ClipboardLazy();
                }
            }
        }
        return instance;
    }

    public void copy(String newData) {
        this.data = newData;
    }

    public String paste() {
        return data;
    }
}
