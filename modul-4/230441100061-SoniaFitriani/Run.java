/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package run;

/**
 *
 * @author sonia
 */
abstract class OperasiBilanganAbs {
    protected double a, b, c;

    abstract protected void setA(double a);

    abstract protected void setB(double b);

    abstract protected void setC();

    abstract protected double getA();

    abstract protected double getB();

    abstract protected double getC();

    abstract protected void display();
}

class OperasiPenjumlahan extends OperasiBilanganAbs {
    @Override
    protected void setA(double a) {
        this.a = a;
    }

    @Override
    protected void setB(double b) {
        this.b = b;
    }

    @Override
    protected void setC() {
        this.c = a + b;
    }

    @Override
    protected double getA() {
        return a;
    }

    @Override
    protected double getB() {
        return b;
    }

    @Override
    protected double getC() {
        return c;
    }

    @Override
    protected void display() {
        System.out.println("Hasil penjumlahan: " + getC());
    }
}

class OperasiPengurangan extends OperasiBilanganAbs {
    @Override
    protected void setA(double a) {
        this.a = a;
    }

    @Override
    protected void setB(double b) {
        this.b = b;
    }

    @Override
    protected void setC() {
        this.c = a - b;
    }

    @Override
    protected double getA() {
        return a;
    }

    @Override
    protected double getB() {
        return b;
    }

    @Override
    protected double getC() {
        return c;
    }

    @Override
    protected void display() {
        System.out.println("Hasil pengurangan: " + getC());
    }
}
class OperasiPerkalian  extends OperasiBilanganAbs {
    @Override
    protected void setA(double a) {
        this.a = a;
    }

    @Override
    protected void setB(double b) {
        this.b = b;
    }

    @Override
    protected void setC() {
        this.c = a * b;
    }

    @Override
    protected double getA() {
        return a;
    }

    @Override
    protected double getB() {
        return b;
    }

    @Override
    protected double getC() {
        return c;
    }

    @Override
    protected void display() {
        System.out.println("Hasil pengurangan: " + getC());
    }
}
class OperasiPembagian extends OperasiBilanganAbs {
    @Override
    protected void setA(double a) {
        this.a = a;
    }

    @Override
    protected void setB(double b) {
        this.b = b;
    }

    @Override
    protected void setC() {
        this.c = a / b;
    }

    @Override
    protected double getA() {
        return a;
    }

    @Override
    protected double getB() {
        return b;
    }

    @Override
    protected double getC() {
        return c;
    }

    @Override
    protected void display() {
        System.out.println("Hasil pengurangan: " + getC());
    }
}
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double bilanganA = 9.25;
        double bilanganB = 1.25;

        OperasiPenjumlahan penjumlahan = new OperasiPenjumlahan();
        penjumlahan.setA(bilanganA);
        penjumlahan.setB(bilanganB);
        penjumlahan.setC();
        penjumlahan.display();

        OperasiPengurangan pengurangan = new OperasiPengurangan();
        pengurangan.setA(bilanganA);
        pengurangan.setB(bilanganB);
        pengurangan.setC();
        pengurangan.display();
        
        OperasiPerkalian perkalian = new OperasiPerkalian();
        perkalian.setA(bilanganA);
        perkalian.setB(bilanganB);
        perkalian.setC();
        perkalian.display();
        
        OperasiPembagian pembagian = new OperasiPembagian();
        pembagian.setA(bilanganA);
        pembagian.setB(bilanganB);
        pembagian.setC();
        pembagian.display();

    }
    
}
