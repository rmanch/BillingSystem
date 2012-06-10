package com.mckinsey.payment.domain.discount;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class LoyalCustomerDiscountTest {

	private LoyalCustomerDiscount loyalCustomerDiscount;

	@Before
	public void beforeEachMethod() {
		BillingDiscount billingDiscount = new BillingDiscount();
		loyalCustomerDiscount = new LoyalCustomerDiscount(billingDiscount);
	}

	@Test
	public void employeeNetDiscount() {
		double actual = loyalCustomerDiscount.getDiscount();
		Assert.assertEquals(0.0975, actual, .0001);
	}
}
