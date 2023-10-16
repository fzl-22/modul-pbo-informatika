# Overriding & Overloading

## 1. Overriding

### 1.1 Definisi Overriding

`Overriding` adalah salah satu konsep dalam pemrograman berorientasi objek (OOP) yang memungkinkan sebuah `subclass` untuk menggantikan implementasi metode yang sudah didefinisikan dalam `superclass`. Dengan kata lain, subclass dapat menyediakan implementasi yang berbeda untuk metode yang sama yang sudah ada dalam `superclass`.

### 1.2 Kegunaan dan Keuntungan Overriding

1. `Fleksibilitas` : Overriding memungkinkan kita untuk mengganti perilaku default yang diwarisi dari superclass. Ini memungkinkan kita untuk memodifikasi atau mengkustomisasi perilaku metode sesuai dengan kebutuhan kelas turunan (subclass).

2. `Perbaikan Kesalahan` : Jika implementasi metode di superclass terbukti memiliki kesalahan atau perlu diperbaiki, kita dapat melakukan perbaikan hanya di kelas turunan tanpa memengaruhi kelas lain yang menggunakan metode tersebut.

### 1.3 Implementasi Overriding

Untuk memperoleh gambaran yang lebih jelas, mari kita lihat contoh di bawah ini.

![](./assets/shape.png)

Pada gambar diatas kita memiliki `superclass` yang bernama (`"Shape"`) dan memiliki `subclasses` bernama (`"Circle"` dan `"Rectangle"`).

child dari parent akan mendapatkan semua metode dari parent ( `Shape` ) tugas kita sekarang adalah meng-`Override` metode dari parent yang telah dibuat sebelumnya.

mari kita amati code dibawah :

#### File `classes/Shape.java` ( `Superclass` )

```java
public class Shape {
    public void draw() {
        System.out.println("Menggambar bentuk umum.");
    }

    public double calculateArea() {
        System.out.println("Menghitung luas bentuk umum.");
        return 0;
    }
}

```

#### File `classes/Circle.java` ( `subclass` )

```Java
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Menggambar lingkaran dengan radius " + radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
```

#### File `classes/Rectangle.java` ( `subclass` )

```java
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Menggambar persegi panjang dengan panjang " + length + " dan lebar " + width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

```

#### File `Main.java`

```java
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Shape();

        for (Shape shape : shapes) {
            shape.draw();
            double area = shape.calculateArea();
            System.out.println("Luas: " + area);
            System.out.println();
        }
    }
}
```

## 2. Method Overloading

### 2.1 Definisi Overloading

```
Method overloading hanyalah penggunaan ulang nama method hanya saja berbeda daftar parameter-nya.
```

Dengan overloading, programmer dapat banyak versi method yang memiliki daftar parameter yang berbeda-beda. Sebagai contoh:

```java
public void walk() {
    System.out.println("Walking...");
}

public void walk(String name){
    System.out.println(name + " " + "is walking");
}

public void walk(String name, int duration){
    System.out.println(name + " " + "is walking for" + " " + duration + " " + "hours");
}
```

Ketiga method di atas memiliki nama sama, namun dianggap sebagai 3 method yang berbeda karena memiliki daftar parameter yang berbeda. Inilah konsep overloading.

Untuk melakukan method overloading, beberapa hal ini harus diperhatikan:

1. **Boleh memiliki return type yang berbeda** asalkan daftar parameternya berbeda.
2. **Tidak boleh hanya mengganti return type** karena Java compiler akan menganggapnya sebagai method overriding. Jadi, daftar parameter harus berbeda.
3. **Boleh memvariasikan access modifier** di setiap overloaded methodnya.

Constructor juga bisa di-overload karena sejatinya constructor adalah method, hanya saja sedikit lebih spesial.

### 2.2 Implementasi Method Overloading

File `Human.java`:
```Java
public class Human {
    // attributes
    public String name;
    public int age;
    public String email;
    
    // constructor overloading
    // memungkinkan karena constructor sejatinya adalah method, hanya saja lebih spesial
    public Human(){
        // default constructor
        this.name = "unnamed";
        this.age = 0;
        this.email = "example@gmail.com";
    }
    
    public Human(String name, int age){
        // overloaded constructor
        this.name = name;
        this.age = age;
        this.email = "empty";
    }
    
    public Human(String name, int age, String email){
        // overloaded constructor
        this.name = name;
        this.age = age;
        this.email = email;
    }    
    
    // methods
    public void walk(){
        System.out.println(this.name + " " + "sedang berjalan");
    }
    
    // overloaded method
    public void walk(int hourDuration){
        System.out.println(this.name + " " + "sedang berjalan selama" + " " + hourDuration + " " + "jam.");
    }
    
    public String sendEmail(String receiver){
        return "Email terkirim dari " + this.email + " ke " + receiver;
    }
    
    public void sendEmail(String receiver, String subject){
        System.out.println("Email terkirim dari " + this.email + " ke " + receiver);
        System.out.println("Subject: " + subject);
    }
    
    @Override
    public String toString(){
        return "Name\t: " + this.name + "\n" + "Age\t: " + this.age + "\n" + "Email\t: " + this.email;
    }
}
```

File `Main.java`:

```Java
public class Main {

    public static void main(String[] args) {
        Human unnamed = new Human();
        System.out.println(unnamed.toString());
        
        System.out.println("");
        
        Human faisal = new Human("Ahmad Faisal", 20);
        System.out.println(faisal.toString());
        faisal.walk();
        faisal.walk(3);
        
        System.out.println("");
        
        Human khuluq = new Human("Khuluqil Karim", 20, "khuluq@gmail.com");
        System.out.println(khuluq.toString());
        String khuluqEmailSent = khuluq.sendEmail("khuluq@gmail.com");
        System.out.println(khuluqEmailSent);
        khuluq.sendEmail("contact@ahmadfaisal.online", "Mengirim email sederhana");
    }
}

```

### Soal :

1. Buatlah subclass baru bernama Triangle dan override methode `draw()` dan `calculateArea()` dengan mengimplementasikan `rumus segitiga` didalamnya.

2. Kreasikan source code di bab 2 (Overloading), dengan menambahkan 1 atribute baru dan melakukan overload pada constructor dan method yang sudah ada (masing-masing 1). Kemudian implementasikan di class utama.
