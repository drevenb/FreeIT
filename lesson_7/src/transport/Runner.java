package transport;

public class Runner{
    public static void main(String[] args) {

        PassengerCar car = new PassengerCar();
        Truck truck = new Truck();
        CivilAircraft civilAircraft = new CivilAircraft();
        MilitaryAircraft militaryAircraft = new MilitaryAircraft();

        car.getCharacteristics();
        truck.getCharacteristics();
        civilAircraft.getCharacteristics();
        militaryAircraft.getCharacteristics();

        car.getMaxDistance(3);

        System.out.println();

        truck.isFits(7.2);
        truck.isFits(3.5);
        truck.isFits(5.5);

        System.out.println();

        civilAircraft.isFreeSeats(600);
        civilAircraft.isFreeSeats(500);
        civilAircraft.isFreeSeats(524);

        System.out.println();

        militaryAircraft.takeShot();
        militaryAircraft.takeShot();
        militaryAircraft.eject();
    }
}