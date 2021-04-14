import java.awt.*;
import java.awt.event.KeyEvent;

public class ShutItDown {
    public static void main(String[] args) throws AWTException {
        Robot s = new Robot();
        s.keyPress(KeyEvent.VK_WINDOWS);
        s.keyRelease(KeyEvent.VK_WINDOWS);
        s.delay(30);
        s.keyPress(KeyEvent.VK_TAB);
        s.keyRelease(KeyEvent.VK_TAB);
        s.delay(30);
        s.keyPress(KeyEvent.VK_DOWN);
        s.keyRelease(KeyEvent.VK_DOWN);
        s.delay(40);
        s.keyPress(KeyEvent.VK_DOWN);
        s.keyRelease(KeyEvent.VK_DOWN);
        s.delay(40);
        s.keyPress(KeyEvent.VK_DOWN);
        s.keyRelease(KeyEvent.VK_DOWN);
        s.delay(40);
        s.keyPress(KeyEvent.VK_DOWN);
        s.keyRelease(KeyEvent.VK_DOWN);
        s.delay(40);
        s.keyPress(KeyEvent.VK_DOWN);
        s.keyRelease(KeyEvent.VK_DOWN);
        s.delay(40);
        s.keyPress(KeyEvent.VK_ENTER);
        s.keyRelease(KeyEvent.VK_ENTER);
        s.delay(40);
        s.keyPress(KeyEvent.VK_DOWN);
        s.keyRelease(KeyEvent.VK_DOWN);
        s.delay(40);
        s.keyPress(KeyEvent.VK_ENTER);
        s.keyRelease(KeyEvent.VK_ENTER);
    }
}