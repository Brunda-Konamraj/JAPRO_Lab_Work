public class InterfaceDemo {


    interface SmartDevice {
        void turnOn();
        void turnOff();
    }


    static class SmartFan implements SmartDevice {


        public void turnOn() {
            System.out.println("Smart Fan is ON");
        }


        public void turnOff() {
            System.out.println("Smart Fan is OFF");
        }
    }


    static class SmartLight implements SmartDevice {


        public void turnOn() {
            System.out.println("Smart Light is ON");
        }


        public void turnOff() {
            System.out.println("Smart Light is OFF");
        }
    }


    static class SmartAC implements SmartDevice {


        public void turnOn() {
            System.out.println("Smart AC is ON");
        }


        public void turnOff() {
            System.out.println("Smart AC is OFF");
        }
    }


    public static void main(String[] args) {


        SmartFan fan = new SmartFan();
        SmartLight light = new SmartLight();
        SmartAC ac = new SmartAC();


        fan.turnOn();
        fan.turnOff();


        light.turnOn();
        light.turnOff();


        ac.turnOn();
        ac.turnOff();
    }
}
