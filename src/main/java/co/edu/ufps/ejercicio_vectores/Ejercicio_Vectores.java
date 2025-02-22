/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.ufps.ejercicio_vectores;

import java.util.Arrays;

/**
 *
 * @author FARO
 */
public class Ejercicio_Vectores {
    
    public int[] Interseccion(int v1[], int v2[]){
        
        int k = 0;
        int vi[] = new int[v1.length];
        
        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                if (v1[i] == v2[j]) {
                    vi[k] = v1[i];
                    k++;
                }
            }
        }
        
        return vi;
    }
    
    public static void main(String[] args) {
        int[] a = {1,2,35,40,57,85,12};
        int[] b = {2,25,35,10,74,12,69};
        
        Ejercicio_Vectores ej = new Ejercicio_Vectores();
        
        System.out.println(Arrays.toString(ej.Interseccion(a, b)));
    }
}
