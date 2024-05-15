package projectmodul4;

public class OperasiPenjumlahan extends OperasiBilanganAbs {
    double a = 9.25;
    double b = 1.25;
    double c;;

    void set_A(double a) {
        this.a = a;
    }

    void set_B(double b) {
        this.b = b;
    }
    
    void set_C(){
        
    }
    
    double get_A() {
        return a;
    }

    double get_B() {
        return b;
    }

    double get_C() {
        c = get_A() + get_B();
        return c;
    }

    void tampil() {
        System.out.println("================================");
        System.out.println("      Operasi Penjumlahan       ");
        System.out.println("Bilangan A = " + get_A());
        System.out.println("Bilangan B = " + get_B());
        System.out.println("Hasil Penjumlahan A + B = " + get_C());
        System.out.println("================================");
    }
}