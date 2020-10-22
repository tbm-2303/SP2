public class DieselCar extends Car {
//attributes
boolean particleFilter;
int kmPrL;

    public DieselCar(int regNr, String brand, String model, int year, int doorNr, boolean particleFilter, int kmPrL) {
        super(regNr, brand, model, year, doorNr);
        this.particleFilter = particleFilter;
        this.kmPrL = kmPrL;
    }

    public boolean isParticleFilter() {
        return particleFilter;
    }

    public void setParticleFilter(boolean particleFilter) {
        this.particleFilter = particleFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "DieselCar{" +
                "particleFilter=" + particleFilter +
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
        if ( kmPrL < 5 && particleFilter == true)
        {
            return 15260;
        }
        if (5 <= kmPrL && kmPrL < 10 && particleFilter == true)
        {
            return 2770;
        }
        if (10 <= kmPrL && kmPrL < 15 && particleFilter == true)
        {
            return 1850;
        }
        if (15 <= kmPrL && kmPrL < 20 && particleFilter == true)
        {
            return 1390;
        }
        if (20 <= kmPrL && kmPrL < 50 && particleFilter == true)
        {
            return 130;
        }
        if ( kmPrL < 5 && particleFilter == false)
        {
            return 16260;
        }
        if (5 <= kmPrL && kmPrL < 10 && particleFilter == false)
        {
            return 3770;
        }
        if (10 <= kmPrL && kmPrL < 15 && particleFilter == false)
        {
            return 2850;
        }
        if (15 <= kmPrL && kmPrL < 20 && particleFilter == false)
        {
            return 2390;
        }
        if (20 <= kmPrL && kmPrL < 50 && particleFilter == false)
        {
            return 1130;
        }
        return 0;
    }
    }

