import java.awt.*;
public class LockMouse {
    public static void main(String[] args) throws AWTException {
        Robot r = new Robot();
        while (true) {
            r.mouseMove(0, 0);
        }
    }
}
