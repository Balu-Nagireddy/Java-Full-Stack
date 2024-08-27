package io;
import java.io.Serializable;

public class ExampleOnSerTransient implements Serializable{


	transient int a=10;

	int b=20;

	public void methodOne(){

		System.out.println("We are in method one of ExampleOnSerialization");

	}


}