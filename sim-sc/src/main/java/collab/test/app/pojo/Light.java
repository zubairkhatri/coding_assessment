package collab.test.app.pojo;

public class Light
{
    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    private boolean isOn;

    //Following method is used to connected to C class using JNI
    public native void toggleLight(boolean on);

    //Following is the code to load the native libraries
    static {
        //String s = System.getProperty("java.library.path");
        //System.out.println(s);
        //System.setProperty( "java.library.path", "C:\\Users\\zubai\\CLionProjects\\coding_assessment\\systemcontrol\\src\\main\\java\\collab\\test\\app\\clib" );
        //Runtime.getRuntime().loadLibrary("lightcontrol");
        //System.load("C:\\Users\\zubai\\CLionProjects\\coding_assessment\\systemcontrol\\src\\main\\java\\collab\\test\\app\\clib");
    }

}
