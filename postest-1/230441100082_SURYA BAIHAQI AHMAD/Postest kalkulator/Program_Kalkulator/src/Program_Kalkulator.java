public class Program_Kalkulator {
    static int staticResult = 0; // contoh penggunaan keyword 'static'
    private int num1;
    private int num2;

    public Program_Kalkulator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add() {
        int result = num1 + num2;
        System.out.println("hasuil penjumlahan: " + result);
        staticResult = result;
    }

    public void subtract() {
        int result = num1 - num2;
        System.out.println("hasil penguranggan: " + result);
        staticResult = result;
    }

    public void multiply() {
        int result = num1 * num2;
        System.out.println(" hasil perkalian : " + result);
        staticResult = result;
    }

    public static void staticMethod() {
        System.out.println(" maaf data anda invalid.");
    }

    public static void main(String[] args) {
        Program_Kalkulator calc = new Program_Kalkulator(10, 5);

        // Memanggil method add()
        calc.add();

        // Memanggil method subtract()
        calc.subtract();

        // Memanggil method multiply()
        calc.multiply();

        // Memanggil static method
        Program_Kalkulator.staticMethod();

        // Mencetak hasil terakhir
        System.out.println("Last result: " + staticResult);
    }
}
