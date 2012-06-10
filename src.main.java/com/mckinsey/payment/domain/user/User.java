package com.mckinsey.payment.domain.user;

import com.mckinsey.payment.domain.discount.Discount;

/**
 * User of the retail website. 
 * 
 * @author rmanch
 *
 */
public abstract class User {

	/** Applicable discount to the user - populated by child classes */
	private Discount discount;

	public User(Discount discount) {
		this.discount = discount;
	}

	public Discount getDiscount() {
		return discount;
	}
}
