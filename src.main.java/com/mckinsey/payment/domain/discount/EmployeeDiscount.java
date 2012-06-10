package com.mckinsey.payment.domain.discount;

/**
 * The discount applicable to employees. This is an independent class having no
 * relation to Employee object. The name of the class is chosen as
 * EmployeeDiscount to give this discount some meaningful name.
 * 
 * @author rmanch
 * 
 */
public class EmployeeDiscount extends DiscountDecorator {

	private static final double DISCOUNT = 0.30;

	public EmployeeDiscount(Discount discount) {
		super(discount);
	}

	/**
	 * This method calculates the net discount from two discounts - employee
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
