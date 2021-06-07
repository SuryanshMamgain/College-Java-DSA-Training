package com.amazon.producer;

public class EnhancedProducer implements IProducer{
	String product="watch";
	int quantity=300;
	private boolean productAvailable(String product,int quantity) {
		if(this.product.equals(product) && this.quantity>=quantity) {
			return true;
		}
		return false;
	}
	@Override
	public boolean produceProduct(String product,int quantity){
		System.out.println("From Enhanced Producer");
		if(productAvailable(product,quantity)) {
			System.out.println("Product produced: "+product);
			System.out.println("quantity: "+quantity);
			return true;
		}
		System.out.println("out of stock");
		return false;
	}

}
