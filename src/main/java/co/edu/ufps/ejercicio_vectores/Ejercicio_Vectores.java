/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.ufps.ejercicio_vectores;

/**
 * @author Elmer Fabian Rodriguez Cardenas - 1151554
 * @author Jeisson Javier Chacon Parada - 1151594
 */
public class Ejercicio_Vectores {
    
    public int[] Interseccion(int v1[], int v2[]){
        
        int k = 0;
        int vi[] = new int[v1.length]; //para el peor de los casos si todos estan en V2
        
        for (int i = 0; i < v1.length; i++) { //Recorremos V1
            for (int j = 0; j < v2.length; j++) { //Recorremos V2
                if (v1[i] == v2[j]) {
                    vi[k] = v1[i];
                    k++;
                }
            }
        }
        
        return vi;
    }
    
    public static void main(String[] args) {
        
        Ejercicio_Vectores ej = new Ejercicio_Vectores();
        
        int[] a = {1,2,35,40,57,85,12};
        int[] b = {2,25,35,10,74,12,69};
        int[] vi = ej.Interseccion(a, b);
        System.out.print("[ ");
        for (int i = 0; i < vi.length; i++) {
            System.out.print(vi[i]+" ");
        }
        System.out.print("]");
    }
}
