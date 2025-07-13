# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi Manajemen Data Helm  Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini berfungsi untuk mengelola data helm di toko, mulai dari menambahkan, menampilkan, sampai mencari helm berdasarkan merek. Dibuat dengan konsep OOP seperti class, objek, inheritance, dan polymorphism, program ini berjalan lewat terminal dengan tampilan sederhana namun cukup lengkap.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Barang`, `Helm`, dan `MainApp` adalah contoh dari class.

```bash
public class Barang {
    ...
}

public class Helm extends Barang {
    ...
}

public class MainApp {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Helm helm = new Helm("Helm", merk, model, ukuran, stok);
` adalah contoh pembuatan object.

```bash
Helm helm = new Helm("Helm", merk, model, ukuran, stok);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `kategori` dan `merk` adalah contoh atribut.

```bash
String kategori;
String merk;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Barang` dan `Helm`.

```bash
public Barang(String kategori) {
    this.kategori = kategori;
}

public Helm(String kategori, String merk, String model, int ukuran, int stok) {
    super(kategori); 
    this.merk = merk;
    this.model = model;
    this.ukuran = ukuran;
    this.stok = stok;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMerk` dan `setModel` adalah contoh method mutator.

```bash
public void setMerk(String merk) {
    this.merk = merk;
}

public void setModel(String model) {
    this.model = model;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerk`, `getModel`, `getUkuran`, dan `getStok` adalah contoh method accessor.

```bash
public String getMerk() {
    return merk;
}

public String getModel() {
    return model;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `kategori`, `merk`, `model`, `ukuran` dan `stok` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String merk;
private String model;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Helm` mewarisi `Barang` dengan sintaks `extends`.

```bash
public class Helm extends Barang {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkaninfo()` di `Helm`merupakan override dari method `tampilkaninfo` di `Barang`.

```bash
 public void tampilkanInfo() {
    System.out.println("Kategori: " + kategori);
}

@Override
public void tampilkanInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch`dan seleksi `if else`.

```bash
switch (pilihan) {
    case 1 -> { ... }
    case 2 -> { ... }
    case 3 -> { ... }
    case 0 -> System.out.println("Terima kasih!");
    default -> System.out.println("Menu tidak valid.");
}

 if (jumlahData == 0) {
    System.out.println("Belum ada data.");
  } else {
    for (int i = 0; i < jumlahData; i++) {
    daftarHelm[i].tampilkanInfo();
  }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `do while` Untuk Menjalankan menu utama berulang sampai keluar dan `for`Untuk Menampilkan atau mencari data dalam array helm
.

```bash
for (int i = 0; i < jumlahData; i++) {
    daftarHelm[i].tampilkanInfo();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Merk: ");
String merk = scanner.nextLine();

System.out.print("Model: ");
String model = scanner.nextLine();

System.out.println("Helm berhasil ditambahkan.");

```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Helm[] daftarHelm = new Helm[10];` adalah contoh penggunaan array.

```bash
Helm[] daftarHelm = new Helm[10];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    ...
    int ukuran = Integer.parseInt(scanner.nextLine());
    int stok = Integer.parseInt(scanner.nextLine());
    ...
} catch (Exception e) {
    System.out.println("Input tidak valid.");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Khairil qalbi
NPM: 2310010019
