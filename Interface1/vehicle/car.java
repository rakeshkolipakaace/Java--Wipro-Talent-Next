package Interface1.vehicle;

public class car implements vehicle, fourwheeler {

    @Override
    public void message() {
        System.out.println("Inside Car");
        vehicle.super.message();
    }
}

