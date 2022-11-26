package task1;

import java.util.*;

class Complex {
    private int real;
    private int imaginary;
    // TODO: Add constructors

    public Complex(int re, int im) {
        real = re;
        imaginary = im;
    }

    public Complex(){
        this(0, 0);
    }


    public Complex(Complex complex) {
        this.real = complex.real;
        this.imaginary = complex.imaginary;
    }

    // TODO: Add getters and setters
    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setReal(int re) {
        real = re;
    }

    public void setImaginary(int im) {
        imaginary = im;
    }

    // TODO: Add addWithComplex
    public void addWithComplex(Complex Complex){
        this.real += Complex.real;
        this.imaginary += Complex.imaginary;
    }
    // TODO: Add showNumber
    public void showNumber(){
        if(imaginary > 0)
            System.out.println(real + " + i * " + imaginary);
        if(imaginary < 0)
            System.out.println(real + " - i * " + (-1)*imaginary);
        if(imaginary == 0)
            System.out.println(real);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int real = scanner.nextInt();
        int imaginary = scanner.nextInt();

        // TODO: Uncomment the code after implementing the task.

        System.out.println("Constructors test:\n");

        Complex c1 = new Complex(real, imaginary);
        c1.showNumber();

        Complex c2 = new Complex(c1);
        c2.showNumber();

        Complex c3 = new Complex();
        c3.showNumber();

        System.out.println("\nAddWithComplex test:\n");

        c1.addWithComplex(c2);
        c1.showNumber();

        c2.addWithComplex(c3);
        c2.showNumber();

        System.out.println("\nGetters and setters test:\n");

        System.out.println(c3.getReal() + " " + c3.getImaginary());
        c3.setReal(6);
        c3.setImaginary(-4);
        System.out.println(c3.getReal() + " " + c3.getImaginary());
    }
}