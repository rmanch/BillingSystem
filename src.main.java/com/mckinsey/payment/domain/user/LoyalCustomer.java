package com.mckinsey.payment.domain.user;

import com.mckinsey.payment.domain.discount.Discount;

/**
 * A Customer who is with the company for more than 2 years.
 * 
 * @author rmanch
 *
 */
public class LoyalCustomer extends User {

	public LoyalCustomer(Discount loyalCustomerDiscount) {
		super(loyalCustomerDiscount);
	}
}
