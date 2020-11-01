package com.company;

public class Porsche extends Car implements ILighithing,IHeating{
    private int roadServiceMonths;
    private boolean isLightningOnOrOff;
    private boolean isHeatingOnOrOff;

    public Porsche(int roadServiceMonths) {
        super("Panamera", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    @Override
    public void stop() {
        System.out.println("Porsche Car has stopped the engine.");
        super.stop();
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
            changeGear(1);
        }else if(newVelocity > 0 && newVelocity <=10) {
            changeGear(1);
        }else if(newVelocity > 10 && newVelocity <=20) {
            changeGear(2);
        }else if(newVelocity > 20 && newVelocity <=30) {
            changeGear(3);
        }else if(newVelocity > 30 && newVelocity <= 40) {
            changeGear(4);
        }else if(newVelocity > 40 && newVelocity <= 50) {
            changeGear(5);
        }else if(newVelocity > 50 && newVelocity <= 60) {
            changeGear(6);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity,getCurrentDirection());
        }


    }

    @Override
    public boolean isLightingOn(boolean isLightningOnOrOff) {
        return this.isLightningOnOrOff = isLightningOnOrOff;
    }

    @Override
    public boolean isHeatingOn(boolean isHeatingOnOrOff) {
        return this.isHeatingOnOrOff = isHeatingOnOrOff;
    }
}
