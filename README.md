# Modul Pemrograman Berbasis Objek Informatika

## 1. Deskripsi Modul

Repositori ini berisi modul dan source code untuk mata kuliah Pemrograman Berorientasi Objek, program studi Informatika

## 2. Struktur Direktori

```
├── modul-praktikum
│   ├── praktikum-1
|   |   ├── assets/
│   │   └── README.md
│   ├── praktikum-2
│   │   └── README.md
│   ├── praktikum-3
│   │   └── README.md
│   └── praktikum-4
│       └── README.md
└── source-code
    ├── praktikum-1/
    |   ├── src/
    |   ├── project/
    │   └── pom.xml
    ├── praktikum-2/
    ├── praktikum-3/
    └── praktikum-4/
```

### 2.1 Penjelasan Direktori

#### 2.1.1 modul-praktikum

Direktori ini berisi modul praktikum dari setiap sesi praktikum yang dipisahkan oleh direktori `praktikum-{num}`. Di setiap direktori ini, terdapat sebuah `README` file yang berisi modul praktikum. 

Untuk kolaborator: jika terdapat gambar/asset lainnya, silakan membuat direktori sendiri dengan nama `assets` di modul terkait.

#### 2.1.2 source-code

Direktori ini berisi Java Project dari setiap praktikum. Source code dari praktikum ada di direktori `src/main/`.

Untuk kolaborator: Silakan membuat Maven Project sebagai source code dari setiap modul praktikum yang dibuat di direktori ini. source code praktikum silakan di-push di hari Sabtu setelah semua praktikum selesai.

## 3. Aturan Kontribusi (untuk colaborator)

### Aturan penulisan source code:

Source code ditulis dengan mengikuti kaidah berikut:

| Nama komponen | Code Style | Contoh |
| -- | -- | -- |
| nama file | pascal case | `KucingBiru.java` |
| nama class | pascal case | `class KucingBiru extends ...` |
| nama variabel | camel case | `int kucingBiru = ...` |
| name fungsi / prosedur | camel case | `int kucingBiru(...){...}` |

Catatan: penamaan file, class, variabel, dan fungsi / prosedur wajib mendeskripsikan kegunaan dari komponen code tersebut.

### Aturan commit

1. Clone repositori ini
2. Buat modul praktikum & source code sesuai dengan jadwal di local repository.
3. Berikan commit message sesuai dengan materi yang dibuat. 
4. Push ke branch baru dengan nama branch `praktikum-{num}` di remote repository.
5. Ajukan pull request ke branch `master`.

