# README – Program Validasi Umur dengan Queue

## Deskripsi
Program ini menerima input berupa string angka yang dipisahkan spasi (misalnya "39 538 39 55 12 28 49 430").  
Setiap angka dianggap sebagai umur dan akan diproses ke dalam dua antrian (queue):

- Queue `passed` → berisi umur yang valid (antara 28 hingga 118).  
- Queue `blocked` → berisi umur yang tidak valid (kurang dari 28 atau lebih dari 118).

Program menggunakan kelas `Queue` dari Java dengan implementasi `LinkedList`.


## Cara Kerja
1. Program membaca input string dengan `Scanner`.
2. Input dipisahkan menjadi array string menggunakan `split(" ")`.
3. Setiap elemen string dikonversi ke integer dengan `Integer.parseInt()`.
4. Umur yang sesuai aturan (28–118) dimasukkan ke queue `passed`, sisanya ke queue `blocked`.
5. Hasil akhir ditampilkan dalam bentuk isi kedua queue.