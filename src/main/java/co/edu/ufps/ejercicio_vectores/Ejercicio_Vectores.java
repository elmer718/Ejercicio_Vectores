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

    public int[] InterseccionCompletitud(int v1[], int v2[]){
        if(v1 == null || v2 == null){
            System.out.println("Uno o ambos vectores son nulos.");
            return null;
        }
        if (v1.length == 0 || v2.length == 0) {
            System.out.println("Uno o ambos vectores están vacíos.");
            return new int[0];
        }
        if (v1.length < 0 || v2.length < 0) { // Aunque nunca debería pasar
            System.out.println("Tamaño de array inválido (negativo).");
            return null;
        }
        
        int k = 0;
        int aux[] = new int[v1.length];

        for (int i = 0; i < v1.length; i++) { //Recorremos V1
            for (int j = 0; j < v2.length; j++) { //Recorremos V2
                if (v1[i] == v2[j]) {
                    aux[k] = v1[i];
                    k++;
                }

            }
        }
        //creamos un vector sin posiciones extras
        int vi[] = new int[k];
        for (int i = 0; i < k; i++) {
            vi[i] = aux[i];
        }
        return vi;
    }
    
    public static void main(String[] args) {
        Ejercicio_Vectores ej = new Ejercicio_Vectores();
        
        //----- Instancia 1 -----
        int[] a = {1,2,35,40,57,85,12};
        int[] b = {2,25,35,10,74,12,69};
        
        int[] vi = ej.Interseccion(a, b);
        int[] vic = ej.InterseccionCompletitud(a, b);
        
        System.out.println("Instancia 1");
        System.out.print("vi: [ ");
        for (int i = 0; i < vi.length; i++) {
            System.out.print(vi[i]+" ");
        }
        System.out.println("]");
        
        System.out.print("vic: [ ");
        for (int i = 0; i < vic.length; i++) {
            System.out.print(vic[i]+" ");
        }
        System.out.println("]");
        
        //----- Instancia 2 -----
        int[] a2 = {124,-456,1214,52563,-7541,74123,145,7846,-7456};
        int[] b2 = {-456,52563,1456,8976,-567,145,-7541,167984,9536};
        
        int[] vi2 = ej.Interseccion(a2, b2);
        int[] vic2 = ej.InterseccionCompletitud(a2, b2);
        
        System.out.println("Instancia 2");
        System.out.print("vi2: [ ");
        for (int i = 0; i < vi2.length; i++) {
            System.out.print(vi2[i]+" ");
        }
        System.out.println("]");
        
        System.out.print("vic2: [ ");
        for (int i = 0; i < vic2.length; i++) {
            System.out.print(vic2[i]+" ");
        }
        System.out.println("]");
        
        //----- Instancia 3 -----
        int[] a3 = {56,120,79,-65,72,-25,-16};
        int[] b3 = {120,-16,-65,72,79,56,-25};
        
        int[] vi3 = ej.Interseccion(a3, b3);
        int[] vic3 = ej.InterseccionCompletitud(a3, b3);
        
        System.out.println("Instancia 3");
        System.out.print("vi3: [ ");
        for (int i = 0; i < vi3.length; i++) {
            System.out.print(vi3[i]+" ");
        }
        System.out.println("]");
        
        System.out.print("vic3: [ ");
        for (int i = 0; i < vic3.length; i++) {
            System.out.print(vic3[i]+" ");
        }
        System.out.println("]");
        
    }
}
