package Lessen.H5Flowcontrol.Oefeningen;

public class SwitchStatement {
    public static void main(String[] args) {

        String browser;
        browser = "Opera";
//        List<String> browser = new ArrayList<>(List.of("edge", "Chrome", "Firefox"));

//        if (browser == "Edge") {
//            System.out.println("Je gebruikt Edge");
//        }
//        else if (browser == "chrome" || browser == "firefox" || browser == "opera") {
//            System.out.println("Je gebruikt een moderne browser");
//        }
//        else if (browser == "IE") {
//            System.out.println("Waarom gebruik je Internet Explorer?");
//        }
//        else {
//            System.out.println("Je gebruikt een niet-ondersteunde browser"); }

        switch (browser) {
            case "Edge":
                System.out.println("Je gebruikt Edge");
                break;
            case "Chrome":
            case "Firefox":
            case "Opera":
                System.out.println("Je gebruikt een moderne browser");
                break;
            case "IE":
                System.out.println("Waarom gebruik je Internet Explorer?");
                break;
            default:
                System.out.println("Je gebruikt een niet-ondersteunde browser");
                break;
        }
    }
    }

