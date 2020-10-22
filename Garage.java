import java.util.ArrayList;
import java.util.List;

public class Garage {

    List<Car> myGarage;
    String navn;

    public Garage(String navn) {
        this.navn = navn;
        this.myGarage = new ArrayList<>();
    }

    public void addCar(Car a){
        myGarage.add(a);

    }





    public double TotalGreenCharge(){
        double totalfee = 0;
        for (Car i: myGarage)
        {
            totalfee += i.greenCharge();
        }
        return totalfee;
    }
}



