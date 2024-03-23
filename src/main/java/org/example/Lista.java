package org.example;

public class Lista {
    private Nodo Primero;

    public Lista() {
        Primero = null;
    }

    public boolean vacia(){
        return (Primero != null);
    }

    public void agregar(int data){
        Nodo nuevo = new Nodo(data);
        if (vacia()){
            nuevo.setSig(Primero.getSig());
            Primero.setSig(nuevo);
        }
        Primero = nuevo;
    }

    public void ver(){
        Nodo aux = Primero;
        if(vacia()){
            do{
                System.out.print(" "+ aux.getDato());
                aux = aux.getSig();
            }while(aux!=Primero);
        }
    }
}
