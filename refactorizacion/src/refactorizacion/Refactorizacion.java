/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion;

/**
 *
 * @author Diurno
 */
public class Refactorizacion {
   

    public static void main(String[] args) {
// TODO code application logic here
        int[] vector = new int[5];
        vector[0] = 2;
        vector[1] = 4;
        vector[2] = 6;
        vector[3] = 8;
        Prueba p = new Prueba();
        p.valor = 10;
        p.modificar(vector);
        p.borrar(vector);
        p.insertar(vector);

    }

}
