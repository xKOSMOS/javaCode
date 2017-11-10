package com.company;

import java.util.*;

public class ListeDesCadres {

    private List<Cadre> lesCadres;

    public ListeDesCadres(List<Cadre> lesCadres) {
        this.lesCadres = lesCadres;
    }

    public ListeDesCadres() {
        lesCadres = new ArrayList<>();
    }

    public List<Cadre> getLesCadres() {
        return lesCadres;
    }

    public void setLesCadres(List<Cadre> lesCadres) {
        this.lesCadres = lesCadres;
    }


    public void add(Cadre nouveauCadre) {
        this.lesCadres.add(nouveauCadre);
    }

    public void trier() {
        Collections.sort(this.lesCadres, new Comparator<Cadre>() {
            @Override
            public int compare(Cadre o1, Cadre o2) {
                int r = o1.getNom().compareTo(o2.getNom());
                    if (r == 0) {
                        return o1.getPrenom().compareTo(o2.getPrenom());
                    } else {
                        return r;
                    }

            }
        });
    }


    public void displayList() {
        for (Cadre cadre: this.lesCadres)
            System.out.println(cadre.toString());
    }

    public boolean searchByCin(String cin) {
        for (Cadre cadre: this.lesCadres)
            if (cadre.getCin().equals(cin))
                return true;
        return false;
    }


    public void deleteByCin(String cin) {
        System.out.println(cin);
        for (Cadre cadre: this.lesCadres) {
            if (cadre.getCin().equals(cin)) {
                this.lesCadres.remove(cadre);
                return;
            }
        }
    }


}
