package com.mckinsey.payment.domain.discount;

/**
 * An abstract class representing the discount entity. The class represents
 * a uniform view of various types of discounts - billing discount, employee discount,
 * affiliate discount etc.
 *  
 * @author rmanch
 *
 */
public abstract class Discount {
	public abstract double getDiscount();
}
