package com.mckinsey.payment.domain.discount;

/**
 * The discount applicable on total billing amount.
 * 
 * @author rmanch
 *
 */
public class BillingDiscount extends Discount {
	private static final double DISCOUNT = 0.05;

	public double getDiscount() {
		return DISCOUNT;
	}
}
