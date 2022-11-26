package task4;

import java.util.*;

class CandyBox {
    // Copy from POO - Lab 3 - Task 3
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
        return "task4.Lindt: The " + getOrigin() + " " + getFlavor() + " chocolate has volume " + getVolume();
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
        return "task4.Baravelli: The " + getOrigin() + " " + getFlavor() + " chocolate has volume " + getVolume();
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

class ChocAmor extends CandyBox {
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
        return "task4.ChocAmor: The " + getOrigin() + " " + getFlavor() + " chocolate has volume " + getVolume();
    }

    // TODO[0]: Add getters and setters

    public float getLength() {
        return length;
    }

    public void setLength(float l) {
        length = l;
    }
}

class CandyBag {
    // Add ArrayList as field "candies"
    private ArrayList<CandyBox> candies = new ArrayList<>();

    // Constructor which populates the array list (the default gift)
    public CandyBag() {
        Lindt l1 = new Lindt("cherry", "Austria", 20F, 5.4F, 19.2F);
        Lindt l2 = new Lindt("apricot", "Austria", 20F, 5.4F, 19.2F);
        Lindt l3 = new Lindt("strawberry", "Austria", 20F, 5.4F, 19.2F);
        Baravelli b1 = new Baravelli("grape", "Italy", 6.7F, 8.7F);
        ChocAmor c1 = new ChocAmor("coffee", "France", 5.5F);
        ChocAmor c2 = new ChocAmor("vanilla", "France", 5.5F);
        candies.add(l1);
        candies.add(l2);
        candies.add(l3);
        candies.add(b1);
        candies.add(c1);
        candies.add(c2);
    }
    // Add getter and setter


    public ArrayList<CandyBox> getCandies() {
        return candies;
    }

    public void setCandies(ArrayList<CandyBox> candies) {
        this.candies = candies;
    }
}

public class Main {
    public static void main(String[] args) {

        // TODO: Uncomment the code after implementing the task.
        
        /*task4.CandyBag presentBag = new task4.CandyBag();

		for (int i = 0; i < presentBag.getCandies().size(); i++) {
			System.out.println(presentBag.getCandies().get(i));
		}*/
    }
}