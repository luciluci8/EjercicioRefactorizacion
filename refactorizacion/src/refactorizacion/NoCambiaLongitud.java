package refactorizacion;

/**
 *
 * @author Lucía
 */
public class NoCambiaLongitud {
    
  
    private int valor;
//metodo que modifica el contenido de la posicion p de un array con el valor pasado

    public void visualizar(int longitud, int[] vector) {
        //Mostramos los elementos del array
        System.out.print("vector = {");
        for (int i = 0; i < longitud; i++) {
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
