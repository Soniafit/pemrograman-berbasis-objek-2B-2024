package modul.pkg6.pbo;

interface Jari {
    double jarijari();
}

interface Panjang {
    double panjang();
}

interface Lebar {
    double lebar();
}

interface Tinggi {
    double tinggi();
}

abstract class BangunRuang {
    abstract double hitungVolume();
    abstract void info();
}