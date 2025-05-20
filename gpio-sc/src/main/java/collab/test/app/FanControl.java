package collab.test.app;

public class FanControl {

    static {
        System.loadLibrary("fancontrol"); // fancontrol.dll on Windows
    }

    // Native method declaration
    public native void setFanPosition(int position);

    public static void main(String[] args) {
        FanControl controller = new FanControl();

        // Simulate all positions
        for (int pos = 0; pos <= 2; pos++) {
            System.out.println("\nSetting fan position to: " + pos);
            controller.setFanPosition(pos);
            try {
                Thread.sleep(2000); // Wait 2 seconds between settings
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

