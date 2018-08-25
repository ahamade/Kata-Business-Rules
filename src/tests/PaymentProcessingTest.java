package tests;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import kata.IOrderProcessingService;
import kata.OrderProcessingService;
import kata.PaymentProcessing;
import kata.Product;
import kata.ProductType;

class PaymentProcessingTest {

	@Test
	void testCanProcessPhysicalProduct() {
		Product product = new Product(ProductType.PhysicalProduct);
		IOrderProcessingService service = new OrderProcessingService();
		PaymentProcessing paymentProcessing = new PaymentProcessing(service);
		ArrayList<String> results = paymentProcessing.processPayment(product);
		Assert.assertEquals("", 1, results.size());
	}

}
