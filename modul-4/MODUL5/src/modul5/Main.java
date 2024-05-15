/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul5;

/**
 *
 * @author asus
 */
class LivingThings{
    String name;
	
    //constructor
    LivingThings(String name){
        this.name=name;
    }

    void print(){
        System.out.println("\nName \t: " + this.name);
    }

    void live(LivingThings living){
        System.out.println("Tinggal");
    }
}

class Plantae extends LivingThings{
    String type = "Tumbuhan";
    int uk;
    int thn;
    
    Plantae(String name){
        super(name);
    }
    
    void lingkartahun(int uk){
        this.uk=uk;
        System.out.println("Ukuran lingkar tahun : " + uk +"m2");
    }
    
    void lingkartahun(int uk, int thn){
        int total = uk+thn;
        System.out.println("Total lingkar tahun : " + total);
    }
    //override
    @Override
    void print(){
        super.print();
        System.out.println("Tipe \t: " + this.type);
    }
}

class Fungi extends LivingThings{
    String type = "Jamur";

    Fungi(String name){
        super(name);
    }

    //override
    @Override
    void print(){
        super.print();
        System.out.println("Tipe \t: " + this.type);
    }
}

class Animalia extends LivingThings{
    String type = "Hewan";

    Animalia(String name){
        super(name);
    }

    //override
    @Override
    void print(){
        super.print();
        System.out.println("Tipe \t: " + this.type);
    }
}

public class Main{
    public static void main(String[] args) {
        LivingThings mh1 = new LivingThings("Manusia");
        mh1.print();
        
        LivingThings mh2 = new Plantae("Pohon Cemara");
        mh2.print();
        
        LivingThings mh3 = new Plantae("Pohon Beringin");
        LivingThings mh4 = new Fungi("Jamur Kuping");

        //overloading
        Plantae tumbuh1 = new Plantae("Pohon Jati");
        tumbuh1.lingkartahun(12, 2);
        tumbuh1.lingkartahun(12);
        
        //polimorphisme runtime bisa pakai arraylist
        
        LivingThings[] kingdom = new LivingThings[4];
        kingdom[0] = mh1;
        kingdom[1] = mh2;
        kingdom[2] = mh3;
        kingdom[3] = mh4;

        kingdom[0].print();
        kingdom[1].print();
        kingdom[2].print();
	    	kingdom[3].print();
    }
}