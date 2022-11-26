package task1;

import java.util.*;

class CandyBox {
    // TODO[0]: Add fields
    private String flavor;
    private String origin;

    // TODO[1]: Constructor without parameters which initialize all the fields
    public CandyBox() {
        this.flavor = "sugar-free";
        this.origin = "Switzerland";
    }
    // TODO[2]: Constructor with parameters
    public CandyBox(String fl, String or) {
        flavor = fl;
        origin = or;
    }
    // TODO[3]: Add getVolume() method
    public float getVolume() {
        return 0;
    }
    // TODO[4]: Generate toString() method - "The [origin] [flavor] chocolate"
    public String toString() {
        return "The " + origin + " " + flavor + " chocolate";
    }
    // TODO[0]: Add getters and setters
    public String getFlavor() {
        return flavor;
    }

    public String getOrigin() {
        return origin;
    }

    public void setFlavor(String fl) {
        flavor = fl;
    }

    public void setOrigin(String or) {
        origin = or;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flavor = scanner.next();
        String origin = scanner.next();

        // TODO: Uncomment the code after implementing the task.


        CandyBox candyBoxDefault = new CandyBox();
        CandyBox candyBox = new CandyBox(flavor, origin);

        System.out.println("Constructor with no parameters test:");
        System.out.println(candyBoxDefault + "\n");

        System.out.println("Constructor with parameters test:");
        System.out.println(candyBox + "\n");

        System.out.println("getVolume() test:");
        System.out.println(candyBox + " has volume " + candyBox.getVolume());

    }
}