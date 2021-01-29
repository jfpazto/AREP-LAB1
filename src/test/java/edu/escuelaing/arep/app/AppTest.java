package edu.escuelaing.arep.app;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.escuelaing.arep.app.calculadora.Calculadora;
import edu.escuelaing.arep.app.linkedlist.LinkedList;
/**
 * Unit test for simple App.
 */
public class AppTest 
   
{
	/**
	 * Esta prueba verifica que se calcule correctamente el promedio y la desviacion estandar a partir de los primeros datos
	 */
	@Test
	public void Test1() {
        ReaderFile file=new ReaderFile();
        LinkedList list=new LinkedList();
        Calculadora calcu=new Calculadora();
        
        file.ReaderInsert("archivo.txt", list);
        
        double mean=calcu.mean(list);
        double desv=calcu.standarDeviation(list);
		assertEquals(mean,550,6) ;
		assertEquals(desv, 572,03);
	}
	
	/**
	 * Esta prueba verifica que se calcule correctamente el promedio y la desviacion estandar a partir de los segundos datos
	 */
	@Test
	public void Test2() {
        ReaderFile file=new ReaderFile();
        LinkedList list=new LinkedList();
        Calculadora calcu=new Calculadora();
        
        file.ReaderInsert("archivo2.txt", list);
        
        double mean=calcu.mean(list);
        double desv=calcu.standarDeviation(list);
		assertEquals(mean,60,32) ;
		assertEquals(desv, 62,26);
	}
	
	/**
	 * Esta prueba verifica que en el momento de leer el archivo txt e insertarlo en la lista se haga correctamente
	 */
	@Test
	public void TestReadFile() {
        ReaderFile file=new ReaderFile();
        LinkedList list=new LinkedList();
        file.ReaderInsert("archivo2.txt", list);
        double valor=list.returnValue(2);
		assertEquals(valor, 69,9);
	}
	
	/**
	 * Esta prueba verifica que se haga el promedio de una lista correctamente
	 */
	@Test
	public void TestMean() {
        Calculadora calcu=new Calculadora();
        LinkedList list=new LinkedList();
        list.insertar(2);
        list.insertar(3);
        list.insertar(1);
        list.insertar(3);
        list.insertar(1);
        double valor=calcu.mean(list);
		assertEquals(valor, 2,0);
	}
	
	/**
	 * Esta prueba verifica que se haga la desviacion estandar de una lista correctamente
	 */
	@Test
	public void TestDesv() {
        Calculadora calcu=new Calculadora();
        LinkedList list=new LinkedList();
        list.insertar(18);
        list.insertar(20);
        list.insertar(20);
        list.insertar(22);
        list.insertar(20);
        list.insertar(20);
        double valor=calcu.standarDeviation(list);
		assertEquals(valor, 1,63);
	}
	
	/**
	 * Esta prueba verifica que un nodo se agregue correctamente en la cabeza es decir en la primera posicion
	 */
	@Test
	public void TestInsertHead() {
        LinkedList customLinkedList = new LinkedList();
        customLinkedList.insertarHead(3);
        double valor=customLinkedList.returnValue(1);
		assertEquals(valor, 3,0);
	}
	
	/**
	 * Esta prueba verifica que los valores se inserten correctamente en la lista
	 */
	@Test
	public void TestInsert() {
        LinkedList customLinkedList = new LinkedList();
        customLinkedList.insertar(50);
        customLinkedList.insertar(100);
        customLinkedList.insertar(40);
        customLinkedList.insertar(500);
        double valor=customLinkedList.returnValue(3);
		assertEquals(valor, 40,0);
	}
	
	/**
	 * Esta prueba verifica que se devuelva la longitud correcta de una lista
	 */
	@Test
	public void TestSize() {
        LinkedList customLinkedList = new LinkedList();
        customLinkedList.insertar(50);
        customLinkedList.insertar(100);
        customLinkedList.insertar(40);
        customLinkedList.insertar(500);
        int valor=customLinkedList.getSize();
		assertEquals(valor, 4);
	}
	
	/**
	 * Esta prueba verifica que se borre un elemento de la lista dada su posicion
	 */
	@Test
	public void TestDel() {
        LinkedList customLinkedList = new LinkedList();
        customLinkedList.insertar(50);
        customLinkedList.insertar(100);
        customLinkedList.insertar(40);
        customLinkedList.insertar(500);
        customLinkedList.borrar(2);
        double valor=customLinkedList.returnValue(2);
		assertEquals(valor, 100,0);
	}
	/**
	 * Esta prueba verifica que la busqueda de un elemento dentro de la lista sea correcta
	 */
	@Test
	public void TestSearch() {
        LinkedList customLinkedList = new LinkedList();
        customLinkedList.insertar(50);
        customLinkedList.insertar(100);
        customLinkedList.insertar(40);
        customLinkedList.insertar(500);
        boolean valor=customLinkedList.buscar(40);
        
		assertEquals(valor, true);
	}
}
