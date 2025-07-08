package Lessen.les4H3Methods.Opdracht;

public class Engine {

    //eigenschappen ven de klasse engine definieren
    private int cylinderVolume;
    private int cylinderAmount;
    private int horsepower;
    private String engineMaker;
    private EngineType type; //Dit is de data type EngineType uit de enum class en als variabele naam type (acces-modifier datatype identifier)

    //constructor met nul waarde / default waarde, zodat je geen errors krijgt als de waarde leeg is.
    public Engine() {
        this.horsepower = -1;
        this.type = EngineType.UNKOWN;
    }

    //constructor

    public Engine(int cylinderVolume, int cylinderAmount, int horsepower, String engineMaker, EngineType type) {
        this.cylinderVolume = cylinderVolume;
        this.cylinderAmount = cylinderAmount;
        this.horsepower = horsepower;
        this.engineMaker = engineMaker;
        this.type = type;
    }


    // print command method-> to string cmd + n > to string

    @Override
    public String toString() {
        return "Engine{" +
                "\ncylinderVolume=" + cylinderVolume +
                "\n, cylinderAmount=" + cylinderAmount +
                "\n\t, horsepower=" + horsepower +
                "\b, engineMaker='" + engineMaker + '\'' +
                "\b, type=" + type +
                '}';
    }




    //getter en setter methods


    public int getCylinderVolume() {
        return cylinderVolume;
    }

    public void setCylinderVolume(int cylinderVolume) {
        this.cylinderVolume = cylinderVolume;
    }

    public int getCylinderAmount() {
        return cylinderAmount;
    }

    public void setCylinderAmount(int cylinderAmount) {
        this.cylinderAmount = cylinderAmount;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    //Overloaded set method 1 -> string naar een  int
    // wrapper class -> parseInt(horsepowerAsString)
    // overload om te zorgen dat Horsepwer ook een string mag zijn bi invoer
    //je maak een nieuwe set methode aan omdat je een nieuwe functie maakt (string en int).
    //accepteert als invoer string met getallen of getallen (int).
    public void setHorsepower(String  horsepowerAsString) {
        this.horsepower = Integer.parseInt(horsepowerAsString); // de ingevoerd String omzetten naar een int
    }

    public String getEngineMaker() {
        return engineMaker;
    }

    public void setEngineMaker(String engineMaker) {
        this.engineMaker = engineMaker;
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }
}


