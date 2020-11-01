package com.company;

public class Mercedes extends Car implements ILighithing, IHeating{
    private int roadServiceMonths;
    private boolean isOnOrOff;
    private boolean isHeatingOnOrOff;
    public Mercedes(int roadServiceMonths) {
        super("Benz", "4WD", 5, 5, 5, true);
        this.roadServiceMonths = roadServiceMonths;
    }

    @Override
    public void stop() {
        System.out.println("Mercedes Car has stopped the engine.");
        super.stop();
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
            changeGear(1);
        }else if(newVelocity > 0 && newVelocity <=20) {
            changeGear(1);
        }else if(newVelocity > 20 && newVelocity <=40) {
            changeGear(2);
        }else if(newVelocity > 40 && newVelocity <=60) {
            changeGear(3);
        }else if(newVelocity > 60 && newVelocity <= 80) {
            changeGear(4);
        }else if(newVelocity > 80 && newVelocity <= 100) {
            changeGear(5);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity,getCurrentDirection());
        }


    }

    @Override
    public boolean isLightingOn(boolean isOnOrOff) {
        return this.isOnOrOff = isOnOrOff;
    }

    @Override
    public boolean isHeatingOn(boolean isHeatingOnOrOff) {
        return this.isHeatingOnOrOff = isHeatingOnOrOff;
    }
}
