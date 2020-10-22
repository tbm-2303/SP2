public class GasCar extends Car {
    //attributes
    int octaneNr;
    int kmPrL;

    //constructor


    public GasCar(int regNr, String brand, String model, int year, int doorNr, int octaneNr, int kmPrL) {
        super(regNr, brand, model, year, doorNr);
        this.octaneNr = octaneNr;
        this.kmPrL = kmPrL;
    }

    public int getOctaneNr() {
        return octaneNr;
    }

    public void setOctaneNr(int octaneNr) {
        this.octaneNr = octaneNr;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "GasCar{" +
                "octaneNr=" + octaneNr +
                ", kmPrL=" + kmPrL +
                ", regNr=" + regNr +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", doorNr=" + doorNr +
                '}';
    }

    @Override
    public double greenCharge() {
        if (kmPrL < 5) {
            return 10470;
        }
        if (5 <= kmPrL && kmPrL < 10) {
            return 5500;
        }
        if (10 <= kmPrL && kmPrL < 15) {
            return 2340;
        }
        if (15 <= kmPrL && kmPrL < 20) {
            return 1050;
        }
        if (20 <= kmPrL && kmPrL < 50) {
            return 330;
        }
        return 0;
    }
}










