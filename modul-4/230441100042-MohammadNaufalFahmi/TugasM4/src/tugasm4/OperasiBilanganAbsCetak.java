/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasm4;

/**
 *
 * @author THINKPAD
 */
final class OperasiBilanganAbsCetak {
    private void cetakSemua(OperasiBilanganAbs[] OB, double a, double b) {
        System.out.println("===== OPERASI BILANGAN ABS =====");
        System.out.println("*   - Bilangan A\t:"+ a+"\t *");
        System.out.println("*   - Bilangan B\t:"+ b+"\t *");
        System.out.println("================================");
            for (OperasiBilanganAbs op : OB) {
                op.set_A(a);
                op.set_B(b);
                op.set_C();
                op.tampil();
            }
        }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         OperasiBilanganAbs[] OB = new OperasiBilanganAbs[4];
        OB[0] = new OperasiPenjumlahan();
        OB[1] = new OperasiPengurangan();
        OB[2] = new OperasiPerkalian();
        OB[3] = new OperasiPembagian();
        

        OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak();
        cetak.cetakSemua(OB, 9.25, 1.25);
    }
}
