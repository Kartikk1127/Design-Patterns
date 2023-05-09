import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vehicle implements Cloneable{
    private List<String> vehicleList;

    public Vehicle(){
        this.vehicleList = new ArrayList<>();
    }

    public Vehicle(List<String> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void insertData(){
        vehicleList.add("Honda City");
        vehicleList.add("Kia");
        vehicleList.add("Fortuner");
        vehicleList.add("Audi A4");
        vehicleList.add("Lamborghini");
    }

    public List<String> getVehicleList() {
        return this.vehicleList;
    }


    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> tempList = new ArrayList<>();

        for(String st : this.getVehicleList()){
            tempList.add(st);
        }
        return new Vehicle(tempList);
    }
}
