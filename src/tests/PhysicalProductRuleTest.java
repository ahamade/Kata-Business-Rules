package tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import kata.OrderProcessingService;
import kata.Product;
import kata.ProductType;
import kata.rules.PhysicalProductRule;

class PhysicalProductRuleTest {

	@Test
	void testPhysicalProductProcessing() {
		PhysicalProductRule physicalProductRule = new PhysicalProductRule();
		Product product = new Product(ProductType.PhysicalProduct);
		String instuction = physicalProductRule.processPayment(product, new OrderProcessingService());
		Assert.assertEquals("No Packaging slip. ", "Generate a packing slip for shipping", instuction);
	}

}
