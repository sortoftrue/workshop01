package workshop01;

public class Car {
    
    private String registration;
    private String colour;
    private int year;
    private boolean started;

    public Car(String registration, String colour){
        this(registration, colour, 2020, false);
    }

    public Car(String registration, String colour, int year, boolean started) {
        this.registration = registration;
        this.colour = colour;
        this.year = year;
        this.started = started;
    }

    public boolean isStarted(){
        return started;
    }

    public String getRegistration() {
        return registration;
    }
    public void setRegistration(String registration) {
        this.registration = registration;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    

}
