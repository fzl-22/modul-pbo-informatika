# Object lifetime and Resource management

Dalam pemrograman berorientasi objek (OOP), konsep daur hidup objek dan manajemen sumber daya sangat penting untuk memastikan aplikasi berjalan dengan efisien dan tanpa memori yang bocor.

Object lifetime dan resource management erat kaitannya dengan garbage collection dalam bahasa pemrograman seperti Java.

## Contoh konsep daur hidup objek dan manajemen sumber daya :

## Object Lifetime:

- `Creation`: Objek dibuat menggunakan operator new atau melalui factory methods.

- `Initialization`: Objek diinisialisasi dengan nilai awal.

- `Utilization`: Objek digunakan untuk melakukan tugas tertentu.

- `Disposal`: Objek dihancurkan saat tidak lagi dibutuhkan.

### initializeData (Inisialisasi Data):

Metode initializeData digunakan untuk memberikan nilai awal atau menginisialisasi data objek. Ini adalah langkah yang umumnya dilakukan setelah objek dibuat dan sebelum objek digunakan untuk menjalankan tugas tertentu.

### performTask (Melakukan Tugas):

Metode performTask digunakan untuk menjalankan tugas atau operasi tertentu yang diinginkan oleh objek. Setelah objek diinisialisasi, metode ini memungkinkan objek untuk berpartisipasi dalam fungsionalitas aplikasi secara lebih spesifik.

#### contoh

```java
class Lifecycle {
    private String data;

    // Metode untuk menjalankan tugas/operasi
    public void performTask() {
        if (data != null) {
            System.out.println("Melakukan tugas dengan data: " + data);
        } else {
            System.out.println("Data belum diinisialisasi.");
        }
    }
    public void initializeData() {
        data = "Nilai Awal";  // Inisialisasi data dengan nilai awal
        System.out.println("Data diinisialisasi: " + data);
    }
}
```

#### Penggunaan

```java
public class ObjectLifeCycleExample {
    public static void main(String[] args) {
        // Pembuatan objek
        Lifecycle obj = new Lifecycle();

        // Inisialisasi data objek
        obj.initializeData();

        // Melakukan tugas dengan objek
        obj.performTask();
    }
}
```

Dalam contoh diatas, siklus hidup objek dimulai dengan pembuatan objek Lifecycle, diikuti oleh inisialisasi data dengan memanggil initializeData, dan kemudian objek digunakan untuk menjalankan tugas dengan memanggil performTask.

## Resource Management:

- `Sumber Daya Eksternal`: Objek mungkin memiliki sumber daya eksternal seperti file, koneksi database, atau socket.

- `Pembebasan Sumber Daya`: Pembebasan sumber daya eksternal (seperti menutup file atau melepaskan koneksi database) penting untuk mencegah kebocoran sumber daya.

## Garbage Collection:

- `Tujuan Utama`: Mencegah kebocoran memori dengan mengidentifikasi dan menghapus objek yang tidak lagi dapat dijangkau oleh program.
  Objek yang Tidak Lagi Dibutuhkan: Garbage collector mengenali objek yang tidak lagi diakses atau dirujuk oleh program dan menghapusnya dari memori.

- `Pemanggilan Metode Finalize`: Dalam beberapa kasus, programmer dapat menentukan metode finalize() untuk memberikan logika pembersihan tambahan sebelum objek dihancurkan oleh garbage collector.

### Konstruktor (Constructor):

- Konstruktor adalah metode khusus dalam sebuah kelas yang memiliki nama yang sama dengan nama kelas dan tidak memiliki tipe pengembalian.

- Tujuan utama konstruktor adalah untuk menginisialisasi objek dan menyiapkan sumber daya yang dibutuhkan.

- Konstruktor dapat memiliki parameter atau tidak, tergantung pada kebutuhan kelas.

#### Contoh Code :

```java
public class Person {
    private String name;

    // Konstruktor tanpa parameter (konstruktor default)
    public Person() {
        this.name = "Unknown";
    }

    // Konstruktor dengan parameter
    public Person(String name) {
        this.name = name;
    }
}
```

#### penggunaan

```java
Person person1 = new Person();           // Menggunakan konstruktor default
Person person2 = new Person("Khuluq");    // Menggunakan konstruktor dengan parameter
```

### Pengelolaan Memori Otomatis (Garbage Collection)

`Objek Sampah (Garbage)` : Objek-objek yang tidak lagi diakses oleh program disebut sebagai objek sampah. Contoh objek sampah adalah objek yang sudah tidak memiliki referensi atau tidak dapat dijangkau dari entri program.

`Garbage Collector (Pengumpul Sampah)` : Ini adalah bagian dari Java Virtual Machine (JVM) yang bertanggung jawab untuk menjalankan proses Garbage Collection. Garbage Collector secara teratur memeriksa objek-objek yang tidak lagi diakses dan menghapusnya dari memori.

- Java menggunakan Garbage Collector untuk mengelola memori otomatis.

- Garbage Collector mengidentifikasi objek-objek yang tidak lagi diakses oleh program dan menghapusnya dari memori.

- Developer tidak perlu secara manual menghapus objek; sistem akan melakukan tugas ini

#### Contoh Code :

```java
Person person1 = new Person();           // Menggunakan konstruktor default
Person person2 = new Person("Khuluq");    // Menggunakan konstruktor dengan parameter

person1 = null;
//dereferensi eksplisit variabel
```

#### penjelasan

```java
person1 = null;
```

untuk mendereferensi duluan secara ekplisit , dengan tujuan JVM Garbage Collector membersihkan memory yang digunakan.

### Manual garbage collector

```java
MyClass obj = new MyClass();
obj.initializeData();
obj.performTask();
obj = null; // Objek menjadi kandidat untuk dikumpulkan
System.gc(); // Meminta JVM untuk menjalankan garbage collection

```

## Pengimplementasian & Contoh Code :

### Object Lifecycles

```java
class MyClass {
    // Initialization
    public void initializeData() {
        // Inisialisasi data
        System.out.println("Objek diinisialisasi.");
    }

    // Utilization
    public void performTask() {
        // Melakukan tugas
        System.out.println("Melakukan tugas.");
    }
}

public class ObjectLifeCycleExample {
    public static void main(String[] args) {
        // Creation
        MyClass obj = new MyClass();

        // Utilization
        obj.initializeData();
        obj.performTask();

        // Disposal (tidak ada kode eksplisit untuk disposal karena Garbage Collector menangani hal itu)
    }
}
```

### Garbage Collection

```java
public class GarbageCollectionExample {
    public static void main(String[] args) {
        // Object Creation dan Utilization
        MyClass obj1 = new MyClass();
        obj1.initializeData();
        obj1.performTask();

        // Object yang tidak lagi digunakan
        MyClass obj2 = new MyClass();
        obj2.initializeData();
        obj2 = null; // obj2 menjadi kandidat untuk dikumpulkan oleh Garbage Collector

        // Meminta JVM untuk menjalankan garbage collection (tidak disarankan)
        System.gc();
    }
}
```
