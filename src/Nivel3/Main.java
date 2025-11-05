package Nivel3;

import Nivel3.Commands.AccelerateCommand;
import Nivel3.Commands.BrakeCommand;
import Nivel3.Commands.StartCommand;
import Nivel3.Vehicles.Bike;
import Nivel3.Vehicles.Car;
import Nivel3.Vehicles.Vehicle;
import Nivel3.Vehicles.Plane;
import Nivel3.Vehicles.Boat;
public class Main {

    public static void main (String[]agr) {
        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle bike = new Bike();
        Vehicle airplane = new Plane();
        Invoker invoke = new Invoker();


        System.out.println("\nBike actions:");
        invoke.run(new StartCommand(bike));
        invoke.run(new AccelerateCommand(bike));
        invoke.run(new BrakeCommand(bike));

        System.out.println("\nPlane actions:");
        invoke.run(new StartCommand(airplane));
        invoke.run(new AccelerateCommand(airplane));
        invoke.run(new BrakeCommand(airplane));

        System.out.println("\nCar actions:");
        invoke.run(new StartCommand(car));
        invoke.run(new AccelerateCommand(car));
        invoke.run(new BrakeCommand(car));


        System.out.println("\nBoat actions:");
        invoke.run(new StartCommand(boat));
        invoke.run(new AccelerateCommand(boat));
        invoke.run(new BrakeCommand(boat));
    }
}
