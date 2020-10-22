public class Main {

    public static void main(String[] args) {

      Garage garage1 = new Garage("myGarage");
      GasCar gasCar1 = new GasCar(123,"Ford","corola", 1999,4, 90,9);
      DieselCar dieselCar1 = new DieselCar(321, "BMW", "M3", 2013, 4,true,17);
      ElectricCar electricCar1 = new ElectricCar(312,"Tesla", "S-model", 2016, 4, 100,250,100);
      garage1.addCar(gasCar1);
      garage1.addCar(dieselCar1);
      garage1.addCar(electricCar1);


        System.out.println(garage1);
        System.out.println("\n total amount of Greencharge for all cars in carpark: ");
        System.out.println(garage1.TotalGreenCharge() + " kr");


    }
}
