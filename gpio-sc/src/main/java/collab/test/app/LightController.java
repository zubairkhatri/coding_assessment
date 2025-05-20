package collab.test.app;

public class LightController {
    // Load native library
    static {
        //System.loadLibrary("lightcontrol");
        System.load("C:\\JAVAPROJECTS\\coding_assessment\\gpio-sc\\src\\main\\native\\lightcontrol.dll");
    }

    // Declare native method
    public native void toggleLight(boolean on);

    public static void main(String[] args) {
        LightController controller = new LightController();
        System.out.println("Turning ON the light...");
        controller.toggleLight(true);

        try {
            Thread.sleep(2000); // wait 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Turning OFF the light...");
        controller.toggleLight(false);
    }
}
