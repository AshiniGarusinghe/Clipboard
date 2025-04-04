public class ClipboardStatic {
    private static final ClipboardStatic instance;
    private String data;

    // Static block runs only once when class is loaded
    static {
        instance = new ClipboardStatic();
        System.out.println("Clipboard instance created using static block.");
    }

    // Private constructor
    private ClipboardStatic() {}

    public static ClipboardStatic getInstance() {
        return instance;
    }

    public void copy(String newData) {
        this.data = newData;
    }

    public String paste() {
        return data;
    }
}

