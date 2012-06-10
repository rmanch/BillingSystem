package com.mckinsey.payment;

import com.mckinsey.payment.domain.discount.Discount;
import com.mckinsey.payment.domain.user.User;

/** 
 * This is a singleton class which calculates the net payable amount
 * depending upon the total billing amount, grocery flag and the type
 * of user.
 * 
 * Assumption: Assumed that the goods purchased are either all groceries or not. 
 * A boolean flag(isGrocery) is passed to check if the percentage based account
 * is applicable or not.
 * 
 * @author rmanch
 *
 */
public class BillingSystem {
	
	/**
	 * This instance variable stores the billingDiscount - The discount that is applicable 
	 * if the user based discounts are not applicable(for groceries)
	 * 
	 */
	private Discount billingDiscount;
	
	/** Singleton instance */
	private static BillingSystem billingSystem;

	private BillingSystem(Discount billingDiscount) {
		this.billingDiscount = billingDiscount;
	}

	/** 
	 * Method to get the instance of the class. 
	 * @param billingDiscount	the discount on total billing amount
	 * @return Instance of this class
	 */
	public static synchronized BillingSystem getBillingSystem(
			Discount billingDiscount) {
		if (billingSystem == null) {
			billingSystem = new BillingSystem(billingDiscount);
		}
		return billingSystem;
	}

	/**
	 * This method calculates the net payable amount depending upon the 
	 * parameters passed. 
	 * 
	 * @param amount	Total billing amount
	 * @param isGrocery	Whether the goods purchased are grocery items or not
	 * @param user		Type of user - Employee, Affiliate or LoyalCustomer 
	 * 
	 * @return	Net payable amount after discount
	 */
	public double getNetPayableAmount(double amount, boolean isGrocery,
			User user) {
		Discount applicableDiscount;

		if (!isGrocery) {
			applicableDiscount = user.getDiscount();
		} else {
			applicableDiscount = billingDiscount;
		}

		return amount * (1 - applicableDiscount.getDiscount());
	}
}
