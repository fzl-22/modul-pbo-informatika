# FINALIZER

Metode finalize () disebut finalizer.

Finalizer dipanggil ketika JVM mengetahui bahwa instance khusus ini harus dikumpulkan dari sampah. Finalisator semacam itu dapat melakukan operasi apa pun, termasuk menghidupkan kembali objek tersebut.

Namun, tujuan utama finalizer adalah melepaskan sumber daya yang digunakan oleh objek sebelum dihapus dari memori. Finalizer dapat berfungsi sebagai mekanisme utama untuk operasi pembersihan, atau sebagai jaring pengaman ketika metode lain gagal.

### Untuk memahami cara kerja finalizer, mari kita lihat deklarasi kelas:

```java
public class MyFinalizable {
    private BufferedReader reader;

    public MyFinalizable() {
        InputStream input = this.getClass()
          .getClassLoader()
          .getResourceAsStream("file.txt");
        this.reader = new BufferedReader(new InputStreamReader(input));
    }

    public String readFirstLine() throws IOException {
        String firstLine = reader.readLine();
        return firstLine;
    }

    // tambahkan method atau anggota kelas lainnya jika diperlukan
}

```

Kelas Finalizable memiliki bidang reader , yang mereferensikan sumber daya yang dapat ditutup. Ketika sebuah objek dibuat dari kelas ini, ia membuat instance BufferedReader baru yang membaca dari file di classpath.

Contoh seperti itu digunakan dalam metode readFirstLine untuk mengekstrak baris pertama dalam file yang diberikan. `Perhatikan bahwa pembaca tidak tertutup dalam kode yang diberikan.`

### Kita dapat melakukannya dengan menggunakan finalizer:

```java
public class YourClass implements AutoCloseable {

    private BufferedReader reader;

    // Konstruktor untuk inisialisasi BufferedReader
    public YourClass() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    // Metode untuk membaca data, dll.
    public void readData() {
        // Implementasi membaca data
    }

    // Metode untuk menutup sumber daya
    @Override
    public void close() throws IOException {
        if (reader != null) {
            reader.close();
            System.out.println("Closed BufferedReader using AutoCloseable");
        }
    }

    public static void main(String[] args) {
        try (YourClass yourInstance = new YourClass()) {
            // Implementasi penggunaan yourInstance
            yourInstance.readData();
        } catch (IOException e) {
            // Penanganan exception jika terjadi kesalahan pada penutupan sumber daya
            e.printStackTrace();
        }
    }
}
```


# Stack & Heap Memory

## Stack Memory

Stack Memory di Java digunakan untuk alokasi memori statis dan eksekusi thread. Ini berisi nilai primitif yang spesifik untuk suatu metode dan referensi ke objek yang dirujuk dari metode yang ada di heap.

Akses ke memori ini dalam urutan Last-In-First-Out (LIFO). Setiap kali kita memanggil metode baru, blok baru dibuat di atas tumpukan yang berisi nilai khusus untuk metode tersebut, seperti variabel primitif dan referensi ke objek.

Ketika metode selesai dieksekusi, bingkai tumpukan yang sesuai akan dihapus, aliran kembali ke metode pemanggil, dan ruang tersedia untuk metode berikutnya.

### Beberapa fitur lain dari memory stack meliputi:

1. Itu tumbuh dan menyusut ketika metode baru dipanggil dan dikembalikan.
2. Variabel di dalam stack hanya ada selama metode yang membuatnya sedang berjalan.
3. Ini secara otomatis dialokasikan dan dibatalkan alokasinya ketika metode selesai dieksekusi.
4. Jika memori ini penuh, Java akan menampilkan java.lang.StackOverFlowError.
5. Akses ke memori ini cepat jika dibandingkan dengan memori heap.
6. Memori ini aman untuk thread, karena setiap thread beroperasi di stack-nya sendiri.


## Heap Space

Heap space digunakan untuk alokasi memori dinamis objek Java dan kelas JRE saat runtime. Objek baru selalu dibuat di Heap Space, dan referensi ke objek tersebut disimpan di stack memory.

Objek-objek ini memiliki akses global dan kita dapat mengaksesnya dari mana saja dalam aplikasi.

Kita dapat memecah model memori ini menjadi bagian-bagian yang lebih kecil, yang disebut generasi, yaitu:

1. `Young Generation` – di sinilah semua objek baru dialokasikan dan menua. Pengumpulan Sampah kecil terjadi saat ini terisi.
2. `Old or Tenured Generation` – ini adalah tempat penyimpanan benda-benda yang sudah lama bertahan. Ketika benda disimpan di Generasi Muda, maka ditetapkan ambang batas usia benda tersebut, dan bila ambang batas tersebut tercapai, benda tersebut dipindahkan ke generasi tua.
3. `Permanent Generation` – ini terdiri dari metadata JVM untuk kelas runtime dan metode aplikasi.


### Mari kita menganalisis kode Java sederhana untuk menilai cara mengelola memori di sini:


```java
class Employee {
    int employeeId;
    String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
}

public class EmployeeBuilder {
    private static Employee buildEmployee(int employeeId, String employeeName) {
        return new Employee(employeeId, employeeName);
    }

    public static void main(String[] args) {
        int employeeId = 45;
        String employeeName = "Alice";
        Employee employee = null;
        employee = buildEmployee(employeeId, employeeName);
    }
}

```

Mari kita bedah satu per satu contoh kode Java diatas,
```java
class Employee {
    int employeeId;
    String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
}
```

Kelas Employee memiliki dua atribut: employeeId (bertipe int) dan employeeName (bertipe String). Terdapat konstruktor public Employee(int employeeId, String employeeName) yang digunakan untuk menginisialisasi objek Employee dengan nilai yang diberikan.

```java
public class EmployeeBuilder {
    private static Employee buildEmployee(int employeeId, String employeeName) {
        return new Employee(employeeId, employeeName);
    }

    public static void main(String[] args) {
        int employeeId = 45;
        String employeeName = "Alice";
        Employee employee = null;
        employee = buildEmployee(employeeId, employeeName);
    }
}
```

Kelas EmployeeBuilder memiliki metode statis buildEmployee yang digunakan untuk membuat dan mengembalikan objek Employee dengan parameter employeeId dan employeeName. Dalam metode main, kita mendeklarasikan variabel employeeId dan employeeName dengan nilai tertentu. Kemudian, kita membuat objek Employee menggunakan metode buildEmployee dengan nilai-nilai yang telah dideklarasikan. Variabel employee kemudian diinisialisasi dengan objek Employee yang baru dibuat.
