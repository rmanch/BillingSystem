package com.mckinsey.payment.domain.user;

import com.mckinsey.payment.domain.discount.Discount;

/**
 * An employee of the retail website.
 * 
 * @author rmanch
 *
 */
public class Employee extends User {

	public Employee(Discount employeeDiscount) {
		super(employeeDiscount);
	}
}
