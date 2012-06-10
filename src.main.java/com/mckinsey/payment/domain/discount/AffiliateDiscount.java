package com.mckinsey.payment.domain.discount;

/**
 * The discount applicable to affiliates. This is an independent class having no
 * relation to Affiliate object. The name of the class is chosen as
 * AffiliateDiscount to give this discount some meaningful name.
 * 
 * @author rmanch
 * 
 */
public class AffiliateDiscount extends DiscountDecorator {
	private static final double DISCOUNT = 0.10;

	public AffiliateDiscount(Discount discount) {
		super(discount);
	}

	/**
	 * This method calculates the net discount from two discounts - affiliate
	 * discount and billing discount. It uses the following formula to calculate
	 * the net discount: discount1 + discount2 - discount1*discount2
	 * 
	 * return the net applicable discount
	 */
	public double getDiscount() {
		double parentDiscount = super.discount.getDiscount();
		return DISCOUNT + parentDiscount - parentDiscount * DISCOUNT;
	}
}
