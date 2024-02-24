import java.util.ArrayList;

public class Ejercicio2 {
    public int tiempoCoche(int [][] t, int [][] c, int L){
        ArrayList<Integer> estaciones = new ArrayList<>();
        estaciones.add(L);
        return tiempoCocheVoraz(t,c, L, estaciones);
    }

    public int tiempoCocheVoraz(int [][] t, int [][] c, int L, ArrayList<Integer> solucion){
        int tiempoTotal = 0;
        int numEstaciones = t.length;
        int i = 1; //Estacion 1
        while (i < numEstaciones){
            int lineaActual = solucion.get(i-1);
            int otraLinea = 1-lineaActual;
            int costeMantenerse = t[i][lineaActual];
            int costeCambio = c[i][lineaActual] + t[i][otraLinea];
            if(costeMantenerse < costeCambio){
                solucion.add(lineaActual);
                tiempoTotal += costeMantenerse;
            }else{
               solucion.add(otraLinea);
               tiempoTotal += costeCambio;
            }
            i++;
        }
        return tiempoTotal;
    }
}