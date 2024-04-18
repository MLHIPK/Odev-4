package org.example;

public class Main {
    public static void main(String[] args) {
        
        Departman itDepartmani = new Departman("İK");

     
        Calisan calisan1 = new Calisan("Meliha", "İpek");
        Calisan calisan2 = new Calisan("Mesude", "Tilki");

       
        itDepartmani.personelEkle(calisan1);
        itDepartmani.personelEkle(calisan2);

        
        List<Calisan> departmanPersonelleri = itDepartmani.getPersoneller();
        System.out.println(itDepartmani.getAd() + " Departmanındaki Personeller:");

        for (Calisan calisan : departmanPersonelleri) {
            System.out.println("Ad: " + calisan.getAd() + ", Soyad: " + calisan.getSoyad());
        }
    }
}
