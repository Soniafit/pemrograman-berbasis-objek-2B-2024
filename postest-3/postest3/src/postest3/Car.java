package postest3;

public class Car extends Vehicle implements alamat {

    public final String type;

    // Constructor Car class
    public Car(String brand, String ownerName, int year, long price, String type) {
        super(brand, ownerName, year, price);
        this.type = type;
    }

    // Implementasi dari abstract method 
    @Override
    public void displayInfo() {
        System.out.println("Nama Pemilik: " + ownerName);
        System.out.println("Brand: " + brand);
        System.out.println("Tahun: " + year);
        System.out.println("Harga: " + price);
        System.out.println("Type: " + type);
    }
    
    public void tempat(){
        System.out.println("ALAMAT TOKO");
        System.out.println("JL.Raya Situbondo");
    }
    
    public void inpotoko(String nama){
        System.out.println("TOKO JAYA ABADI");
    }
    public void inpotoko(String nama,int no){
        System.out.println("0896-3452-2412");
    }
}   

    