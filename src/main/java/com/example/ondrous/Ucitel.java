package com.example.ondrous;

public class Ucitel {
    private String jmeno;
    private String predmet;
    private int hodnoceni;

    public Ucitel(String jmeno, String predmet, int hodnoceni) {
        this.jmeno = jmeno;
        this.predmet = predmet;
        this.hodnoceni = hodnoceni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPredmet() {
        return predmet;
    }

    public int getHodnoceni() {
        return hodnoceni;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public void setHodnoceni(int hodnoceni) {
        this.hodnoceni = hodnoceni;
    }

    @Override
    public String toString() {
        return jmeno;
    }
}
