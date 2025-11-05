package Nivel3.Commands;

import Nivel3.Vehicles.Vehicle;

public class AccelerateCommand implements Command {
    public final Vehicle vehicle;

    public AccelerateCommand(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.toAccelerate();
    }
}