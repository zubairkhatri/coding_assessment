package collab.test.app;

public class LightController {

    public native void toggleLight(boolean on);

    static {
        System.loadLibrary("lightcontrol");
    }


    public static void main(String k []) {
        LightController controller = new LightController();
        System.out.println("Turning ON the light...");

        controller.toggleLight(true);

        try {
            Thread.sleep(2000); // wait 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
