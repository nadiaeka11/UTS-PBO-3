public class Pedagang extends Penduduk {
    public Pedagang(String nama, int pendapatan) {
        super(nama, pendapatan);
    }

    public int pajak() {
        return (int) (getPendapatan() * 0.12);
    }

    public int bayar() {
        return getPendapatan() - pajak();
    }

    @Override
    public String toString() {
        return "Pedagang: " + getNama() + ", bayar = " + bayar() + ", pajak = " + pajak();
    }
}
