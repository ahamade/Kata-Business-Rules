package tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import kata.OrderProcessingService;
import kata.Product;
import kata.ProductType;
import kata.rules.BookRule;

class BookRuleTest {

	@Test
	void testProcessPayment() {
		BookRule bookRule = new BookRule();
		Product product = new Product(ProductType.Book);
		String instuction = bookRule.processPayment(product, new OrderProcessingService());
		Assert.assertEquals("No duplicate packing slip. ", "Create a duplicate packing slip for the royalty department", instuction);
	}

}
