class Mahasiswa extends Orang {
    private int nim;
    private double ipk;

    public Mahasiswa(String nama, int nim, double ipk) {
        super(nama);  
        this.nim = nim;
        this.ipk = ipk;
    }

    @Override
    public double hitungNilaiRataRata() {
        return ipk; 
    }

    @Override
    public String toString() {
        System.out.println("==================================");
        return String.format(
                "{nama='%s', nim=%d, ipk=%f}", nama, nim, ipk);
        
    }


}
