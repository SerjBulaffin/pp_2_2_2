package web.model;

public class Car {
    private String model;
    private double volume;
    private int year;

    public Car() {
    }

    public Car(String model, double volume, int year) {
        this.model = model;
        this.volume = volume;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolume() {
        return volume;
    }


    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", volume=" + volume +
                ", year=" + year +
                '}';
    }
}
