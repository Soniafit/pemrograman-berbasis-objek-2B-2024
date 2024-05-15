package posttest2;

/**
 *
 * @author asus
 */
public class Tambah extends Operator {
    double a,b,c;
    protected void set_a(double a){
        this.a = a;}
    protected void set_b(double b){
        this.b = b;}
    protected double get_a(){
    return a ;}
    protected double get_b(){
    return b ;}
    
    protected void tampilkan(){
    c = a+b;
    System.out.println("Hasil Penjumlahan : " + c);
    }
}
