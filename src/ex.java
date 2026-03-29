class Device{
    public void trunOn(){
        System.out.println("Turning on the device");
    }
}

class TV extends Device{
    @Override
    public void trunOn() {
        System.out.println("Turning on the TV");
    }
}