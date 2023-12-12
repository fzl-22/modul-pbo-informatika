# JAVA GUI

Java GUI (Graphical User Interface) merujuk pada antarmuka pengguna grafis yang dikembangkan menggunakan bahasa pemrograman Java. Antarmuka pengguna grafis memungkinkan pengguna berinteraksi dengan program atau aplikasi melalui elemen-elemen visual seperti tombol, kotak teks, gambar, dan lainnya, daripada melalui perintah teks.

Beberapa konsep kunci dalam pengembangan GUI dengan Java melibatkan penggunaan paket Java yang disediakan khusus untuk tujuan tersebut. Swing adalah salah satu paket GUI yang umum digunakan dalam pengembangan aplikasi Java. Swing menyediakan sejumlah komponen antarmuka pengguna, seperti JFrame, JButton, JTextField, dan lainnya, yang memungkinkan pengembang untuk membuat antarmuka pengguna yang interaktif dan menarik.

Berikut adalah contoh sederhana pembuatan jendela (window) dengan tombol menggunakan Swing di Java:

```java
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ContohGUI {

    public static void main(String[] args) {
        // Membuat objek JFrame
        JFrame frame = new JFrame("Contoh GUI Java");

        // Membuat objek JButton
        JButton tombol = new JButton("Klik Saya");

        // Menambahkan aksi ketika tombol diklik
        tombol.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Tombol telah diklik!");
        });

        // Menambahkan tombol ke dalam frame
        frame.getContentPane().add(tombol);

        // Mengatur ukuran frame
        frame.setSize(300, 200);

        // Mengatur operasi penutupan default
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
```
#### Sub Materi
1. Instalasi Netbeans
2. Maven vs Ant vs Gradle
3. Java GUI Dasar Netbeans
4. Konfigurasi GUI
5. Database Connection

## 1. Instalasi Netbeans
NetBeans merupakan sebuah Open-Source Integrated Development Environment (IDE). Mudahnya, ini merupakan sebuah software untuk aplikasi desktop Java untuk pengembangan dengan Java, PHP, C++, dan bahasa pemrograman lainnya. Bagi para programmer, NetBeans terkenal sebagai Platform of Modular Components yang berguna untuk mengembangkan aplikasi dengan basis Java. Selain itu, software ini dapat berjalan di beberapa sistem operasi yaitu Windows, Linux, Mac OS X, maupun Solaris.

Umumnya, NetBeans digunakan para developer untuk mengembangkan aplikasi, baik untuk compile, linker, debugger, dan aktivitas pemrograman lainnya. Berikut adalah beberapa fitur pada NetBeans.

- **Code Generator** berfungsi untuk meng-generate constructor, setter and getter, method dan lainnya.
- **Bookmarking** berfungsi untuk menKitai baris yang akan Kita modifikasi.
- **Error Stripe** yang berfungsi sebagai penKita baris yang error dengan memebri tKita dengan highlight warna merah.
- **Smart Code Completion** yang berguna untuk mengusulkan nama variable dari suatu tipe, melengkapi keyword dan mengusulkan tipe parameter dari sebuah method.
- **Go to Commands** berguna untuk jump ke deklarasi variable, source code atau file yang ada pada project yang sama.

### Tahap 1, persiapan
Perlu Kita ketahui, ada beberapa kualifikasi yang perlu Kita persiapkan sebelum install NetBeans. Sebaiknya Kita menggunakan perangkat komputer dengan kualifikasi RAM minimal 2GB. 

### Tahap 2, mengunduh driver NetBeans
Driver NetBeans sendiri bisa Anda dapatkan melalui website resmi NetBeans.

- Buka mesin pencarian, kemudian cari **netbeans 13** atau masuk ke https://netbeans.apache.org/front/main/download/nb13/nb13/.
- Cari dan pilih driver yang sesuai dengan komputer Anda. - Lengkap dengan OS dan bit (32-bit atau 64-bit).
- Klik Download untuk mengunduhnya.
- Tunggu beberapa saat sampai proses pengunduhan selesai.

### Tahap 3, install NetBeans
Buka driver installer NetBeans yang telah Anda unduh. Setelah muncul jendela Welcome to the Apache NetBeans Installer, klik Next.

![image](<./assets/image.png>)

Baca lisensi persetujuan dengan baik, kemudian tandai I accept the terms in the license agreement. Setelah itu klik Next.

![image](<./assets/image-1.png>)

Pilih lokasi instalasi pada kolom Install the Apache NetBeans IDE to: kemudian klik Next.
![image](<./assets/image-2.png>)

Izinkan auto-update dengan menandai Check for Updates. Jika sudah, klik Install.

![image](<./assets/image-3.png>)

Tunggu proses instalasi selesai, kemudian klik Finish.

![image](<./assets/image-4.png>)

## 2. Maven vs Ant vs Gradle
### Maven
Apache Maven adalah alat manajemen proyek dan pemahaman proyek yang berbasis pada konsep "konvensi lebih konfigurasi." Artinya, Maven menyediakan struktur dan aturan baku untuk pengorganisasian proyek, dan konfigurasi tambahan hanya diperlukan jika proyek Anda tidak mengikuti struktur default.

Fitur Utama:
- **Manajemen dependensi:** Maven dapat mengelola dependensi proyek dan mengunduhnya dari repositori Maven pusat.
- **Siklus Hidup:** Menyediakan siklus hidup build standar (compile, test, package, install, deploy).
- **Konvensi Lebih Konfigurasi:** Konfigurasi default berdasarkan konvensi, namun dapat disesuaikan jika diperlukan.

### Ant
Apache Ant adalah alat manajemen proyek berbasis XML yang telah lama ada. Ant tidak menggunakan pendekatan "konvensi lebih konfigurasi" seperti Maven, dan konfigurasi proyek ditentukan secara ekplisit dalam file XML.

Fitur Utama:
- **Kustomisasi:** Memberikan tingkat kustomisasi yang tinggi karena konfigurasinya ditulis dalam XML.
- **Tugas Build:** Memungkinkan Anda menentukan tugas-tugas build yang spesifik untuk proyek Anda.
- **Ekstensibilitas:** Dapat diperluas melalui pengembangan tugas-tugas Ant kustom.

### Gradle

Gradle adalah alat manajemen proyek yang fleksibel dan kuat yang memungkinkan Anda mendefinisikan proyek Anda menggunakan DSL (Domain Specific Language) berbasis Groovy atau Kotlin.

Fitur Utama:
- **Fleksibilitas:** Memungkinkan penggunaan DSL untuk mendefinisikan struktur proyek dan tugas-tugas build.
- **Kinerja:** Menawarkan performa yang baik dengan cara mendefinisikan dan mengeksekusi hanya tugas-tugas yang diperlukan.
- **Integrasi dengan IDE:** Dukungan yang baik untuk integrasi dengan berbagai Integrated Development Environments (IDE).

Pemilihan antara Maven, Gradle, atau Ant untuk proyek Java umumnya tergantung pada preferensi tim pengembangan dan kebutuhan proyek. Berikut beberapa pertimbangan umum:

### Maven

**Keuntungan:**
- Manajemen dependensi yang baik.
- Struktur proyek yang terstandarisasi.
- Siklus hidup build yang sudah ditentukan.

**Cocok untuk:**
- Proyek dengan struktur standar atau yang mengikuti konvensi Maven.
- Tim pengembangan yang lebih memilih konfigurasi yang lebih sedikit.

### Gradle

**Keuntungan:**
- Fleksibilitas dalam mendefinisikan struktur proyek dan tugas-tugas build.
- Dapat menggunakan DSL berbasis Groovy atau Kotlin.
Kinerja yang baik.

**Cocok untuk:**
- Proyek yang memerlukan tingkat kustomisasi yang tinggi.
- Tim yang lebih suka pendekatan DSL untuk konfigurasi.

### Ant

**Keuntungan:**
- Kustomisasi tinggi dengan konfigurasi XML.
- Cocok untuk proyek dengan kebutuhan khusus atau skenario tertentu.

**Cocok untuk:**
- Proyek lama atau yang telah menggunakan Ant.
- Pengembang yang lebih nyaman dengan pendekatan XML.

## 3. Java GUI Dasar Netbeans
### Membuat Project
Pertama silahkan buka dulu Netbeans IDE nya, dan akan terlihat tampilan awal seperti pada contoh Gambar di bawah ini.

![image](<./assets/image-5.png>)

Selanjutnya kita mulai untuk membuat Project nya dengan cara klik menu File lalu klik New Project maka akan tampil seperti pada contoh Gambar di bawah ini.

![image](<./assets/image-6.png>)

Pada bagian Categories pilih Java dan pada bagian Project pilih Java Application. Selanjutnya klik Next, maka akan terlihat tampilan seperti contoh di bawah ini.

![image](<./assets/image-7.png>)

Keterangan:
- Project Name: Untuk memberi Nama project yang akan kita buat.
- Project Location: Untuk memilih lokasi penyimpanan project yang akan kita buat.
- Use Dedicated Folder for Storing Libraries: untuk menempatkan libraries ke folder khusus, pada bagian ini biarkan saja seperti defaultnya dan tidak usah dicentang.
- Create Main Class: Jika opsi ini dicentang, maka file atau class utamanya akan dibuat secara otomatis ketika kita klik Finish.

### Membuat JFrame Form
Setelah kita membuat projectnya selanjutnya kita buat dulu JFrame Form yang nantinya akan kita gunakan sebagai tampilan GUI dan untuk meletakan objek-objek yang kita butuhkan.

**Caranya:****

Klik kanan pada package kita, di contoh ini nama package saya adalah tampilan, silahkan sesuaikan dengan punya kalian jika kalian sudah punya package yang berbeda.

![image](<./assets/image-9.png>)


jika dari New File silahkan kalian klik Swing GUI Forms. Setelah itu lihat pada bagian File Types, silahkan pilih JFrame Form lalu klik Next.

![image](<./assets/image-10.png>)

Setelah kita memilih JFrame Form, selanjutnya kita beri nama JFrame Formnya. Untuk namanya bebas sesuka kalian atau sesuaikan dengan apa yang ingin kalian buat. Jika sudah maka akan muncul tampilan seperti pada contoh gambar di bawah ini.

![image](<./assets/image-11.png>)

### Membuat Tampilan GUI
Pada langkah ini kita akan memulai membuat tampilannya. Perhatikan pada bagian sebelah kanan yang saya beri tanda.

**Swing Containers**

![image](<./assets/image-13.png>)

- **Panel** : Digunakan sebagai papan dari suatu bidang / layar lain.
- **Split Pane** : 2 tombol yang tebagi menjadi 2 sisi (kiri & kanan).
- **Toolbar** : Merupakan bar yang dapat dimasukkan tool didalamnya, biasanya digunakan diatas layar.
- **Internal Frame** : Bingkai layar baru yang berada didalam bingkai utama.
- **Tabbed Pane** : Panel yang memiliki tab & bisa beralih dari tab 1 ke tab lainnya.
- **Scroll Pane** : Panel yang dapat di scroll baik horizontal ataupun vertikal.
- **Desktop Pane** : Container yang digunakan untuk membuat multi dokumen interface atau dekstop virtual.
- **Layered Pane** : Sebuah container yang memungkinkan setiap komponen didalamnya saling overlap jika diperlukan.

**Swing Controls**

![image](<./assets/image-14.png>)

- **Label** : Sebuah kolom/area yang digunakan untuk menampilkan tulisan atau gambar.
- **Toggle Button** : Tombol untuk (ON/OFF).
- **Radio Button** : Tombol yang berfungsi untuk memilih dan tidak memilih pilihan lainnya, tombol ini hanya dapat memilih satu dari sekian pilihan.
- **Combo Box** : Komponen yang digunakan sebagai dropdown list, bisa digunakan untuk memilih multiple selection.
- **Text Field** : Komponen yang digunakan sebagai input / bidang yang dapat diedit (menulis didalamnya).
- **Scroll Bar** : Komponen yang menyesuaikan tampilan sebuah konten yang terbatas & menampilkan scroll.
- **Progress Bar** : Sebuah bar yang mengindikasi sebuah pekerjaan dengan menampilkan presentasi pekerjaan tersebut.
- **Password Field** : Digunakan untuk menulis katasandi, tidak akan menampilkan karakter & diganti dengan tanda titik.
- **Separator** : Digunakan untuk keperluan umum seperti membatasi komponen & memberikan garis pemisah.
- **Editor Pane** : Digunakan untuk menulis apapun didalamnya.
- **Button** : Sebuah tombol sederhana agar dapat di klik.
- **Check Box** : Kotak centang yang dapat dicentang atau tidak.
- **Button Group** : Class yang digunakan untuk membuat multi lingkup eksklusi satu set tombol.
- **List** : Menampilkan sebuah daftar & dapat dipilih lebih dari satu.
- **Text Area** : Tidak berbeda jauh dengan Editor Pane, sebuah kolom besar yang dapat digunakan untuk menulis.
- **Slider** : Pengguna dapat menggeser sebuah nilai secara grafik seperti membesar kecilkan volume.
- **Formatted Field** : Komponen yang memungkinkan untuk mengedit sebuah nilai didalamnya secara partikular.
- **Spinner** : Sebuah bidang input angka yang memiliki tombol naik dan turun untuk mengontrol angka tersebut.
- **Text Pane** : Bidang text yang dapat diisi dengan ilai dan menandai isi-isi tersebut.
- **Tree** : Sebuah direktori folder yang tersusun seperti pohon ketika memiliki folder didalam folder.

**Swing Menus**

![image](<./assets/image-15.png>)

- **Menu Bar** : Komponen untuk menampilkan menu dan item menu.
- **Menu** : Sebuah menu tunggal, bisa digunakan sebagai menu utama jika disisipkan submenu.
- **Menu Item** : Sebuah item menu tunggal didalam menu.
- **Menu Item / CheckBox** : Sebuah item menu tunggal atau kotak centang didalam menu.
- **Menu Item / RadioButton** : Sebuah item menu tunggal atau kotak centang didalam menu.
- **Popup Menu** : Layar munculan kecil yang menampilkan beberapa pilihan / menu.
- **Separator** : Keperluan umum untuk membatasi antara komponen dan memberikan garis pembatas.

**Swing Windows**

![image](<./assets/image-16.png>)

- **Dialog** : Jendela yang digunakan menampilkan dialog.
- **Color Chooser** : Jendela baru yang digunakan untuk memilih warna / memanipulasi.
- **Option Pane** : Jendela yang digunakan untuk menampilkan dialog dan opsi yang ditampilkan.
- **Frame** : Digunakan untuk bingkai window utama.
- **File Chooser** : Jendela baru untuk memilih sebuah file.

**Swing Fillers**

![image](<./assets/image-17.png>)

- **Glue** : Komponen yang tersedia untuk menggerakkan ke arah vertikal & horizontal.
- **Horizontal Strut** : Komponen yang memiliki lebar pasti dan dapat bergerak ke arah horizontal.
- **Vertical Glue** : Komponen yang memiliki lebar bebas & dapat bergerak ke arah vertikal.
- **Vertical Strut** : Komponen yang memiliki lebar pasti dan dapat bergerak ke arah vertikal.
- **Horizontal Glue** : Komponen yang memiliki lebar bebas & dapat bergerak ke arah horizontal.
- **Rigid Area** : Komponen yang memiliki ukuran pasti.

Dalam pemrograman Java, khususnya dalam pengembangan antarmuka pengguna grafis (GUI), JFrame adalah kelas yang digunakan untuk membuat jendela utama aplikasi. JFrame memiliki berbagai properti, event, dan kode yang dapat dikonfigurasi untuk mengatur tampilan dan perilaku jendela. Berikut adalah penjelasan singkat tentang properties, event, dan kode di JFrame.

**Properties:**

![image](<./assets/image-18.png>)

- **Title (Judul)**: Properti ini menentukan judul jendela. Anda dapat mengaturnya menggunakan metode setTitle().
- **Size (Ukuran)**: Properti ini mengatur ukuran jendela. Anda dapat mengaturnya menggunakan metode setSize().
- **Layout Manager (Pengatur Tata Letak)**: JFrame menggunakan pengatur tata letak untuk mengatur penempatan komponen-komponen di dalamnya. Anda dapat mengatur pengatur tata letak menggunakan metode setLayout().
- **Default Close Operation (Operasi Penutupan Bawaan)**: Properti ini menentukan tindakan yang harus dilakukan ketika pengguna menutup jendela. Anda dapat mengaturnya menggunakan metode setDefaultCloseOperation().

**Event:**
- Event adalah kejadian atau peristiwa yang dilakukan
oleh user terhadap user interface menggunakan
peralatan mouse dan keyboard.
- Setiap objek dapat dinotifikasi jika suatu event terjadi
sehingga objek tersebut dapat memutuskan apa
yang harus dilakukan untuk menanggapi
(menangani) event tersebut (event handling)
- Agar suatu objek dapat dinotifikasi tentang suatu
event, objek harus mendaftarkan diri sebagai event
listener ke sumber yg menghasilkan event, dan
mengimplementasikan interface listener yg sesuai.
```java
frame.addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
        // Kode yang akan dijalankan saat jendela ditutup
    }
});
```
**Listener Yang Sering Digunakan**

![image](<./assets/image-19.png>)

**Daftar Listener Lengkap**

**Listener (Semua Komponen Swing)**

![image](<./assets/image-20.png>)
![image](<./assets/image-21.png>)
![image](<./assets/image-24.png>)

**Listener API Table 1**

![image](<./assets/image-23.png>)

**Listener API Table 2**

![image](<./assets/image-25.png>)

**Listener API Table 3**

![image](<./assets/image-26.png>)

**Listener API Table 4**

![image](<./assets/image-27.png>)

**Code:**
- **Menampilkan Jendela**: Untuk menampilkan jendela, Anda perlu menggunakan metode setVisible(true). Tanpa baris ini, jendela tidak akan muncul.
```java
frame.setVisible(true);
```

## 4. Konfigurasi GUI

### 1. Latihan Swing

Buatlah design seperti data mahasiswa diatas dengan menggunakan :
1. 2 buah JTextfield
2. 2 buah JRadioButton
3. 3 buah JCheckbox
4. 1 buah JList
5. 1 buah JComboBox
6. 1 buah JTextArea
7. 2 buah JButton
8. 7 buah Jlabel

![image](<./assets/image-28.png>)

Klik Kanan Pada setiap Swing pilih Change Variable Name setelah itu ubah nama klik ok, dan klik kanan lagi lalu pilih Edit Text,sesuaikan nama variabel dan text seperti pada gambar berikut:

![image](<./assets/image-29.png>)

Kemudian anda dapat memberikan variabel pada source code dengan cara klik source dan ketikan syntax berikut tepat di bawah class yang anda buat.

![image](<./assets/image-30.png>)

Kemudian kembali ke Design dan double klik pada cmdtampil atau klik kanan, kemudian pilih Event | Action | actionPerformed. Maka anda akan masuk pada bagian coding / source code. Dan ketikan syntax berikut:

```java
private void cmdtampilActionPerformed (java.awt.event.ActionEvent evt) {
	nama=txtnama.getText();
	nim=txtnim.getText();
	if (cbhobil.isSelected())
		hobi = "Coding";
	if (cbhobi2.isSelected())
		hobi += " ,Tidur";
	if (cbhobi3.isSelected())
		hobi += " ,Makan";
	if (rdjurusan1.isSelected())
		jenis kelamin = "Laki - Laki";
	else
		jenis kelamin = "Perempuan";
	jurusan = listjurusan.getSelectedValue().toString();
	semester = comsemester.getSelectedValue().toString();
	info="Nama 		: "+nama+"\n";
	info+="NIM 		: "+nim+"\n";
	info+="Jenis Kelamin : "+jeniskelamin+"\n";
	info+="Semester : "+semester+"\n";
	info+="Hobi : "+hobi+"";
	hasil.setText(info);
	jOptionPane.showMessageDialog(null, info);

}
```
Dan pada cmdbersih lakukan hal yang sama dan ketikan syntax berikut.

![image](<./assets/image-32.png>)

Jika sudah maka project anda siap di compile dan di run.maka program anda akan tampil seperti gambar berikut dan silahkan diisi data anda dan klik Tampilkan.

![image](<./assets/image-33.png>)

### 2. Latihan JTabPane, JTree, JTable

Dalam Pembuatan JTabPane lakukan hal yang sama new project hingga new frame kemudian pilih Design lalu drag & drop JtabPane, seperti pada gambar berikut.

![image](<./assets/image-34.png>)

Setelah itu Drag & Drop Panel kedalam JTabPane maka Tab berhasil di buat.lakukan drag & drop panel hingga JTabPane memiliki 3 Tab. Setelah itu anda dapat mengedit Text pada Tab tersebut dengan cara yang sama yaitu klik kanan pada tab tersebut dan Edit Text. Ubahlah menjadi Halaman1 , Halaman 2 dan Halaman Akhir. Pada pada halaman 1 anda dapat memberikan JLabel untuk menandai ini halaman1. Sedangkan pada halaman2 anda dapat memberikan JTabel dengan cara darg & drop Jtabel ke Halaman2, dan pada halaman 3 anda dapat memberikan JTree. Kemudian anda dapat klik kanan pada JTree dan pilih Property selanjutnya klik pada Model kemudian klik titik2 pada bagian kanan model “…” Maka akan muncul jendela baru Dan hapus semua item di kolom sebelah kiri seperti gambar berikut.

![image](<./assets/image-35.png>)

Kemudian tambahkan 1 buah Jlabel, 1 buah JTextField, dan 1 buah JButton, seperti yang ditampilkan pada gambar berikut:

![image](<./assets/image-36.png>)

Kemudian double klik pada Jbutton atau klik kanan, kemudian pilih Event | Action | actionPerformed. Maka anda akan masuk pada bagian coding / source code. Dan ketikan syntax berikut.

![image](<./assets/image-37.png>)

Setelah itu Anda dapat Compile dan Run Project Anda, maka akan tampil sebagai berikut.

![image](<./assets/image-38.png>)

Pilih Halaman Akhir dan Klik pada Jtree ROOT. Dan ketikan anak pertama pada JTextField. Dan klik Tambah. Maka Jtree anda akan bertambah seperti pada gambar berikut.

![image](<./assets/image-39.png>)

## 5. Database Connection

### JavaGUI , JDBC Connector & MySQL
JDBC merupakan singkatan dari Java Database Connectivity yaitu API java yang membantu aplikasi java untuk mengeksekusi SQL statement. JDBC merupakan interface pemrograman aplikasi yang mendefinisikan bagaimana pemrogram java dapat mengakses database dalam format tabular dari kode2 java menggunakan sekumpulan interface standard dan class-class yang tertulis dalam bahasa java.

Interface pemrograman aplikasi java menyediakan mekanisme untuk memuat package java beserta driver-driver dan memasang pada JDBC Driver Manager yang digunakan sebagai pembuat koneksi JDBC yang mendukung eksekusi syntax SQL seperti INSERT, UPDATE dan DELETE. Driver Manager adalah bagian itama dari JDBC.

Secara umum semua RDBMS (Relational Database Management System) dan Java merupakan platform yang independen, jadi JDBC memungkinkan untuk membuat sebuah aplikasi database yang dapat dijalankan pada platform-platform berbeda dan berinteraksi dengan DBMS.

**Poin Materi**
1. Membantu menghubungkan dengan sumber data, seperti database.
2. Membantu mengirim query dan perintah update ke database.
3. Menerima dan memroses hasil yang diterima dari database sebagai respon dari query yang dikirim.

Kita akan mencoba membuat sebuah aplikasi sederhana menggunakan Java yang menggunakan sistem basis data MySQL. Programnya sederhana, hanya membuat sebuah Form dengan fasilitas CRUD (Create, Read, Update dan Delete). Tabel yang akan kita buat sekarang adalah tabel MAHASISWA, dimana tabel tersebut memiliki beberapa kolom, yaitu NIM, NAMA, TANGGAL_LAHIR, JURUSAN dan ALAMAT.

**1. Membuat Database**

Sebelum membuat program sederhana ini, hal yang pertama perlu kita buat adalah database yang akan kita gunakan. Misal kita akan membuat database UNIVERSITAS, maka kita bisa menggunakan perintah :
```mysql
CREATE DATABASE UNIVERSITAS;
```
**2. Membuat Tabel**

Setelah membuat database, kita terlebih dahulu perlu membuat tabel MAHASISWA. Kita dapat menggunakan perintah sebagai berikut untuk membuat tabel MAHASISWA :
```mysql
CREATE TABLE MAHASISWA(
    NIM VARCHAR(8) PRIMARY KEY,
    NAMA VARCHAR(50) NOT NULL,
    TANGGAL_LAHIR DATE NOT NULL,
    JURUSAN VARCHAR(50) NOT NULL,
    ALAMAT VARCHAR(500) NOT NULL
);
```
Sekarang kita sudah punya sebuah tabel dengan nama MAHASISWA. Saatnya kita lanjutkan membuat project Java−nya menggunakan NetBeans IDE.

**3. Membuat Project**

Sama seperti sebelumnya, untuk membuat sebuah project dalam NetBeans IDE kita dapat membuatnya menggunakan menu File −> New Project. Setelah itu pilih kategori Java dan pilih tipe project−nya Java Application.

![image](<./assets/image-40.png>)

Klik Next untuk melanjutkan pembuatan project.

![image](<./assets/image-41.png>)

Beri nama project dan jangan diceklis ceckbox Create Main Class. Hal ini dikarenakan kita tidak memerlukan dahulu membuat sebuah Main Class. Setelah itu klik tombol Finish, sekarang kita telah membuat project Java menggunakan NetBeans IDE.

**4. Membuat Koneksi MySQL**

Setelah membuat project, saatnya membuat koneksi ke database UNIVERSITAS yang telah kita buat sebelumnya. Jadi hal yang pertama kitalakukan adalah menambah driver MySQL ke dalam project yang telah kita buat. Caranya klik kanan bagian Libraries project yang telah kita buat lalu pilih Add Library.

![image](<./assets/image-42.png>)

Setelah keluar dialog Add Library, pilih MySQL JDBC Driver lalu klik tombol Add Library untuk menambahkan MySQL Driver kedalam project. Setelah menambahkan driver MySQL, sekarang saatnya membuat sebuah kelas yang akan kita gunakan untuk melakukan koneksi ke database MySQL. Tapi sebelum membuat sebuah kelas, pastikan kita membuat package dulu,caranya klik kanan bagian Source project yang telah kita buat lalu pilih Next −> Other.

![image](<./assets/image-43.png>)

Setelah keluar dialog Next File, pilih kategori Java dan jenis file Java Package. Klik Next untuk melanjutkan membuat package.

![image](<./assets/image-44.png>)

Setelah itu beri nama packagenya, misal program.universitas, setelah itu klik Finish untuk membuat package−nya.

Setelah membuat package program.universitas, sekarang kita buat sebuah kelas untuk melakukan koneksi ke MySQL. Caranya klik kanan packageprogram.universitas lalu pilih Next −> Other.

![image](<./assets/image-45.png>)

Pilih kategori Java dan tipe filenya Java Class, setelah itu klik tombol Next untuk melanjutkan membuat sebuah kelas.

![image](<./assets/image-46.png>)

Beri nama kelas tersebut, misal KoneksiDatabase, setelah itu klik Finish agar kelas KoneksiDatabase terbuat.

![image](<./assets/image-47.png>)

Sekarang, saatnya melakukan proses pengkodean. Pertama buat sebuah variabel static yang bertipe java.sql.Connection, kita menggunakan static agar nanti aplikasi dapat mengakses koneksi secara langsung tanpa harus membuat object KoneksiDatabase.
```java
package program.universitas;
import java.sql.Connection;
public class KoneksiDatabase {
    private static Connection koneksi;
}
```
Setelah itu buat sebuah metode static getKoneksi(), metode ini digunakan untuk mendapatkan koneksi itu sendiri.
```java
package program.universitas;
import java.sql.Connection;
public class KoneksiDatabase {
    private static Connection koneksi;
    public static Connection getKoneksi() {
        return koneksi;
    }
}
```
Sekarang untuk mengambil koneksi kita dapat langsung menggunakan petintah KoneksiDatabase.getKoneksi(), namun pastinya jika kita melakukan hal itu akan terjadi error, kok bisa?

Tentu karena pada kelas KoneksiDatabase tersebut kita belum membuat koneksinya, jadi sebelum return koneksi, pada metode getKoneksi() seharusnya kita cek dulu apakah koneksi−nya null, jika null, maka kita deklarasikan sebuah koneksi yang baru.

```java
package program.universitas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class KoneksiDatabase {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        // cek apakah koneksi
        null if (koneksi == null){
            try {
                String url = "jdbc:mysql://khannedy.server:3306/UNIVERSITAS";
                String user = "echo";
                String password = "sssss";
                DriverManager.registerDriver(new
                com.mysql.jdbc.Driver()); koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                System.out.println("Error Membuat Koneksi");
            }
        }
        return koneksi;
    }
}
```
Sekarang, kita telah selesai membuat sebuah kelas untuk melakukan proses koneksi ke MySQL. Saatnya kita membuat Form aplikasinya.

**5. Membuat Form Aplikasi**

Pada program sederhana ini, kita tidak akan membuat program berbasis terminal (command line) lagi, tapi kita akan membuat aplikasi berbasis GUI. Dalam java teknologi untuk membuat program berbasis GUI disebut Java Swing. Sekarang untuk membuat sebuah Form, kita harus membuat JFrame, caranya dengan klik kanan package program.universitas, lalu pilih New −> Other.

![image](<./assets/image-48.png>)

Pilih kategori String GUI Forms dan pilih tipe file JFrame Form. Lalu klik Nest untuk melanjutkan membuat Form.

![image](<./assets/image-49.png>)

Beri nama Form tersebut, misal dengan nama Form, dengan begitu maka NetBeans akan membuatkan sebuah kelas dengan nama Form yang merupakan turunan dari kelas JFrame, dimana kelas JFrame ini merupakan kelas Java Swing.

Sekarang kita dapat melihat GUI builder pada editor NetBeans dan disebelah kanannya terdapat Pallete yang merupakan komponen−komponen GUI yang ada di Java danProperties yang merupakan editor atribut−atribut komponen yang kita klik pada GUI Builder.

![image](<./assets/image-50.png>)

Untuk menambahkan komponen−komponen GUI lainnya, kita cukup mengklik dan mendrag salah satu komponen yang ada dalam Pallete ke dalam Form. Misal kita klik dan drag sebuah Label dari Pallete.

![image](<./assets/image-51.png>)
![image](<./assets/image-52.png>)

Untuk mengubah tulisan pada Label, kita dapat mengklik label teresebut, lalu lihat pada bagian Properties. Ubah atribut Text, misal menjadi NIM, Nama, Tanggal Lahir, Jurusan dan Alamat.

![image](<./assets/image-53.png>)

Setelah itu klik dan drag tiga buat Text Field yang ada dipallete ke Form, gunakan Text Field untuk Nim, Nama dan Jurusan.

![image](<./assets/image-54.png>)

Untuk Tanggal Lahir dan Alamat kita tidak menggunakan Text Field, hal ini dikarenakan Tanggal Lahir memerlukan inputan berupa tanggal sedangkan Text Field hanya mendukung teks (string), sedangkan untuk Alamat, biasanya isi alamat itu panjang, sehingga lebih tidak cocok menggunakan Text Field, karena Text Field hanya mendukung satu baris.

Dengan demikian, untuk Tanggal Lahir kita akan menggunakan Formatted Field, tinggal kita klik dan drag Formatted Field dari Palette ke dalam Form.

![image](<./assets/image-55.png>)

Dan untuk Alamat, gunakan komponen Text Area. Text Area hampir mirip dengan Text Field, namun mendukung lebih dari satu baris.

![image](<./assets/image-56.png>)

Untuk mengosongkan isi tulisan pada NIM, Nama, Tanggal Lahir dan Jurusan, kosongkan atribut Text pada setiap komponen pada Properties−nya.

![image](<./assets/image-57.png>)

Setelah itu, sekarang saatnya kita mengubah setiap nama variabel komponenya, misal untuk Text Field NIM kita beri nama variabelnya dengan nama inputNim, untuk Text Field Nama dengan nama inputNama dan seterusnya, caranya dengan mengklik kanan komponenya lalu pilih menu Change Variable Name.

![image](<./assets/image-58.png>)

Untuk melihat seluruh nama variabelnya, kita dapat melihatnya pada bagian Inspector di sebelah kiri bawah Form NetBeans.

![image](<./assets/image-59.png>)

Secara default Formatted Field seperti Text Field, dia hanya menerima teks (String), agar Formatted Field hanya menerima input berupa tanggal, maka kita perlu memberitahukannya ke Formatted Field nya, caranya klik inputTanggalLahir, lalu pada bagian Properties, cari atribut formatterFactory, ubah atribut tersebut.

![image](<./assets/image-60.png>)

Pada saat mengklik tombol [...] pada atribut formatterFactory, maka akan muncul dialog formatterFactory.

![image](<./assets/image-61.png>)

Agar Formatted Field hanya meneripa input tanggal, maka ubah kategorinya menjadi date, formatnya menjadi custom, lalu pada input Format beri teks “d/M/yyyy”.

![image](<./assets/image-62.png>)

Maksud dari “d/M/yyyy” merupakan representasi tanggal/bulan/tahun dalam angka, misal jika tanggal 1 Januari 2010, maka input harus 1/1/2010 dan seterusnya. Klik tombol OK untuk mengkonfirmasi perubahan.

**6. Menambah Tombol ke Form**

Setelah menambahkan input Form, sekarang saatnya kita menambah tombol ke dalam Form. Caranya dengan mengklik dan drag komponen Button pada Palette ke dalam Form.

![image](<./assets/image-63.png>)

Tambahkan 3 buah tombol, Tambah, Ubah dan Hapus. Untuk mengubah teks tombolnya caranya sama seperti Label, yaitu dengan mengubah atribut Text pada Properties. Jangan lupa untuk mengubah nama variabel Tabel yang tadi kita masukkan ke Form, caranya klik kanan Tabel nya lalu pilih Change Variabel Name, misal dengan nama tabelMahasiswa.

![image](<./assets/image-64.png>)

Sekarang saatnya mengubah kolom pada Tabel. Berbeda dengan komponen lain, untuk mengubah kolom pada komponen Tabel, kita memerlukan kelas lain, namanya kelas DefaultTableModel, sehingga kita perlu melakukan pengkodean, caranya masuk ke bagian Source.

![image](<./assets/image-65.png>)

Setelah itu tambahkan sebuah variabel DefaultTableModel pada kelas Form tersebut.

![image](<./assets/image-66.png>)

Untuk menambahkan kolom ke Tabel, maka kita dapat menggunakan metode addColumn(nama) milik kelas DefaultTableModel. Dan saat ini kita perlu menambahkan kolom Nim, Nama, Tanggal Lahir, Jurusan dan Alamat.

![image](<./assets/image-67.png>)

**7. Menambahkan Aksi**

Sekarang kita telah selesai membuat Form, saatnya kita menambahkan aksi−aksi database, seperti load data dari database, menambah data ke database, mengubah data dari database dan menghapus data dari database.

**8. Menambah Aksi Load Data**

Saat pertama kali aplikasi muncul, maka otomatis kita h arus mengambil seluruh data mahasiswa yang ada dalam tabel MAHASISWA dan ditampilkan ke dalam Table yang ada di Form. Dengan demikian, maka pertama kita perlu membuat sebuah aksi melakukan load data dari database.

Namun sebelum anda membuat method tersebut tambahkan beberapa import dibawah ini.

Tambahkan tepat di bawah coding package proram.universitas;
```java
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
```
Import diatas merupakan bawaan dari java sehingga syntax yang akan anda buat tidak mengalamieror / user define Sekarang kita buat sebuah metode dengan nama loadData() dimana metode tersebut dibuat dalam kelas Form dan dalam metode tersebut berisikan proses load data dari database.
```java
public void loadData(){
}
```
Sebelum melakukan proses load data dari database, maka pertama kali, kita perlu menghapus seluruh isi baris yang ada pada Table yang ada di Form. Hal ini perlu dilakukan agar saat kita akan melakukan load ulang data, maka Tabel dikosongkan dulu. Untuk mengosongkan isi Table, kita harus menggunakan DefaultTableMode.
```java
public void loadData(){
// menghapus seluruh data
    model.getDataVector().removeAllElements();
// memberi tahu bahwa data telah kosong
    model.fireTableDataChanged();
}
```
Setelah itu baru kita melakukan load datanya, untuk mengambil data dari database, kita memerlukan Connection yang ada dalam kelas KoneksiDatabase. Setelah itu buat Statement dan ResultSet seperti biasanya.
```java
public void loadData(){
// menghapus seluruh data
    model.getDataVector().removeAllElements();
// memberi tahu bahwa data telah kosong
    model.fireTableDataChanged();
    try{
        Connection c = KoneksiDatabase.getKoneksi();
        Statement s = c.creaTextatement();
        String sql = "SELECT * FROM MAHASISWA";
        ResultSet r = s.executeQuery(sql);
        while(r.nest()){
            // lakukan penelusuran baris
        }
        r.close();
        s.close();
    }catch(SQLException e){
        System.out.println("Terjadi Error");
    }
}
```

Pada saat melakukan proses penelurusan data menggunakan ResultSet, maka kita dapat menambahkan data tersebut ke dalam Table yang ada dalam Form. Untuk menambah sebuah baris ke Table kita menambahkannya ke DefaultTableModel dengan menggunakan metode addRow(Object[]).
```java
while(r.nest()){
// lakukan penelusuran baris
    Object[] o = new Object[5];
    o[0] = r.getString("NIM");
    o[0] = r.getString("NAMA");
    o[0] = r.getDate("TANGGAL LAHIR");
    o[0] = r.getString("JURUSAN");
    o[0] = r.getString("ALAMAT");
    model.addRow(o);
}
```
Lengkapnya metode loadData() akan berisi sepertipada kode dibawah ini.
```java
public void loadData(){
    // menghapus seluruh data
    model.getDataVector().removeAllElements();
    // memberi tahu bahwa data telah kosong
    model.fireTableDataChanged();
    try{
        Connection c = KoneksiDatabase.getKoneksi();
        Statement s = c.createStatement();
        String sql = "SELECT * FROM MAHASISWA";
        ResultSet r = s.executeQuery(sql);
        while(r.nest()){
            Object[] o = new Object[5];
            o[0] = r.getString("NIM");
            o[1] = r.getString("NAMA");
            o[2] = r.getString("TANGGAL_LAHIR");
            o[3] = r.getString("JURUSAN");
            o[4] = r.getString("ALAMAT");
            model.addRow(o);
        }
        r.close();
        s.close();
    }catch(SQLEsception e){ 
        System.out.println("Terjadi Error");
    }
}
```
Agar metode loadData() dipanggil ketika program berjalan, maka kita perlu memanggil metode loadData() dalam konstruktor Form.

![image](<./assets/image-68.png>)

**9. Menambah Aksi Tombol Tambah**

Sekarang saatnya kita menambahkan aksi tombol, dimana aksi tombol itu akan berjalan ketika tombol Tambah diklik. Untuk menambah sebuah aksi ke tombol Tambah, pertama kita masuk lagi ke bagian Design, setelah itu tinggal klik kanan tombol Tambah−nya setelah itu pilih menu Events -> Action -> actionPerfor ed, maka otomatis NetBeans IDE akan membuatkan sebuah metode baru untuk aksi tombol Tambah.

![image](<./assets/image-69.png>)

Dalam metode tersebutlah kita melakukan proses penambahan data ke dalam database. Untuk menambahkan data ke dalam tabel MAHASIWA, otomatis kita memerlukan data input dari pengguna. Untuk mendapatkan data tulisan dari Text Field dan Text Area, maka kita dapat menggunakan metode getText(), sedangkan untuk mendapatkan tanggal dari Formatted Field, kita dapat menggunakan metode getValue(), namun dikarenakan getValue() menghasilkan Object, maka
kita perlu mengkonversinya ke tanggal.
```java
String nim = inputNim.getText(); String nama = inputNama.getText();
java.util.Date tanggalLahir = (java.util.Date) inputTanggalLahir.getValue();
String jurusan = inputJurusan.getText();
String alamat = inputAlamat.getText();
```
Setelah mengambil seluruh data dari input, maka baru kita menyimpannya ke dalam database MySQL. Caranya adalah dengan membuat Connection dari k e l a s KoneksiDatabase setelah itu membuat PrepareStatement untuk menyimpan datanya.
```java
String nim = inputNim.getText(); String nama = inputNama.getText();
java.util.Date tanggalLahir = (java.util.Date) inputTanggalLahir.getValue();
String jurusan = inputJurusan.getText();
String alamat = inputAlamat.getText();
try{
    Connection c = KoneksiDatabase.getKoneksi();
    String sql = "INSERT INTO MAHASISWA VALUES (?, ?, ?, ?, ?)";
    PreparedStatement p = c.prepareStatement(sql);
    p.setString(1, nim);
    p.setString(2, nama);
    p.setDate(3, new java.sql.Date(tanggalLahir.getTime()));
    p.setString(4, jurusan);
    p.setString(5, alamat);
    p.executeUpdate();
    p.close();
}catch(SQLEsception e){ System.out.println("Terjadi
Error");
}finally{
    loadData();
}
```
Pada blok finally, kita perlu memanggil metode loadData(), hal ini dilakukan agar setelah proses penyimpanan data ke database, maka data akan dimuat ulang ke Table yang ada di Form.

**10. Menambah Aksi Tombol Ubah**

Untuk aksi tombol Ubah, agak sedikit berbeda dengan aksi tombol Tambah, perbedaannya adalah pertama kita harus mendeteksi baris yang sedang diklik, setelah itu baru melakukan proses pengubahan data yang diklik dengan data baru yang ada dalam input Form.

Untuk menambah aksi tombol Ubah caranya sama dengan tombol Tambah, tinggal klik kanan tombol Ubah lalu pilih Events -> Action -> actionPerformed.

![image](<./assets/image-70.png>)

Seperti yang telah ditulis sebelumnya, pertama kita harus mendapatkan baris yang terseleksi pada Table, jika tidak ada baris yang terseel ksi, maka proses Ubah dibatalkan. Untuk mendapatkan baris yang terseleksi kita dapat menggunakan metode getSelectedRow() milik Table, jika return−nya −1 artinya tidak ada baris yang terseleksi.
```java
int i = tabelMahasiswa.getSelectedRow();
if(i == -1){
    // tidak ada baris terseleksi
    return;
}
// ambil nim yang terseleksi
String nim = (String) model.getValueAt(i, 0);
String nama = inputNama.getText();
java.util.Date tanggalLahir = (java.util.Date) inputTanggalLahir.getValue();
String jurusan = inputJurusan.getText();
String alamat = inputAlamat.getText();
```
Setelah mengambil data nim yang terseleksi dan data lainnya dari input, baru kita lakukan proses ubah data yang ada di database berdasarkan nim yang baris yang terseleksi.
```java
int i = tabelMahasiswa.getSelectedRow();
if (i) == -1) {
    // tidak ada baris terseleksi
    return;
}
// ambil nim yang terseleksi
String nim = (String) model.getValueAt (i, 0);
String nama = inputNama.getText();
java.util.Date tanggal Lahir = (java.util.Date) inputTanggal Lahir.getValue();
String jurusan = inputJurusan.getText();
String alamat = inputAlamat.getText();
try{
    Connection c = Koneksi Database.getKoneksi();
    String sql = "UPDATE MAHASISWA SET NAMA = ?, TANGGAL LAHIR = ?, JURUSAN = ?, ALAMAT = ?, WHERE NIM = ?";
    PreparedStatement p = c.prepareStatement (sql);
    p.setString(1, nama);
    p.setDate(2, new java.sql.Date(tanggalLahir.getTime()));
    p.setString (3, jurusan);
    p.setString (4, alamat);
    p.setString (5, nim);
    p.executeUpdate();
    p.close();
} catch (SQLException e) {
    System.out.println("Terjadi Error");
} finally {
    loadData();
}
```
**11. Menambah Aksi Tombol Hapus**

Untuk aksi hapus, kita tidak perlu menggunakan input Form, yang kita perlukan hanyalah baris yang terseleksi. Jika baris tidak ada yang terseleksi, maka proses penghapusan dibatalkan. Untuk menambah aksi pada tombol Hapus caranya sama seperti tombol Tambah dan Ubah, klik kanan tombol Hapus, lalu pilih menuEvents -> Action -> actionPerformed.

![image](<./assets/image-71.png>)

Setelah itu sama seperti pada proses Ubah, kita cek dulu apakah ada baris yang terseleksi atau tidak, jika ada ambil nim yang terseleksi, jika tidak ada, maka batalkan proses Hapus.
```java
int i = tabelMahasiswa.getSelectedRow();
if(i == -1){
    // tidak ada baris terseleksi
    return;
}
String nim =(String) model.getValueAt(i, O);
```
Setelah itu, baru kita lakukan proses penghapusan data dari database berdasarkan data baris yang terseleksi.
```java
int i = tabelMahasiswa.getSelectedRow();
if(i == -1){
    // tidak ada baris terseleksi
    return;
}
String nim = (String) model.getValueAt(i, O);
try{
    Connection c = KoneksiDatabase.getKoneksi();
    String sql = "DELETE FROM MAHASISWA WHERE NIM = ?";
    PreparedStatement p = c.prepareStatement(sql);
    p.setString(1, nim);
    p.executeUpdate();
    p.close();
}catch(SQLException e){
    System.err.println("Terjadi Error");
}finally{
}
```
**12. Menambahkan Aksi Baris Terseleksi**

Aksi terakhir yang perlu kita tambahkan adalah aksi ketika baris Table terseleksi, misal jika baris pertama terseleksi, maka program akan menampilkan data yang terseleksi tersebut pada Form. Hal ini agar pengubahan lebih mudah, karena kita tidak perlu memasukkan seluruh datanya lagi. Untuk menambahkan aksi ketika baris terseleksi, kita dapat menggunakan aksi Mouse Click, yaitu aksi yang dijalankan ketika mouse mengklik. Caranya, klik kanan componen Table pada Form, setelah itu pilih Events -> ouse ->MouseClicked. Sekarang akan terbuat sebuah metode baru yang akan dipanggil ketika Table diklik.

![image](<./assets/image-72.png>)

Pertama yang harus dilakukan adalah melakukan pengecekah apakah ada baris yang terseleksi jika ada maka ambil data yang terseleksi dari DefaultTableModel setelah itu tampilkan pada Form, namun jika tidak ada baris yang terseleksi, maka batalkan proses.
```java
int i = tabelMahasiswa.getSelectedRow();
if(i == -1){
    // tak ada baris terseleksi
    return;
}
String nim = (String) model.getValueAt(i, 0);
inputNim.setText(nim);
String nama = (String) model.getValueAt(i, 1);
inputNama.setText(nama);
java.util.Date tanggalLahir = (java.util.Date) model.getValueAt(i, 2);
inputTanggalLahir.setValue(tanggalLahir);
String jurusan = (String) model.getValueAt(i, 3);
inputJurusan.setText(jurusan);
String alamat = (String) model.getValueAt(i, 4);
inputAlamat.setText(alamat);
```
**13. Run Program**

Setelah pembuatan program telah selesai, saatnya menjalankan aplikasi. Untuk menjalankan aplikasi, pertama kita harus menentukan dahulu kelas yang akan digunakan sebagai program, dimana pada project yang telah kita buat, kelas program adalah kelas Form. Untuk mengubah kelas program menjadi kelas Form, maka kita dapat mengubahnya dengan cara klik kanan Project yang telah kita buat, lalu pilih menu Properties, setelah itu akan keluar dialog Project Properties.

![image](<./assets/image-73.png>)

Pada bagian Categories, pilihlah menu Run, untuk mengubah kelas yang akan dijalankan sebagai kelas Program.

![image](<./assets/image-74.png>)

Pada input Main Class, klik tombol Browse, untuk menampilkan daftar kelas yang dapat dijadikan sebagai kelas program. Maka akan keluar dialog pemilihan kelas.

![image](<./assets/image-75.png>)

Pilih kelas Form yang telah dibuat tadi, setelah itu klik tombol Select Main Class. Untuk mengkonfirmasi perubahan, klik tombol OK. Sekarang kelas Form akan menjadi kelas yang dijalankan jika Project dijalankan.

Untuk menjalankan aplikasi, klik kanan project yang telah kita buat, setelah itu pilih menu Run, maka otomatis program akan berjalan. Pada komputer saya, program terlihat seperti pada gambar dibawah ini.

![image](<./assets/image-76.png>)

Sekarang, kita dapat menambah data, mengubah data dan menghapus data yang telah kita masukkan.

![image](<./assets/image-77.png>)

