
package recorrido_arbool;


public class Recorrido_arbool {

    
    public static void main(String[] args) {
        NodoArbol tree = new NodoArbol <Integer> (); 
        tree.setDato(32);
        
       
       // tree.setHijo(new NodoArbol[] {new NodoArbol(34, null), new NodoArbol(43,null)});
         NodoArbol[] arrNodoArbol = {new NodoArbol (23,null), new NodoArbol(12,null)};
        tree.setHijo(arrNodoArbol);
        tree.preOrden();
        tree.getHijo()[0].setHijo(0, 50);
         tree.getHijo()[1].setHijo(0, 40);
        
        
      
    }
    
}
