package Lessen.les4H3Methods.Opdracht;

public class Car {

    //Eigenschappen van de klasse
    private String brandName;
    private String modelName;
    private int year;
    private Engine engine;

    //null pointer expecation -> referentie naar null/niks kan niks
    //standaaerd auto (default) maken
    //refrentie waarde = getallen -> 0
    //primitieve waarde = string -> null
    //Om errors te voorkomen -> vang ze af met de onderstaande leegwaardes.

    public Car(){
        this.brandName = "";
        this.modelName = "";
        this.year = 0;
        this.engine = null;
    }

    //Constructor van de klasse eigenschappen

    public Car(String brandName, String modelName, int year, Engine engine) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.year = year;
        this.engine = engine;
    }

    // print command -> to string cmd + n

    @Override
    public String toString() {
        return "Car{" +
                "\n brandName ->'" + brandName + '\'' +
                "\n, modelName='" + modelName + '\'' +
                "\n, year=" + year +
                "\n, engine='" + engine + '\'' +
                '}';
    }


    //Overloaded constructor -> missende waarde afvangen of verschillende waarde aanvragen.


    //extra methode voor Getter en Setter
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    //Constructor die de setEngine checkt op horsepower en bij 50 of hoger een melding geeft
    //Overload set method 2 -> je haalt een parameter binnen en geeft een melding bij een bepaalde hoogte. Daarom pas je de bestaande get aan.
    public void setEngine(Engine engine) {
        if (engine.getHorsepower() >= 300) {
            System.out.println("Pas op, deze motor heeft veel vermogen!");
        }
    }
}

