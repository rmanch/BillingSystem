package com.mckinsey.payment;

import junit.framework.Assert;

import com.mckinsey.payment.domain.discount.EmployeeDiscount;
import com.mckinsey.payment.domain.discount.BillingDiscount;
import com.mckinsey.payment.domain.discount.AffiliateDiscount;

import com.mckinsey.payment.domain.user.Employee;
import com.mckinsey.payment.domain.user.RegularCustomer;
import com.mckinsey.payment.domain.user.Affiliate;
import com.mckinsey.payment.domain.user.User;

import org.junit.BeforeClass;
import org.junit.Test;

import com.mckinsey.payment.domain.discount.Discount;

/**
 * The test class of BillingSystem.
 * 
 * Assumption: Mocking is not done to simplify the test cases. This is beneficial in actual live
 * system.
 *   
 * @author rmanch
 */
public class BillingSystemTest {
	private static BillingSystem billingSystem;
	private static User employee;
	private static User affiliate;
	private static User regularCustomer;

	@BeforeClass
	public static void beforeEachMethod() {
		Discount billingDiscount = new BillingDiscount();
		Discount employeeDiscount = new EmployeeDiscount(billingDiscount);
		Discount affiliateDiscount = new AffiliateDiscount(billingDiscount);

		employee = new Employee(employeeDiscount);
		affiliate = new Affiliate(affiliateDiscount);
		regularCustomer = new RegularCustomer(billingDiscount);

		billingSystem = BillingSystem.getBillingSystem(billingDiscount);
	}

	@Test
	public void employeeGroceryDiscount() {
		double result = billingSystem.getNetPayableAmount(1000, true, employee);
		Assert.assertEquals(950.0, result);
	}

	@Test
	public void employeeNonGroceryDiscount() {
		double result = billingSystem.getNetPayableAmount(1000, false, employee);
		Assert.assertEquals(665.0, result);
	}
	
	@Test
	public void affiliateNonGroceryDiscount() {
		double result = billingSystem.getNetPayableAmount(1000, false, affiliate);
		Assert.assertEquals(855.0, result);
	}

	@Test
	public void regularCustomerNonGroceryDiscount() {
		double result = billingSystem.getNetPayableAmount(1000, false, regularCustomer);
		Assert.assertEquals(950.0, result);
	}
}
