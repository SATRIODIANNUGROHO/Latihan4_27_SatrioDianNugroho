# Luas dan Keliling Persegi Panjang #
# Pseudocode #
Deklarasi : float panjang, lebar, luas, keliling 

input panjang = read panjang
input lebar = read lebar

luas = panjang * lebar 
keliling = (panjang + lebar) * 2

print luas dan keliling
# Flowchart #
```mermaid
graph TD;
    A([Start])-->B{{int panjang, lebar, luas, keliling}};
    B{{int panjang, lebar, luas, keliling}}-->C[/input panjang, lebar/];
    C[/input panjang, lebar/]-->D(luas = panjang * lebar, keliling = panjang + lebar * 2);
    D(luas = panjang * lebar, keliling = panjang + lebar * 2)-->E[/tampilkan luas dan keliling/];
    E[/tampilkan luas dan keliling/]-->F([Selesai])
```
