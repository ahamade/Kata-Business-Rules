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
		Assert.assertEquals("Should also generate a commission.", 2, results.size());
	}
	
	@Test
	void testCanProcessBook() {
		Product product = new Product(ProductType.Book);
		IOrderProcessingService service = new OrderProcessingService();
		PaymentProcessing paymentProcessing = new PaymentProcessing(service);
		ArrayList<String> results = paymentProcessing.processPayment(product);
		Assert.assertEquals("Should also generate a commission.", 2, results.size());
	}
	
	@Test
	void testCanActivateNewMembership() {
		Product product = new Product(ProductType.NewMembership);
		IOrderProcessingService service = new OrderProcessingService();
		PaymentProcessing paymentProcessing = new PaymentProcessing(service);
		ArrayList<String> results = paymentProcessing.processPayment(product);
		Assert.assertEquals("Should also email owner.", 2, results.size());
	}
	
	@Test
	void testCanUpdateMembership() {
		Product product = new Product(ProductType.UpdateMembership);
		IOrderProcessingService service = new OrderProcessingService();
		PaymentProcessing paymentProcessing = new PaymentProcessing(service);
		ArrayList<String> results = paymentProcessing.processPayment(product);
		Assert.assertEquals("Should also email owner.", 2, results.size());
	}
	
	@Test
	void testCanEmailOwner() {
		Product product = new Product(ProductType.UpdateMembership);
		IOrderProcessingService service = new OrderProcessingService();
		PaymentProcessing paymentProcessing = new PaymentProcessing(service);
		ArrayList<String> results = paymentProcessing.processPayment(product);
		Assert.assertEquals("Should upadte membership.", 2, results.size());
		Assert.assertEquals("Email owner rule should be the 2nd.", "Email owner", results.get(1));
	}
	
	@Test
	void testCanAddFreeVideo() {
		Product product = new Product(ProductType.Video);
		product.setTitle("Learning to Ski");
		IOrderProcessingService service = new OrderProcessingService();
		PaymentProcessing paymentProcessing = new PaymentProcessing(service);
		ArrayList<String> results = paymentProcessing.processPayment(product);
		Assert.assertEquals("Should fire 1 BR.", 1, results.size());
	}
	
	@Test
	void testCanGenerateCommission() {
		Product product = new Product(ProductType.PhysicalProduct);
		IOrderProcessingService service = new OrderProcessingService();
		PaymentProcessing paymentProcessing = new PaymentProcessing(service);
		ArrayList<String> results = paymentProcessing.processPayment(product);
		Assert.assertEquals("Should generate a packing slip.", 2, results.size());
		Assert.assertEquals("Commission rule should be the 2nd. ", "Generate a commission payment", results.get(1));
	}

}
