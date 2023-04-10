public class Petani extends Penduduk {
    public Petani(String nama, int pendapatan) {
        super(nama, pendapatan);
    }

    public int pajak() {
        return (int) (getPendapatan() * 0.03);
    }

    public int bayar() {
        return getPendapatan() - pajak();
    }

    @Override
    public String toString() {
        return "Petani: " + getNama() + ", bayar = " + bayar() + ", pajak = " + pajak();
    }
}
