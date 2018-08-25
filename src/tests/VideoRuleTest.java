package tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import kata.OrderProcessingService;
import kata.Product;
import kata.ProductType;
import kata.rules.VideoRule;

class VideoRuleTest {

	@Test
	void testProcessPayment() {
		VideoRule rule = new VideoRule();
		Product product = new Product(ProductType.Video);
		product.setTitle("Learning to Ski");
		String instuction = rule.processPayment(product, new OrderProcessingService());
		Assert.assertEquals("Could not add free video. ", "add a free First Aid video", instuction);
	}

}
