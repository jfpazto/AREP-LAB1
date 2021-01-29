package edu.escuelaing.arep.app;

import java.io.File;

import java.util.Scanner;

import edu.escuelaing.arep.app.linkedlist.LinkedList;


/**
 * Esta clase se encarga de implementar los metodos para calcular correctamente el promedio y la desviacion estandar de una linkedlist
 * @author  Jonathan Fabian Paez Torres
 * @version 1.0
 */
public class ReaderFile {
	LinkedList list=new LinkedList();
    /**
     * Metodo encargado de leer un archivo en texto plano y cada uno de sus valores insertarlos en una linkedlist
     * @param ruta - ruta donde se encuentra el archivo con el texto plano
     * @param list - lista sobre la cual se van a agregar los elementos
     */
	public void ReaderInsert(String ruta, LinkedList list) {
        try {
            Scanner input = new Scanner(new File(ruta));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                list.insertar(Double.parseDouble(line));
                //System.out.println(line);
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}



}
