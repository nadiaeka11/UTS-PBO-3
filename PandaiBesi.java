public class PandaiBesi extends Penduduk {
    public PandaiBesi(String nama, int pendapatan) {
        super(nama, pendapatan);
    }

    public int pajak() {
        return (int) (getPendapatan() * 0.06);
    }

    public int bayar() {
        return getPendapatan() - pajak();
    }

    @Override
    public String toString() {
        return "Pandai Besi: " + getNama() + ", bayar = " + bayar() + ", pajak = " + pajak();
    }
}
