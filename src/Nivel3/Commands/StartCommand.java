package Nivel3.Commands;

import Nivel3.Vehicles.Vehicle;

public class StartCommand implements Command {
    public final Vehicle vehicle;

    public StartCommand(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.toStart();
    }
}
