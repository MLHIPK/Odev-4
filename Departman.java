package org.example;

import java.util.concurrent.CopyOnWriteArrayList;

public class Departman {
    private String departmanAdi;
    private CopyOnWriteArrayList<Calisan> personeller;

    public Departman(String departmanAdi) {
        this.departmanAdi = departmanAdi;
        this.personeller = new CopyOnWriteArrayList<>();
    }

    public void personelEkle(Calisan calisan) {
        personeller.add(calisan);
    }

    public CopyOnWriteArrayList<Calisan> getPersoneller() {
        return personeller;
    }
}
