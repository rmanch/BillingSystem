package com.mckinsey.payment.domain.discount;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class of AffiliateDiscount
 * 
 * @author rmanch
 *
 */
public class AffiliateDiscountTest {

	private AffiliateDiscount affiliateDiscount;

	@Before
	public void beforeEachMethod() {
		BillingDiscount billingDiscount = new BillingDiscount();
		affiliateDiscount = new AffiliateDiscount(billingDiscount);
	}

	@Test
	public void employeeNetDiscount() {
		double actual = affiliateDiscount.getDiscount();
		Assert.assertEquals(0.145, actual, .0001);
	}
}
