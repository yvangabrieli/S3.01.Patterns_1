package Nivel3.Commands;
import Nivel3.Vehicles.Vehicle;
public class BrakeCommand implements Command {
    public final Vehicle vehicle;

    public BrakeCommand(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.toBrake();
    }
}
