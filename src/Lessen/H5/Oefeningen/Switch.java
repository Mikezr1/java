package Lessen.H5.Oefeningen;

public class Switch {
    public static void main(String[] args) {
        String input = "Edge";

        enum browserNames {
            Edge, Google_Chrome, FireFox, Ecosia, IE,
        }

        //datatype + identifier = waarde
        browserNames browser = browserNames.Edge;

        switch (browser) {
            case Edge:
                System.out.println("Je gebruikt Edge");
                break;
            case Google_Chrome, FireFox, Ecosia:
                System.out.println("Je gebruikt een moderne browser");
                break;
            case IE:
                System.out.println("Waarom gerbuik je internet explorerer?");
                break;
            default:
                System.out.println("Je gebruikt geen ondersteunde browser");
                break;
        }
    }
}