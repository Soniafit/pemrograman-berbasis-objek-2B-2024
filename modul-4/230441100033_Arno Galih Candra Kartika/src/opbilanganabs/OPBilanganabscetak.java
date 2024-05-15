package opbilanganabs;

public class OPBilanganabscetak {
    public static void main(String[]args) {
        OPPenjumlahan a;
        a = new OPPenjumlahan() {
            protected void set_C(double c) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        a.tampil();
        OPPengurangan b = new OPPengurangan() {
            protected void set_C(double c) {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        };
        b.tampil();
        OPPerkalian c;
        c = new OPPerkalian() {
            protected void set_C(double c) {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        };
        c.tampil();
        OPPembagian d = new OPPembagian() {
            protected void set_C(double c) {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        };
        d.tampil();
    }
}

abstract class OPPenjumlahan extends OPBilanganabscetak {
    protected double a = 9.25;
    protected double b = 1.25;
    protected double c;

    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected void set_C() {
        this.c = c;
    }

    protected double get_A() {
        return a;
    }

    protected double get_B() {
        return b;
    }

    protected double get_C() {
        c = get_A() + get_B();
        return c;
    }

    protected void tampil() {
        System.out.println("=====");
        System.out.println("Operasi Penjumlahan");
        System.out.println("bilangan A = " + get_A());
        System.out.println("bilangan B = " + get_B());
        System.out.println("hasil penjumlahan A+B = " + get_C());
    }
}

abstract class OPPengurangan extends OPBilanganabscetak {
    protected double a = 9.25;
    protected double b = 1.25;
    protected double c;

    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected void set_C(double c) {
        this.c = c;
    }

    protected double get_A() {
        return a;
    }

    protected double get_B() {
        return b;
    }

    protected double get_C() {
        c = get_A() - get_B();
        return c;
    }

    protected void tampil() {
        System.out.println("=====");
        System.out.println("Operasi Pengurangan");
        System.out.println("bilangan A = " + get_A());
        System.out.println("bilangan B = " + get_B());
        System.out.println("Hasil Pengurangan A-B = " + get_C());
        System.out.println("=====");
    }
}

abstract class OPPerkalian extends OPBilanganabscetak {
    protected double a = 9.25;
    protected double b = 1.25;
    protected double c;

    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected void set_C() {
        this.c = c;
    }

    protected double get_A() {
        return a;
    }

    protected double get_B() {
        return b;
    }

    protected double get_C() {
        c = get_A() * get_B();
        return c;
    }

    protected void tampil() {
        System.out.println("=====");
        System.out.println("Operasi Perkalian");
        System.out.println("bilangan A = " + get_A());
        System.out.println("bilangan B = " + get_B());
        System.out.println("Hasil Perkalian AxB = " + get_C());
        System.out.println("=====");
    }
}

abstract class OPPembagian extends OPBilanganabscetak {
    protected double a = 9.25;
    protected double b = 1.25;
    protected double c;

    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected void set_C() {
        this.c = c;
    }

    protected double get_A() {
        return a;
    }

    protected double get_B() {
        return b;
    }

    protected double get_C() {
        c = get_A() / get_B();
        return c;
    }

    protected void tampil() {
        System.out.println("=====");
        System.out.println("Operasi Pembagian");
        System.out.println("bilangan A = " + get_A());
        System.out.println("bilangan B = " + get_B());
        System.out.println("Hasil Pembagian A/B = " + get_C());
        System.out.println("=====");
    }
}