package edu.escuelaing.arep.app;

import edu.escuelaing.arep.app.calculadora.Calculadora;
import edu.escuelaing.arep.app.linkedlist.LinkedList;

/**
 * Esta clase se encarga de implementar los metodos para calcular correctamente el promedio y la desviacion estandar de una linkedlist
 * @author  Jonathan Fabian Paez Torres
 * @version 1.0
 */
public class App 
{
    static ReaderFile file;
    static LinkedList list;
    static Calculadora calcu;
	/**
	 * Metodo principal el cual se encarga de leer el archivo y calcular el promedio y la desviacion estandar del archivo.
	 * @param args - Inicia el programa
	 */
    public static void main( String[] args )
    {
        file=new ReaderFile();
        list=new LinkedList();
        calcu=new Calculadora();
        
        file.ReaderInsert("archivo2.txt", list);
        System.out.println("La media es: "+calcu.mean(list));
        System.out.println("La desviacion estadar es: "+calcu.standarDeviation(list));
        
    }
}
