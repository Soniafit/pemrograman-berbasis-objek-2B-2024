package post.test;

interface Panjang {
    double panjang();
}

interface Lebar {
    double lebar();
}

abstract class Furniture {
    abstract double hitungLuas();
    abstract void info();
    abstract void kelas();
}
