public abstract class Car {

    //attibutes
    protected int regNr;
    protected String brand;
    protected String model;
    protected int year;
    protected int doorNr;


    public Car(int regNr, String brand, String model, int year, int doorNr) {
        this.regNr = regNr;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.doorNr = doorNr;
    }

    public abstract double greenCharge();


    public int getRegNr() {
        return regNr;
    }

    public void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDoorNr() {
        return doorNr;
    }

    public void setDoorNr(int doorNr) {
        this.doorNr = doorNr;
    }
}
