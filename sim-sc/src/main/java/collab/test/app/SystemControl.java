package collab.test.app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class SystemControl {

    static Scanner scan;

    public static void main(String k[]) {
        SystemControl sc = new SystemControl();
        scan = new Scanner(System.in);
        System.out.println("Which device you want to control ? Enter corresponding numbers (1,2,3)..");
        System.out.println("1: LIGHT ?");
        System.out.println("2: FAN ?");
        System.out.println("3: AIR CONDITIONER ?");
        String n = scan.next();
        //scan.close();
        if(n.equalsIgnoreCase("1")) {
            sc.lightControl();
        } else if(n.equalsIgnoreCase("2")) {
            sc.fanControl();
        } else if(n.equalsIgnoreCase("3")) {
            sc.airConditionerControl();
        } else {
            System.out.println("INVALID CHOICE... EXITING THE SYSTEM");
        }

        // At the very end close the scanner
        scan.close();

        //Following will check the date if this is January 1st, and time as 1:00 am?
        sc.checkDate();
    }

    public void lightControl() {
        LightController controller = new LightController();
        System.out.println("Turning ON the light...");

        controller.setOn(true);

        System.out.println("Light is ON right now....");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        scan = new Scanner(System.in);
        System.out.println("Do you want to turn off the light ?");
        String n="";
        if(scan.hasNext()) {
            n = scan.next();
        } else {
            scan.close();
        }

        controller.setOn(!n.equalsIgnoreCase("yes"));

        if(!controller.isOn()) {
            System.out.println("Lights OFF");
        } else {
            System.out.println("Lights ON");
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void fanControl() {
        FanController controller = new FanController();
        System.out.println("Turning the FAN ON...");
        controller.setOn(true);

        System.out.println("FAN is ON right now....");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        scan = new Scanner(System.in);
        System.out.println("Select the following to control the fan ?");
        System.out.println("0: TURN OFF");
        System.out.println("1: SPEED 1");
        System.out.println("2: SPEED 2");
        String n = "";
        if (scan.hasNext()) {
            n = scan.next();
        } else {
            scan.close();
        }

        if (n.equalsIgnoreCase("0")) {
            controller.setOn(false);
        } else if (n.equalsIgnoreCase("1")) {
            controller.setOn(true);
            System.out.println("FAN IS ON AND IT IS RUNNING AT SPEED 1");
        } else if(n.equalsIgnoreCase("2")) {
            controller.setOn(true);
            System.out.println("FAN IS ON AND IT IS RUNNING AT SPEED 2");
        }

        if(!controller.isOn()) {
            System.out.println("FAN IS OFF");
        } else {
            System.out.println("FAN ON");
        }

    }

    public void airConditionerControl() {
        AirConditionerController controller = new AirConditionerController();
        System.out.println("Turning ON the Air Conditioner...");

        controller.setOn(true);

        System.out.println("Air Conditioner is ON right now....");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        scan = new Scanner(System.in);
        System.out.println("Do you want to turn off the Air Conditioner ?");
        String n="";
        if(scan.hasNext()) {
            n = scan.next();
        } else {
            scan.close();
        }

        controller.setOn(!n.equalsIgnoreCase("yes"));

        if(!controller.isOn()) {
            System.out.println("Air Conditioner is OFF");
        } else {
            System.out.println("Air Conditioner is ON");
        }
    }

    public void checkDate(){

        LocalDateTime currentDateTime = LocalDateTime.now();
        boolean isJanuaryFirstOneAM = currentDateTime.getMonth() == Month.JANUARY && currentDateTime.getDayOfMonth() == 1 && currentDateTime.getHour() == 1 && currentDateTime.getMinute() == 0;
        if(isJanuaryFirstOneAM) {
            System.out.println("Shutting down all appliances");
            new LightController().setOn(false);
            new FanController().setOn(false);
            new AirConditionerController().setOn(false);
        } else {
            System.out.println("TODAY IS NOT THE January 1st, 1 AM.");
        }
    }
}
