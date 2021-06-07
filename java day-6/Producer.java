package com.amazon.producer;

public class Producer implements IProducer {
	String product="watch";
	int quantity=500;
	private boolean productAvailable(String product,int quantity) {
		if(this.product.equals(product) && this.quantity>=quantity) {
			return true;
		}
		return false;
	}
	public boolean produceProduct(String product,int quantity){
		System.out.println("From producer");
		if(productAvailable(product,quantity)) {
			System.out.println("Product produced: "+product);
			System.out.println("quantity: "+quantity);
			return true;
		}
		System.out.println("out of stock");
		return false;
	}

}
