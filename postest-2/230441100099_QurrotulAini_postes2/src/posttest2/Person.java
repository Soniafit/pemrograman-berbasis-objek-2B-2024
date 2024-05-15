package posttest2;

public abstract class Person{
    //Atribut
    String Nama, Tanggal;
    int Umur;
    double BeratBadan;
    
    //Constructor
    public Person(String Nama,int Umur,String Tanggal,double BeratBadan){
        this.Nama = Nama;
        this.Umur = Umur;
        this.Tanggal = Tanggal;
        this.BeratBadan = BeratBadan;
    }
    
    //Abstract Method
    public abstract void diet();
}
