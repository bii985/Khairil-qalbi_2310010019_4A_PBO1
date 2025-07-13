
package pbo;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Helm[] daftarHelm = new Helm[10];
        int jumlahData = 0;
        int pilihan = -1;

        do {
            System.out.println("\n=== MENU TOKO HELM ===");
            System.out.println("1. Tambah Helm");
            System.out.println("2. Tampilkan Semua Helm");
            System.out.println("3. Cari Helm");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            
            try {
                pilihan = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input harus angka!");
                continue;
            }

            switch (pilihan) {
                case 1 -> {
                    try {
                        if (jumlahData >= daftarHelm.length) {
                            System.out.println("Stok penuh.");
                            break;
                        }

                        System.out.print("Merk: ");
                        String merk = scanner.nextLine();
                        System.out.print("Model: ");
                        String model = scanner.nextLine();
                        System.out.print("Ukuran (contoh: 58): ");
                        int ukuran = Integer.parseInt(scanner.nextLine());
                        System.out.print("Stok: ");
                        int stok = Integer.parseInt(scanner.nextLine());

                        Helm helm = new Helm("Helm", merk, model, ukuran, stok);
                        daftarHelm[jumlahData] = helm;
                        jumlahData++;

                        System.out.println("Helm berhasil ditambahkan.");
                    } catch (Exception e) {
                        System.out.println("Input tidak valid.");
                    }
                }
                case 2 -> {
                    System.out.println("=== Daftar Helm ===");
                    if (jumlahData == 0) {
                        System.out.println("Belum ada data.");
                    } else {
                        for (int i = 0; i < jumlahData; i++) {
                            daftarHelm[i].tampilkanInfo();
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Masukkan merk yang dicari: ");
                    String cariMerk = scanner.nextLine();
                    boolean ditemukan = false;
                    for (int i = 0; i < jumlahData; i++) {
                        if (daftarHelm[i].getMerk().equalsIgnoreCase(cariMerk)) {
                            daftarHelm[i].tampilkanInfo();
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Helm tidak ditemukan.");
                    }
                }
                case 0 -> System.out.println("Terima kasih!");
                default -> System.out.println("Menu tidak valid.");
            }

        } while (pilihan != 0);
    }
}
