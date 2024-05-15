package post.test;

class Meja extends Furniture {

    public Meja(String kelas, int jumlah) {
        super(kelas, jumlah);
    }

    @Override
    public String getType() {
        return "Meja";
    }
}
