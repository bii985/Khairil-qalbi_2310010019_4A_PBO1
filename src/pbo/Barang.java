
package pbo;

public class Barang {
    protected String kategori;

    public Barang(String kategori) {
        this.kategori = kategori;
    }

    public void tampilkanInfo() {
        System.out.println("Kategori: " + kategori);
    }
}

