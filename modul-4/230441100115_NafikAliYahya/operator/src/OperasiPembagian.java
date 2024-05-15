class OperasiPembagian extends OperasiBilanganAbs{
    protected double a,b,c;
    protected void setA(double a){
        this.a = a;
    }

    protected void setB(double b) {
        this.b = b;
    }

    protected void setC() {
        this.c = a / b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }



    public void tampil(){
        System.out.println("hasil dari pembagian "+ a+ " / "+ b+" = "+c);
    }
}