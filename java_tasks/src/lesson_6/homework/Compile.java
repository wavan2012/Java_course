package lesson_6.homework;

public class Compile {
    public static void main(String[] args) {
        Light vaz2101 = new Light();
        Freight maz500 = new Freight();
        Civil tu154 = new Civil();
        Military su57 = new Military();

        vaz2101.mark = "Vaz-2101";
        vaz2101.bodyType = "sedan";
        vaz2101.mass = 955;
        vaz2101.horsePower = 64;
        vaz2101.maxSpeed = 120;
        vaz2101.fuelConsumption = 9;
        vaz2101.numberOfPassengers = 8;// it's joke
        vaz2101.numberOfWheels = 4;

        maz500.mark = "maz-500";
        maz500.mass = 6500;
        maz500.horsePower = 150;
        maz500.maxSpeed = 120;
        maz500.numberOfWheels = 6;
        maz500.fuelConsumption = 25;
        maz500.liftingCapacity = 7500;

        tu154.mark = "tu-154";
        tu154.mass = 59000;
        tu154.numberOfPassengers = 176;
        tu154.businessClass = true;
        tu154.horsePower = 3 * 11000 / 75;
        tu154.maxSpeed = 935;
        tu154.minimumRunwayLength = 2500;
        tu154.wingspan = 37.55;

        su57.mark = "su-57";
        su57.mass = 30610;
        su57.catapultSystem = true;
        su57.numberOfRockets = 8;
        su57.horsePower = 2 * 9500 / 75;
        su57.maxSpeed = 2450;
        su57.minimumRunwayLength = 500;
        su57.wingspan = 14;

        vaz2101.lightCharacter();
        vaz2101.light(40);
        maz500.freightCharacter();
        maz500.freight(5500);
        tu154.civilCharacter();
        tu154.civil(180);
        su57.militaryCharacter();
        su57.military();
        su57.catapult();
    }
}
