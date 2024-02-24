package ficherosPrac5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DivideLista {

	/**
	 *
	 * @param datos lista de entrada
	 * @param k     longitud de una de las listas solución
	 * @param a   lista solución 1 (salida)
	 * @param b   lista solución 2 (salida)
	 * @return  la diferencia entre las dos listas
	 *
	 */

	public static int resolverVoraz(int []datos, int k, List<Integer> a, List<Integer> b) {
		Arrays.sort(datos);
		int i = 0;
		while(i < datos.length){
			int valorAcumuladoA = sumar(a);
			int valorAcumuladoB = sumar(b);
			if(k < datos.length - k){
				if((a.size() < k)){
					a.add(datos[i]); //Pequeños
				}else{
					b.add(datos[i]); //Grandes
				}
			}else{
				if((a.size() < k)){
					b.add(datos[i]); //Pequeños
				}else{
					a.add(datos[i]); //Grandes
				}
			}
			i++;
		}
		return (sumar(b) - sumar(a));
	}

	public static int sumar(List<Integer> l){
		int suma = 0;
		for(Integer i: l){
			suma += i;
		}
		return suma;
	}
}
