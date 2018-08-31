package tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import kata.OrderProcessingService;
import kata.Product;
import kata.ProductType;
import kata.rules.EmailOwnerRule;

class EmailOwnerRuleTest {

	@Test
	void testEmailOwerOnNewMembership() {
		EmailOwnerRule rule = new EmailOwnerRule();
		Product product = new Product(ProductType.NewMembership);
		String instuction = rule.processPayment(product, new OrderProcessingService());
		Assert.assertEquals("Could not email owner. ", "Email owner", instuction);
	}
	
	@Test
	void testEmailOwerOnUpdatedMembership() {
		EmailOwnerRule rule = new EmailOwnerRule();
		Product product = new Product(ProductType.UpdateMembership);
		String instuction = rule.processPayment(product, new OrderProcessingService());
		Assert.assertEquals("Could not email owner. ", "Email owner", instuction);
	}

}
