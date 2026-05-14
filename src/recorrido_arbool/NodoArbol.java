
package recorrido_arbool;

public class NodoArbol<T> {
   private T dato; //Definiendo el nodo dato principal (este es un nodo generico)
   private NodoArbol[] hijo; //generamos un conjunto de nodos del mismo tipo del nodo principal
   
   //Siguen los metodos
    public NodoArbol(T dato, NodoArbol[] hijo) { //Constructor
        this.dato = dato;
        this.hijo = hijo;
    }
    
//creo el identificador del nodo, caundo no tine definido el dato ni los hijos
    NodoArbol() {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   
    }
   
    
//Metodos getters y seters
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoArbol[] getHijo() {
        return hijo;
    }

    public void setHijo(NodoArbol[] hijo) {
        this.hijo = hijo;
    }
    
    public void setHijo(int pos, T dato) {
    //Solo agrego los parametros de int pos, T dato. para iniciar
        System.out.println(hijo);
        if (hijo == null){
            hijo = new NodoArbol[2];
        }
        if (pos>= 0 && pos <hijo.length){
        if(hijo[pos] == null){
          hijo[pos] = new NodoArbol(dato, null);
          }else{
            hijo[pos].setDato(dato);
        }
      }          
    }
    
    public void preOrden(){
        System.out.print(dato);
        if(hijo == null) return;
        for (NodoArbol n : hijo){
            System.out.print(", ");
            n.preOrden();
        }
        
        
    }
    
   
}
