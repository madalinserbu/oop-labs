package task3;

import java.util.*;

class CandyBox {
    // Copy from POO - Lab 3 - Task 1
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
    // TODO: Generate erequals() and hashCode() methods

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CandyBox) {
            if(origin.hashCode() != ((CandyBox) obj).getOrigin().hashCode())
                return false;
            if (flavor.hashCode() != ((CandyBox) obj).getFlavor().hashCode())
                return false;
        }
        return true;
    }

}

class Lindt extends CandyBox {
    // Copy from POO - Lab 3 - Task 2
    // TODO[0]: Add fields
    public float length;
    public float width;
    public float height;

    // TODO[1]: Constructor without parameters
    public Lindt() {
        this.height = 0;
        this.length = 0;
        this.width = 0;
    }

    // TODO[2]: Constructor which initialize all fields (using super keyword)
    public Lindt(String fl, String or, float l, float w, float h) {
        super.setFlavor(fl);
        super.setOrigin(or);
        length = l;
        width = w;
        height = h;
    }

    public Lindt(float l,float w, float h){
        length = l;
        width = w;
        height = h;
    }

    // TODO[3]: Override getVolume() method
    @Override
    public float getVolume() {
        float i;
        i = height * length * width;
        return i;
    }

    // TODO[4]: Override toString() method - "The [origin] [flavor] has volume [volume]"
    @Override
    public String toString(){
        return "task2.task3.Lindt: The " + getOrigin() + " " + getFlavor() + " chocolate has volume " + getVolume();
    }

    // TODO[0]: Add getters and setters
    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public void setLength(float l) {
        length = l;
    }

    public void setWidth(float w) {
        width = w;
    }

    public void  setHeight(float h) {
        height = h;
    }
}

class Baravelli extends CandyBox {
    // Copy from POO - Lab 3 - Task 2
    // TODO[0]: Add fields
    private float radius;
    private float height;

    // TODO[1]: Constructor without parameters
    public Baravelli() {
        this.radius = 0;
        this.height = 0;
    }

    // TODO[2]: Constructor which initialize all fields  (using super keyword)
    public Baravelli(String fl, String or, float r, float h) {
        super.setFlavor(fl);
        super.setOrigin(or);
        radius = r;
        height = h;
    }

    // TODO[3]: Override getVolume() method
    @Override
    public float getVolume() {
        float i;
        i = (float) (Math.PI * radius * radius * height);
        return i;
    }

    // TODO[4]: Override toString() method - "The [origin] [flavor] has volume [volume]"
    @Override
    public String toString(){
        return "task2.task3.Baravelli: The " + getOrigin() + " " + getFlavor() + " chocolate has volume " + getVolume();
    }

    // TODO[0]: Add getters and setters
    public float getRadius() {
        return radius;
    }

    public float getHeight() {
        return height;
    }

    public void setRadius(float r) {
        radius = r;
    }

    public void setHeight(float h) {
        height = h;
    }
}

class ChocAmor extends CandyBox{
    // Copy from POO - Lab 3 - Task 2
    // TODO[0]: Add fields
    private float length;
    // TODO[1]: Constructor without parameters
    public ChocAmor() {
        this.length = 0;
    }
    // TODO[2]: Constructor which initialize all fields  (using super keyword)
    public ChocAmor(String fl, String or, float l) {
        super.setFlavor(fl);
        super.setOrigin(or);
        length = l;

    }
    // TODO[3]: Override getVolume() method
    @Override
    public float getVolume() {
        float i = length * length * length;
        return i;
    }

    // TODO[4]: Override toString() method - "The [origin] [flavor] has volume [volume]"
    @Override
    public String toString(){
        return "task2.task3.ChocAmor: The " + getOrigin() + " " + getFlavor() + " chocolate has volume " + getVolume();
    }

    // TODO[0]: Add getters and setters

    public float getLength() {
        return length;
    }

    public void setLength(float l) {
        length = l;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flavor = scanner.next();
        String origin = scanner.next();

        // TODO: Uncomment the code after implementing the task.
        
        CandyBox candyBox = new CandyBox(flavor, origin);
        CandyBox candyBoxCopy = new CandyBox(flavor, origin);
        CandyBox candyBox2 = new CandyBox("vanilla", "Belgium");
        
        Lindt lindtBox = new Lindt();
        Lindt lindtBoxCopy = new Lindt(0.0f, 0.0f, 0.0f);
        Lindt lindtBox2 = new Lindt("vanilla", "Belgium", 2.0f, 2.0f, 4.0f);
        
        System.out.println(candyBox.equals(candyBoxCopy));
        System.out.println(candyBox.equals(candyBox2));
        
        System.out.println(lindtBox.equals(lindtBoxCopy));
        System.out.println(lindtBox.equals(lindtBox2));
    }
}