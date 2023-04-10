public class Ksatria extends Penduduk {
    public Ksatria(String nama, int pendapatan) {
        super(nama, pendapatan);
    }

    public int pajak() {
        return (int) (getPendapatan() * 0.18);
    }

    public int bayar() {
        return getPendapatan() - pajak();
    }

    @Override
    public String toString() {
        return "Ksatria: " + getNama() + ", bayar = " + bayar() + ", pajak = " + pajak();
    }
}
