# ABSTRACT CLASS
Abstract class atau kelas abstrak adalah kelas yang terletak di posisi tertinggi dalam hierarki class. Class ini tidak dapat diinstansiasi karena masih bersifat abstrak. Class ini hanya berisi variabel umum dan deklarasi method tanpa detail penggunaannya (abstract method). 


Selanjutnya class yang menjadi turunan dari abstract class ini yang akan menentukan detail penggunaan method tersebut.


#### Abstract Class dideklarasikan dengan cara sebagai berikut:

```java
public abstract class NamaKelasAbstrak {
 //deklarasi variabel dan abstract method
 //definisi method tidak abstrak
}
```

#### Abstract Class digunakan dengan cara sebagai berikut:

```java
class NamaKelasPengguna extends NamaKelasAbstrak {
 //penggunaan variabel dan method tidak abstrak
 //pendefinisian abstract method
}
```

#### Contoh :
Ketik dan jalankan kode program di bawah ini.

#### Kode program `abstract class Hewan` : 
```java
abstract class Hewan{
    String nama;
    public abstract void habitatHewan();
    public void namaHewan(){
        System.out.println("\n Method di dalam abstract class Hewan");
        System.out.println("Nama hewan : "+nama);
    }
}
```
#### Kode program `class Karnivora` : 

```java
class Karnivora extends Hewan{
        String habitat;
        public void habitatHewan() //pendefinisian abstract method
        {
                System.out.println("\n Method di dalam class Karnivora");
                System.out.println("Habitat hewan : "+habitat);
        }
}
```
#### Kode program `main.java`

```java
public class Main {
    public static void main(String[] args) {
    System.out.println("\tMENERAPKAN PENGGUNAAN ABSTRACT CLASS #1");
        Karnivora singa = new Karnivora();
        singa.nama = "Singa";
        singa.habitat = "Darat";
        singa.namaHewan();
        singa.habitatHewan();
    }
}        
```

### Mari kita coba!


1. Lakukan kompilasi dan eksekusi program!
2. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika method namaHewan() diubah menjadi method abstract!
3. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika tidak dilakukan overriding terhadap abstract method habitatHewan()!
4. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika abstract method habitatHewan() dideklarasikan dalam class Karnivora!

 <br>

# INTERFACE
Interface merupakan suatu mekanisme dalam Java yang memungkinkan untuk berbagi konstanta atau menentukan bentuk method yang dapat digunakan oleh sejumlah class. Sebuah class dapat mengimplementasikan lebih dari satu interface. Di dalam interface, penentu akses untuk definisi konstanta adalah public static final. Sedangkan penentu akses untuk deklarasi abstract method adalah public abstract. Kedua penentu akses ini tidak harus dituliskan secara eksplisit dalam kode program karena Java akan menggunakan kedua penentu akses ini sebagai penentu akses default bila sekiranya tidak ditulis secara eksplisit.


#### Interface dideklarasikan dengan cara sebagai berikut:

```java
public interface NamaInterface {
 //definisi konstanta
 //deklarasi abstract method
}
```

#### Interface digunakan dengan cara sebagai berikut:

```java
class NamaKelasPengguna implements NamaInterface {
 //penggunaan konstanta
 //pendefinisian abstract method
}
```

#### Interface diwariskan dengan cara sebagai berikut:

```java
public interface Interface_Y extends Interface_X {
 //definisi konstanta
 //deklarasi abstract method
}
```

Saat deklarasi abstract class dan interface digunakan modifier public. Hal ini bertujuan agar abstract class dan interface tersebut dapat digunakan secara bebas oleh class lain yang membutuhkannya. Sekilas interface tampak mirip dengan abstract class karena abstract class juga menentukan bentuk method untuk subclass, tetapi ada beberapa perbedaan antara interface dan abstract class, yaitu:


1. Abstract class dapat mengandung abstract method maupun method tidak abstrak. Sedangkan interface hanya boleh mengandung abstract method.
2. Abstract class dapat mendeklarasikan variabel instant. Sedangkan interface hanya dapat mendeklarasikan konstanta.
3. Abstract class digunakan oleh class lain melalui pewarisan dengan kata kunci extends. Sedangkan sebuah interface diimplementasikan ke dalam suatu class dengan menggunakan kata kunci implements.

#### Contoh : 
Ketik dan jalankan kode program di bawah ini.

#### Kode program `abstract class Hewan` : 

```java
Interface Operasi {
        double kons_pi = 3.14;
        String kons_panjang = " cm";
        void kelilingLingkaran (double radius);
        void kelilingPersegi();
}
```

#### Kode program `class Hitung` :

```java
class Hitung implements Operasi {
    double lingkaran, persegi;
    double sisi = 5;

    public void kelilingLingkaran(double radius) {
        System.out.println("\nMenghitung Keliling Lingkaran");
        System.out.println("Nilai radius = " + radius + kons_panjang);
        lingkaran = kons_pi * 2 * radius;
        System.out.println("Keliling Lingkaran = " + lingkaran + kons_panjang);
    }

    public void kelilingPersegi() {
        System.out.println("\nMenghitung Keliling Persegi");
        System.out.println("Nilai sisi = " + sisi + kons_panjang);
        persegi = 4 * sisi;
        System.out.println("Keliling Persegi = " + persegi + kons_panjang);
    }
}

```



### Mari kita coba!

1. Buatlah sebuah class baru yang berisi method main untuk menjalankan program tersebut! Lakukan kompilasi dan eksekusi programnya!
2. Berikan penjelasan singkat apa yang terjadi jika method kelilingPersegi() dikosongkan!
3. Berikan penjelasan singkat jika method kelilingPersegi() dihapus dan tidak dipanggil dalam method main!
