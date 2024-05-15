/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul4;

/**
 *
 * @author HP VICTUS
 */
final class OperasiBilanganAbsCetak {
    private static void cetaksemua(OperasiBilanganAbs[]OBA, double a,double b){
        OBA[0] = new OperasiPenjumlahan();
        OBA[1] = new OperasiPengurangan();
        OBA[2] = new OperasiPerkalian();
        OBA[3] = new OperasiPembagian();
       
System.out.println("==================================");
        System.out.println("| Bilangan A\t: " + a + "\t            |");
        System.out.println("| Bilangan B\t: " + b + "\t            |");
       
System.out.println("==================================");
        
        for (OperasiBilanganAbs OBA1 : OBA) {
            OBA1.set_A(a);
            OBA1.set_B(b);
            OBA1.set_C();
            OBA1.tampil();
        }
    }
    public static void main(String[]args){
        OperasiBilanganAbs[] OBA = new OperasiBilanganAbs[4];
        cetaksemua(OBA, 9.25, 1.25);
    }
}

        
