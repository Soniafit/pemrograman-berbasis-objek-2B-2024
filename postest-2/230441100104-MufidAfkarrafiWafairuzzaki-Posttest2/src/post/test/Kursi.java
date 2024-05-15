package post.test;

class Kursi extends Furniture {
    
    public Kursi(String kelas, int jumlah) {
        super(kelas, jumlah);
    }

    @Override
    public String getType() {
        return "Kursi";
    }
}

