package com.amazon.consumer;

import com.amazon.producer.IProducer;
import com.amazon.producer.ProducerFactory;

public class Consumer {
	public static void main(String[] args) {
		String product="watch";
		int quantity=150;
		IProducer iproducer=ProducerFactory.getProduct();
		iproducer.produceProduct(product,quantity);
	}

}
