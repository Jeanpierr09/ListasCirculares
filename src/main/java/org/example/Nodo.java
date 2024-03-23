package org.example;

public class Nodo {
    private  Nodo Sig;
    private int Dato;

    public Nodo(int Dato) {
        this.Dato = Dato;
        this.Sig = this;

    }

    public Nodo getSig() {
        return Sig;
    }

    public void setSig(Nodo sig) {
        Sig = sig;
    }

    public int getDato() {
        return Dato;
    }

    public void setDato(int dato) {
        Dato = dato;
    }
}
