package tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import kata.OrderProcessingService;
import kata.Product;
import kata.ProductType;
import kata.rules.CommissionPaymentRule;

class CommissionPaymentRuleTest {

	@Test
	void testGenerateCommissionForPhysicalProduct() {
		CommissionPaymentRule rule = new CommissionPaymentRule();
		Product product = new Product(ProductType.PhysicalProduct);
		String instuction = rule.processPayment(product, new OrderProcessingService());
		Assert.assertEquals("Could not generate a commission. ", "Generate a commission payment", instuction);
	}
	
	@Test
	void testGenerateCommissionForBook() {
		CommissionPaymentRule rule = new CommissionPaymentRule();
		Product product = new Product(ProductType.Book);
		String instuction = rule.processPayment(product, new OrderProcessingService());
		Assert.assertEquals("Could not generate a commission. ", "Generate a commission payment", instuction);
	}

}
