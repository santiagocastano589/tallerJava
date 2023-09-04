
import java.util.HashMap;
import java.util.Random;

import javax.swing.JOptionPane;

public class ejercicios {
	// ---------------------- EJERCICIO 1 ----------------------
	public static void name() {
		String nombre= JOptionPane.showInputDialog("ingrese su nombre");
		String apellido= JOptionPane.showInputDialog("ingrese su apellido");
		
		System.out.println("Nombre completo: "+nombre+" "+apellido);
	}
	// ---------------------- EJERCICIO 2 ----------------------
	public static void mayor(int a) {
		a=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero"));
		if (a>10) {
			System.out.println(a+" Es mayor de 10");
		}else {
			System.out.println("el numero ingresado es menor que 10");
		}
	}
	// ---------------------- EJERCICIO 3 ----------------------


	    public static int numAleatorio() {
	        Random rand = new Random();
	        int aleatorio = rand.nextInt(100) + 1; 
	        return aleatorio;
	    }
	
	// ---------------------- EJERCICIO 4 ----------------------
	 
	     
	    public static int encontrarMaximo(int[] arreglo) {
	         
	            if (arreglo == null || arreglo.length == 0) {
	            	System.out.println("el arreglo no puede estar vacio");
	            }
	            
	            int maximo = arreglo[0];

	           
	            for (int i = 1; i < arreglo.length; i++) {
	                if (arreglo[i] > maximo) {
	                    maximo = arreglo[i];
	                }
	            }

	            return maximo;
	   }
	// ---------------------- EJERCICIO 5 ----------------------

	    public static int Maximo(int[] arreglo) {

	        int maximo = arreglo[0]; 
	        for (int i = 1; i < arreglo.length; i++) {
	            if (arreglo[i] > maximo) {
	                maximo = arreglo[i];
	            }
	        }

	        return maximo;
	    }
	    
		// ---------------------- EJERCICIO 6 ----------------------  
	    
	    public static int[] sumaArreglos(int[] arreglo1, int[] arreglo2) {
	        
	        int longitud = arreglo1.length;
	        int[] resultado = new int[longitud];
	        
	        for (int i = 0; i < longitud; i++) {
	            resultado[i] = arreglo1[i] + arreglo2[i];
	        }

	        return resultado;
	    }
	
		// ---------------------- EJERCICIO 7 ----------------------
	    
	    public static void diccionario(String[] args) {
	        HashMap<String, String> diccionario = new HashMap<>();
	        diccionario.put("one", "uno");
	        diccionario.put("tower", "torre");
	        diccionario.put("green", "verde");

	        String palabra = JOptionPane.showInputDialog("Ingrese una palabra en ingles: ").toLowerCase();

	        if (diccionario.containsKey(palabra)) {
	            String traduccion = diccionario.get(palabra);
	            JOptionPane.showMessageDialog(null, "Traduccir al espanol: " + traduccion);
	        } else {
	            JOptionPane.showMessageDialog(null, "La palabra no esta en el diccionario.");
	        }
	    }
	    

	
	
	
	
	
public static void main(String arg[]) {
	// ---------------------- EJERCICIO 1 ----------------------
	
	name();
	
	// ---------------------- EJERCICIO 2 ----------------------
	
	mayor(0);
	
	// ---------------------- EJERCICIO 3 ----------------------
	
	int aleatorio = numAleatorio();
    System.out.println("Número aleatorio generado: " + aleatorio); 
	
	// ---------------------- EJERCICIO 4 ----------------------
	
    int[] miArreglo = { 4, 8, 1, 9, 6, 3, 7, 5 };
    int maximoValor = encontrarMaximo(miArreglo);
    System.out.println("El valor máximo en el arreglo es: " + maximoValor);
	
	// ---------------------- EJERCICIO 5 ----------------------
	
    int[] arreglo = {30, 2, 7, 15, 90, 55};
    
    int maximo = Maximo(arreglo);
    
    System.out.println("El valor es: " + maximo);
	
	// ---------------------- EJERCICIO 6 ----------------------
	
    int[] arreglo1 = {2, 6, 9};
    int[] arreglo2 = {5, 1, 6};
   
    int[] resultado = sumaArreglos(arreglo1, arreglo2);
    
    System.out.print("Resultado: ");
    for (int i = 0; i < resultado.length; i++) {
        System.out.print(resultado[i] + " ");
    }
	
	
	// ---------------------- EJERCICIO 7 ----------------------
	diccionario(arg);
	
	}
}










