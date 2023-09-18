# Luas dan keliling Segitiga #
# Pseudocode #
deklarasi : float alas, tinggi, sisi, luas, keliling

input alas = read alas\
input tinggi = read tinggi\
input sisi = read sisi

luas = 0.5 * alas * tinggi\
keliling = 3 * sisi

print luas dan keliling

# Flowchart #

```mermaid
graph TD;
    A([Start])-->B{{float alas, tinggi, sisi, luas, keliling}};
    B{{float alas, tinggi, sisi, luas, keliling}}-->C[/input alas, tinggi, sisi/];
    C[/input alas, tinggi, sisi/]-->D(luas = 0.5 * alas * tinggi, keliling = 3 * sisi);
    D(luas = 0.5 * alas * tinggi, keliling = 3 * sisi)-->E[/tampilkan luas dan keliling/];
    E[/tampilkan luas dan keliling/]-->F([Selesai]);
```
