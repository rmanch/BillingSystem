package com.mckinsey.payment.domain.discount;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class of EmployeeDiscount
 * 
 * @author rmanch
 *
 */
public class EmployeeDiscountTest {

	private EmployeeDiscount employeeDiscount;

	@Before
	public void beforeEachMethod() {
		BillingDiscount billingDiscount = new BillingDiscount();
		employeeDiscount = new EmployeeDiscount(billingDiscount);
	}

	@Test
	public void employeeNetDiscount() {
		double actual = employeeDiscount.getDiscount();
		Assert.assertEquals(0.335, actual, .0001);
	}
}
