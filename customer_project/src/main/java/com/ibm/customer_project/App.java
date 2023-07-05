package com.ibm.customer_project;

import java.io.*;
import java.util.*;

import com.ibm.customer_project.model.Product;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream inputStream=null;
		FileOutputStream outputStream=null;
		ObjectOutputStream output=null;
		ObjectInputStream input=null;
		try {

			inputStream = new FileInputStream("data.ser");
			outputStream = new FileOutputStream("data.ser");
			output = new ObjectOutputStream(outputStream);
			input=new ObjectInputStream(inputStream);
			Product product = new Product("Pencil", 1.2, 1);
			Product product1 = new Product("Pen", 1.2, 2);
			List<Product> list=new ArrayList<>();
			list.add(product);
			list.add(product1);
			output.writeObject(list);
			Object o=input.readObject();
			List<Product> list1=null;
			if(o instanceof List)
			{
				list1=(List<Product>)o;
			}
			
			for(Product p:list1)
			{
				System.out.println(p);
			}

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			input.close();
			output.close();
		}
	}
}