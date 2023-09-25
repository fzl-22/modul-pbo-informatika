# Pengenalan Object Oriented Programming

```
DAFTAR ISI

1. Instalasi Software (JDK 17 dan Netbeans 13)
    1.1 Instalasi di Windows
    1.2 Instalasi di Linux
    1.3 Proyek Pertama
2. Apa Itu Object Oriented Programming?
    2.1 Apa itu pemrograman berbasis objek?
3. Contoh Implementasi Pemrograman Berbasis Objek
```

## 1. Instalasi Software (JDK 17 dan Netbeans 13)

Dalam praktikum mata kuliah Pemrograman Berorientasi Object, mahasiswa akan menggunakan 2 software berikut:

1. JDK 17 (Java Development Kit 17). Merupakan lingkungan pengembangan untuk bahasa Java. Di dalam JDK, terdapat development tools untuk pengembangan Java dan JRE (Java Runtime Environment) yang berisi Java Virtual Machine (JVM). JVM digunakan untuk melakukan eksekusi program Java. Di praktikum ini, mahasiswa menggunakan JDK versi 17.

2. NetBeans 13. Netbeans merupakan IDE (Integrated Development Environments) yang sering digunakan untuk pengembangan Java. Dalam praktikum ini, mahasiswa menggunakan NetBeans versi 13.

### 1.1 Instalasi di Windows

#### 1.1.1 Install Java Development Kit 17

- Download JDK sesuai dengan OS yang dipakai pada link berikut [JDK 17.08 ](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
  ![image](<./assets/windows/JDK_windows(1).png>)

- Pilih Windows untuk selanjutnya [Windows x64 Installer](https://download.oracle.com/java/17/archive/jdk-17.0.8_windows-x64_bin.exe)
  ![image](<./assets/windows/JDK_windows(2).png>)

- Pilih `Next` hingga muncul `Directory Installation`,jika sudah benar maka tekan `Next`

  ![image](<./assets/windows/JDK_windows(3).png>)

- Jika sudah benar anda bisa menekan `Close`

  ![image](<./assets/windows/JDK_windows(4).png>)

#### 1.1.2 Setup JDK Environment

- Tekan logo windows, lalu ketik `edit the system environment variables`.

  ![image](<./assets/windows/JDK_windows(5).png>)

- Pilih `environment variables` dan tekan

  ![image](<./assets/windows/JDK_windows(6).png>)

- Pilih new dibagian `System Variables`, lalu isi Variable name dengan `JAVA_HOME` dan variable value dengan `C:\Program Files\Java\jdk-17` ,lalu tekan ok

  ![image](<./assets/windows/JDK_windows(7).png>)

- Testing , cara mengecek apakah JDK kita sudah terinstall dengan benar adalah menggunakan :
  ```bash
  Open CMD [ WINDOWS + R ] , lalu ketik `cmd`
  lalu ketik `java --version`
  ```
  disaya muncul versi 20 dikarnakan saya sedang menggunakan versi 20.
  ![image](<./assets/windows/JDK_windows(8).png>)

#### 1.1.3 IDE Installations

- buka browser dan cari Netbeans 13 atau [klick disini](https://netbeans.apache.org/download/nb13/nb13.html)

  ![image](<./assets/windows/Netbeans_windows(1).png>)

- Pilih sesuai OS yang anda gunakan [Windows](https://archive.apache.org/dist/netbeans/netbeans-installers/13/Apache-NetBeans-13-bin-windows-x64.exe)

- Jika selesai didownload maka lanjut installasinya , klick `next` hingga muncul `Setup Environmentnya`
  ![image](<./assets/windows/Netbeans_windows(3).png>)
- Pilih JDK 17 yang telah kita install tadi,lalu tekan `next` lalu tekan `install`
  ![image](<./assets/windows/Netbeans_windows(4).png>)
- tunggu installation sampai selesai , lalu tekan `finish`
  ![image](<./assets/windows/Netbeans_windows(5).png>)

### 1.2 Installasi di Linux (Debian, Ubuntu, dan turunannya)

#### 1.2.1 Install Java Development Kit 17

Update _package list_ sistem operasi dengan menjalankan command berikut:

```bash
sudo apt update
```

Kemudian, install package `openjdk-17-jdk` dengan cara:

```bash
sudo apt install openjdk-17-jdk
```

Setelah selesai, maka instalasi Java akan terletak di `/usr/lib/jvm/java-17-openjdk-amd64`. Untuk berjaga-jaga, buat environment variable baru dengan nama `JAVA_HOME` dengan cara:

1. Buka file `~/.bashrc` dengan perintah: `vim ~/.bashrc` (bisa menggunakan text editor lain).
2. Pada bagian paling akhir file, tambahkan baris baru dan tuliskan: `JAVA_HOME="/usr/lib/jvm/java-17-openjdk-amd64"`. Kemudian, simpan dan keluar.
3. Setelah itu, reload shell dengan perintah: `source ~/.bashrc`.

Kemudian, periksa instalasi Java dengan ketiga perintah berikut:

```bash
java --version
javac --version
javadoc --version
```

Jika ada output seperti berikut, maka instalasi Java telah berhasil.

![](./assets/linux/check-java.png)

#### 1.2.2 Install IDE Netbeans 13

Pertama-tama, download installer script Netbeans 13 dari web [apache.org](apache.org) dengan perintah berikut:

```bash
wget -c -O Apache-NetBeans-13-bin-linux-x64.sh https://archive.apache.org/dist/netbeans/netbeans-installers/13/Apache-NetBeans-13-bin-linux-x64.sh
```

Masuk ke direktori `/tmp`. Kemudian, beri hak akses _execute_ oleh user terhadap file tersebut:

```bash
cd /tmp
chmod u+x Apache-NetBeans-13-bin-linux-x64.sh
```

Setelah itu, jalankan installer script tersebut dengan perintah berikut:

```
./Apache-NetBeans-13-bin-linux-x64.sh
```

Maka, akan muncul installer wizard. Klik **next** hingga menemui bagian pemilihan path instalasi Netbeans dan JDK untuk Netbeans.

- **Path instalasi Netbeans**: biarkan default
- **Path JDK** : Pilih path JDK 17 yang baru saja diinstall, yaitu `/usr/lib/jvm/java-17-openjdk-amd64`.

![](./assets/linux/netbeans-path.png)

Klik **next** hingga pilih **install**. Tunggu hingga instalasi selesai. Lalu klik **Finish**.

![](./assets/linux/install-netbeans-success.png)

### 1.3 Proyek Pertama

1. Buka IDE NetBeans. Lihat tab di pojok kiri atas. Pilih `File -> New Project`.

   ![](./assets/netbeans/1.%20buka%20netbeans.png)

2. Pilih kategori `Java with Maven` dan project `Java Application`.

   ![](./assets/netbeans/2.%20pilih%20maven%20dan%20java%20application.png)

3. Beri nama project `praktikum1`. Teman-teman juga bisa mengubah lokasi project. Tetapi biarkan default untuk sekarang. Lalu, klik **Finish**

   ![](./assets/netbeans/3.%20beri%20nama%20project.png)

4. Setelah itu, akan muncul tampilan berikut.

   ![](./assets/netbeans/4.%20tampilan%20ide.png)

   Ada beberapa bagian utama yang perlu diperhatikan:

   - Block atas: `tab bar`, berisi menu-menu utama NetBeans.
   - Block kiri atas: `project tree`, yaitu daftar direktori dan file dalam project Java untuk navigasi file/direktori.
   - Blok kanan atas: `code editor`, yaitu tempat menulis kode Java.
   - Blok kanan bawah: `terminal`, yaitu tempat dieksekusinya project Java. Block ini akan menampilkan build process, build status, dan output project Java ketika dijalankan.

5. Coba ubah `Hello World` menjadi `Hello Informatika`, kemudian klik tombol **Run Project** (tombol ini ada di tab bar, berbentuk panah hijau). Setelah itu, perhatikan block terminal, **apa yang terjadi?**

   ![](./assets/netbeans/5.%20run%20project.png)

## 2. Apa Itu Object Oriented Programming?

Pembahasan Materi :

1. Definisi OOP
2. Object dan Class
3. Atribut
4. Method

### 2.1 Apa itu Pemograman Berbasis Objek?

**_Pemograman berbasis objek_** atau Object Oriented Programming adalah metode pemograman yang berorientasi pada objek. Metode ini dibuat untuk menyediakan kebutuhan pengembangan program yang semakin hari semakin kompleks. Salah satu kekompleksan dari kebutuhan pengembangan program adalah kebutuhan untuk menyimpan beberapa jenis data dan fungsi secara bersamaan dalam satu variabel. Kekompleksan tersebut tidak dapat dipenuhi oleh tipe data primitve yang hanya mengizinkan satu variabel mempunyai satu tipe data saja, dan struct yang mampu menyimpan beberapa jenis tipe data, namun tidak mampu dalam menyimpan fungsi.

![](https://camo.githubusercontent.com/d4ce99e7440871397350b5433433a2195794a96eb521ae974055b8185745bb66/68747470733a2f2f686f6c79636f646572732e636f6d2f636f6e74656e742f696d616765732f776f726470726573732f323031392f31322f4f626a6563742d4f7269656e7465642d50726f6772616d6d696e672e706e67)

Selain object, dalam Object Oriented Programming juga dikenal class. Class merupakan cetakan/template dari object dan object merupakan hasil cetakan atau wujud dari class. Berikut merupakan penulisan kode program dari deklarasi object dan class :

```java
// Penulisan Class :  class <NamaClass>
class NamaClass{ // <-- Deklarasi Class (Class harus ada di atas class utama)
  // attribute & method
}

public class NamaFile{ // <-- Nama class pada class utama harus sama dengan nama fila (biasanya terisi otomatis ketika membuat file baru)
    public static void main(String[] args){
        NamaClass namaObject = new NamaClass(); // <-- Deklarasi Object <NamaClass> <NamaObject> = new <NamaClass>
    }
}
```

Dengan menggunakan class, dapat dilakukan pengelompokan berbagai jenis yang data menggunakan atribut dan juga dapat mengolah data tersebut menggunakan method.

#### 2.1.1 Atribut

Atribut merupakan nilai atau kumpulkan nilai yang dimiliki oleh dan dituliskan di dalam class. Mudahnya atribut dapat diilustrasikan sebagai ciri-ciri yang mempresentasikan karakteristik dari object. Berikut contoh penulisan atribut dalam bahasa Java :

```java
class NamaClass{
     // Deklarasi Atribut (seluruh atribut akan dimiliki oleh tiap object yang dideklarasikan)
    int nomor; // Penulisan atribut : <modifier> (opsional) <TipeData> <NamaAtribut>
    Char huruf;
    String kalimat;
    float pecahan;
}

public class NamaFile{ // <-- Nama class pada class utama harus sama dengan nama filenya (biasanya terisi otomatis ketika membuat file baru)
    public static void main(String[] args){
        NamaClass namaObject = new NamaClass(); // <-- Deklarasi Object

        // Untuk memberikan nilai terhadap atribut dapat dilakukan dengan cara berikut : <NamaObject>.<NamaAtribut> = Nilai
        namaObject.nomor = 1;
        namaObject.huruf = 'a';
        namaObject.kalimat = "ini nilai";
        namaObject.pecahan = 2.1f // Pada Java nilai float harus diikuti dengan f dibelakang nilai atau (float) di depan nilainya. Contoh : (float) 1/2
    }
}
```

#### 2.1.2 Method

Method merupakan perilaku dari object. Perilaku ini berupa statement program yang dituliskan dalam bentuk fungsi atau prosedur untuk melakukan pengolahan nilai atau tidak. Mudahnya method merupakan function atau procedur yang dituliskan/dimiliki oleh class. Berikut merupakan penulisan method di dalam class :

```java
class NamaClass{
    int nomor1, nomor2;
    // Penulisan method : <TipeData> <NamaMethod> (<TipeData Parameter> <NamaParameter (Opsional)){ <Statement> }
    void tampilkanNomor(){ // <--- Method dalam bentuk prosedur tanpa melakukan pengolahan data
        System.out.printf("Nomer 1 : %d dan Nomer 2 : %d\n", nomor1, nomor2);
    }
    int tambahkanNomor(){  // <--- Method dalam bentuk fungsi dan melakukan pengolahan data
        return nomor1 + nomor2;
    }
}

public class NamaFile {
    public static void main(String[] args) {
        NamaClass namaObject = new NamaClass();
        namaObject.nomor1 = 1;
        namaObject.nomor2 = 2;

        // Melakukan pemanggilan/penggunaan method :
        namaObject.tampilkanNomor();
        int hasil = namaObject.tambahkanNomor(); // variabel hasil akan menyimpan return value/nilai kembalian dari method
        
        // Atau dapat langsung ditampilkan seperti ini :
        System.out.printf("Hasil dari penjumlahan = %d\n", namaObject.tambahkanNomor()); // Hasil dari pemanggilan method akan ditampung oleh %d
    }
}
```

### 3. Contoh Implementasi Pemrograman Berbasis Objek

Berikut merupakan contoh dari penulisan OOP dalam bahasa Java :

```java
class Manusia{
    String warnaRambut, warnaKulit, nama; // <--- Atribut (berupa variabel)
    int umur;

    void tampilCiri(){ // <--- Method dalam bentuk prosedur (tanpa nilai kembalian)
        System.out.println("Nama : " + nama);
        System.out.println("Warna Kulit : " + warnaKulit);
        System.out.println("Warna Rambut : " + warnaRambut);
        System.out.println("Umur : " + tampilUmur());
    }
    
    int tampilUmur(){   // <--- Method dalam bentuk fungsi (dengan nilai kembalian)
        return umur;
    }
}

/*
Untuk menggunakan seluruh isi dari class, maka diperlukan object yang akan memuat dan mempresentasikan keseluruhan nilai dari class.
Berikut merupakan penulisan dari deklarasi object :
*/

public class Pertama {
    public static void main(String[] args) {
        Manusia mantanTerindah = new Manusia(); // Struktur : NamaClass NamaObject = new NamaObject();
        Manusia bismillahJodoh = new Manusia();
        // Cara Memanggil Method :
        mantanTerindah.tampilCiri();
        bismillahJodoh.tampilCiri();
    }
}
```

Dalam kode program di atas, terdapat object dengan nama mantanTerindah dan bismillahJodoh, dengan menggunakan class maka kedua object tersebut dapat memiliki atribut dan method atau ciri dan karateristik yang sama. Sehingga tidak perlu didefinisikan ciri dan karakteristik tersebut pada masing-masing object.