public class ElectricCar extends Car {

    int batterycapacityKWh;
    int maxKm;
    int whPrKm;

    public ElectricCar(int regNr, String brand, String model, int year, int doorNr, int batterycapacityKWh, int maxKm, int whPrKm) {
        super(regNr, brand, model, year, doorNr);
        this.batterycapacityKWh = batterycapacityKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatterycapacityKWh() {
        return batterycapacityKWh;
    }

    public void setBatterycapacityKWh(int batterycapacityKWh) {
        this.batterycapacityKWh = batterycapacityKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batterycapacityKWh=" + batterycapacityKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                ", regNr=" + regNr +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", doorNr=" + doorNr +
                '}';
    }

    @Override
    public double greenCharge() {
        double x;
        x = 100/(whPrKm/91.25);
        if ( x < 5)
        {
            return 10470;
        }
        if (5 <= x && x < 10)
        {
            return 5500;
        }
        if (10 <= x && x < 15)
        {
            return 2340;
        }
        if (15 <= x && x < 20)
        {
            return 1050;
        }
        if (20 <= x && x < 50)
        {
            return 330;
        }
        return 0;

    }


}
