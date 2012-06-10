package com.mckinsey.payment.domain.user;

import com.mckinsey.payment.domain.discount.Discount;

/**
 * Any regular customer who does not fall in any other category. 
 * 
 * Assumption: Billing Discount is applicable for all the customers.
 * 
 * @author rmanch
 *
 */
public class RegularCustomer extends User {

	public RegularCustomer(Discount billingDiscount) {
		super(billingDiscount);
	}
}
