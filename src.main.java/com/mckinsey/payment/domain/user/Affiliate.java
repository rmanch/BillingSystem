package com.mckinsey.payment.domain.user;

import com.mckinsey.payment.domain.discount.Discount;

/**
 * An affiliate of the company.
 * 
 * @author rmanch
 * 
 */
public class Affiliate extends User {

	public Affiliate(Discount affiliateDiscount) {
		super(affiliateDiscount);
	}
}
