package task3;

import java.util.*;

class Point {
    private float x;
    private float y;
    // TODO: Add constructor.
    public Point(float a, float b){
        this.x = a;
        this.y = b;
    }
    // TODO: Add changeCoords.
    public void changeCoords(float a, float b){
        x = a;
        y = b;
    }
    // TODO: Add showPoint.
    public String showPoint() {
        return "(" + x + "," + y + ")";
    }

}

class Polygon {
    // TODO: Add constructors.

    // TODO: Add showPolygon.

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x1 = scanner.nextFloat();
        float y1 = scanner.nextFloat();
        float x2 = scanner.nextFloat();
        float y2 = scanner.nextFloat();

        // TODO: Uncomment the code after implementing the task.
        /*task3.Point point = new task3.Point(x1, y1);
        point.showPoint();
        
        point.changeCoords(x2, y2);
        point.showPoint();
        
        int n = scanner.nextInt();
        float[] points = new float[n];
        
        for(int i = 0; i < n; i++) {
            points[i] = i;
        }
        
        task3.Polygon polygon = new task3.Polygon(points);
        System.out.println("Poligonul are urmatoarele coordonate:");
        polygon.showPolygon();*/

    }
}