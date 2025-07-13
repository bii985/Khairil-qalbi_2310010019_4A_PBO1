
package pbo;

public class Helm extends Barang {
    private String merk;
    private String model;
    private int ukuran;
    private int stok;

    public Helm(String kategori, String merk, String model, int ukuran, int stok) {
        super(kategori);
        this.merk = merk;
        this.model = model;
        this.ukuran = ukuran;
        this.stok = stok;
    }

    // Getter & Setter (Encapsulation)
    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getUkuran() { return ukuran; }
    public void setUkuran(int ukuran) { this.ukuran = ukuran; }

    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }

    // Override method dari Barang (Polymorphism)
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Helm - Merk: " + merk + " | Model: " + model +
                " | Ukuran: " + ukuran + " | Stok: " + stok);
    }
}

