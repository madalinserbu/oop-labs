package task5;

import java.util.*;

class CandyBox {
    // Copy from POO - Lab 3 - Task 4
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
    // Copy from POO - Lab 3 - Task 4
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
        return "task4.task5.Lindt: The " + getOrigin() + " " + getFlavor() + " chocolate has volume " + getVolume();
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


    // TODO: Add printLindtDim() method

    public void printLindtDim() {
        System.out.println("task5.Lindt: " + length + " " + width + " " + height);
    }
}

class Baravelli extends CandyBox {
    // Copy from POO - Lab 3 - Task 4

    // TODO: Add printBaravelliDim() method
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
        return "task4.task5.Baravelli: The " + getOrigin() + " " + getFlavor() + " chocolate has volume " + getVolume();
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

    public void printBaravelliDim() {
        System.out.println("task5.Baravelli: " + radius + " " + height);
    }
}

class ChocAmor extends CandyBox {
    // Copy from POO - Lab 3 - Task 4
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
        return "task4.task5.ChocAmor: The " + getOrigin() + " " + getFlavor() + " chocolate has volume " + getVolume();
    }

    // TODO[0]: Add getters and setters

    public float getLength() {
        return length;
    }

    public void setLength(float l) {
        length = l;
    }

    // TODO: Add printChocAmorDim() method
    public void printChocAmorDim() {
        System.out.println("task5.ChocAmor: " + length);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flavor = scanner.next();
        String origin = scanner.next();
        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        float height = scanner.nextFloat();
        float radius = scanner.nextFloat();

        // TODO: Uncomment the code after implementing the task.

        CandyBox lindtBox = new Lindt(flavor, origin, length, width, height);
        CandyBox baravelliBox = new Baravelli(flavor, origin, radius, height);
        CandyBox chocAmorBox = new ChocAmor(flavor, origin, length);

        ((Lindt) lindtBox).printLindtDim();
        ((Baravelli)baravelliBox).printBaravelliDim();
        ((ChocAmor)chocAmorBox).printChocAmorDim();
    }
}