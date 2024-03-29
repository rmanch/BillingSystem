package com.mckinsey.payment.domain.discount;

/**
 * The class represents a decorator pattern. The class is not required to meet current requirements
 * but kept to keep extensibility in mind. It may be possible that in future user can take more than
 * one discount. The decorator pattern will take care of it. If this will never be the requirement, 
 * the following class can be dropped. 
 * 
 * @author rmanch
 *
 */
public abstract class DiscountDecorator extends Discount {
	protected Discount discount;
	
	public DiscountDecorator(Discount discount) {
		this.discount = discount;
	}
}
