public class ClipboardTest {
    public static void main(String[] args) {
        // Using lazy-initialized clipboard
        ClipboardLazy lazyClipboard = ClipboardLazy.getInstance();
        lazyClipboard.copy("Hello from Lazy Clipboard!");
        System.out.println(lazyClipboard.paste());

        // Using static block clipboard
        ClipboardStatic staticClipboard = ClipboardStatic.getInstance();
        staticClipboard.copy("Hello from Static Clipboard!");
        System.out.println(staticClipboard.paste());
    }
}

