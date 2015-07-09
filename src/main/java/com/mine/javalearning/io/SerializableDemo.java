package com.mine.javalearning.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Person ted = new Person("Ted","Neward",39);
		Person charl = new Person("charlotte", "Neward", 38);
		ted.setSpouse(charl);charl.setSpouse(ted);
		
		FileOutputStream fos;
		
		fos = new FileOutputStream("demo/tmpdata.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ted);
		oos.close();
		
		 FileInputStream fis = new FileInputStream("demo/tmpdata.ser");
         ObjectInputStream ois = new ObjectInputStream(fis);
         Person te;
		try {
			te = (Person) ois.readObject();
			System.out.println(te.getFirstName());
	        System.out.println(te.getSpouse().getFirstName());
	        ois.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
		
	}

}
