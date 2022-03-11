package refactorizacion;

/**
 *
 * @author Lucía
 */
public class Prueba {
    
  
    private int valor;
//metodo que modifica el contenido de la posicion p de un array con el valor pasado

    public void modificar(int[] vector, int longitudActual, int posicion) {
        int longitud = vector.length;
        int i;
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
        
//Modificamos el array
        if (posicion < longitud) {
//mostramos su contenido
            System.out.println("Elemento a modificar=" + vector[posicion]);
            vector[posicion] = this.getValor();
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }
//metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos
    

    public void borrar(int[] vector, int longitudActual, int posicion) {
        int i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("vector = {");
        int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (posicion < longitud) {
            System.out.println("Elemento a borrar=" + vector[posicion]);
            for (i = posicion; i > longitud - 1; i--) {
                vector[i] = vector[i + 1];
            }
        }
        visualizar(longitud, vector);
    }
//metodo que inserta un elemento en la posicion p desplazando a la derecha todos los elementos

    public void visualizar(int longitud, int[] vector) {
        //Mostramos los elementos del array
        System.out.print("vector = {");
        for (int i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }

    public void insertar(int[] vector, int longitudActual, int posicion) {
        int i;
//mostramos su contenido
//Mostramos los elementos del array
        int longitud = vector.length;
        System.out.print("vector ={");
        
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (posicion < longitud) {
            for (i = longitud - 1; i < posicion; i++) {
                vector[i] = vector[i - 1];
            }
            vector[posicion] = this.getValor();
            System.out.println("Elemento a insertar=" + this.getValor());
        }
//Mostramos los elementos del array
        System.out.print("vector ={");
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    


}
