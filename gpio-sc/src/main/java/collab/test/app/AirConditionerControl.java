package collab.test.app;

public class AirConditionerControl {

/*    static {
        System.load("C:\\JAVAPROJECTS\\coding_assessment\\gpio-sc\\src\\main\\native\\lightcontroller.dll");
    }*/

    static {
        System.loadLibrary("airconditionercontrol"); // airconditionercontrol.dll on Windows
    }

    // Declare native method
    public native void toggleAirConditioner(boolean on);

    public static void main(String[] args) {
        AirConditionerControl controller = new AirConditionerControl();
        System.out.println("Turning ON the Air Conditioner...");
        controller.toggleAirConditioner(true);

        try {
            Thread.sleep(2000); // wait 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Turning OFF the Air Conditioner...");
        controller.toggleAirConditioner(false);
    }
}
