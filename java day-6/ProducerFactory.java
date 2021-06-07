package com.amazon.producer;
import java.util.ResourceBundle;
public class ProducerFactory {
	public static IProducer getProduct() {
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String className=rb.getString("producerclass");
		IProducer iproducer=null;
		try {
			iproducer=(IProducer)Class.forName(className).newInstance();
		}
		catch(Exception e){
			System.out.println("Exception Occured: "+e);
		}
		return iproducer;
	}
}
