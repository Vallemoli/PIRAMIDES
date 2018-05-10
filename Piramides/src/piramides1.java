
public class piramides1 {

	public static void main(String[] args) {

		int base= 9;
		
		//Calcular el nº de filas
		int filas= (base+1)/2;
		
		/*
		 * Para cada fila desde 0 hasta filas -1
		 * 
		 * 1. Calcular los blancos + imprimirlos
		 * 2. Calcular los asteriscos + imprimirlos
		 * 
		 */
		
		for (int i = 0; i < filas; i++) {
			
			// i es el número de la fila
			/*
			 * Hacemos una tabla con i y el numero de blancos
			 * correspondientes a cada i
			 * Vemos que la sumas es constante, asi que podemos formular
			 * 
			 * i+blancos= filas-1
			 * 
			 * asi que si se despeja blancos
			 * 
			 * blancos= filas-1-i
			 */
			
			//calcular e imprimir blancos
			for (int j=0; j<filas-1-i; j++)
				System.out.print(' ');
			
			/*
			 * para calcular los asteriscos realizamos un razonamiento
			 * análogos a los blancos
			 */
			
			for(int j=0; j<2*i+1; j++)
				System.out.print('*');
			
			//los blancos de final no se hace falta calcularlos
			
			//imprimir salto de línea
			System.out.print('\n');
			System.out.print('\nJesús');
			
		}//for
		
	}//main

}//class