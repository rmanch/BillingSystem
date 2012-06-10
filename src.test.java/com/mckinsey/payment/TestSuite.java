package com.mckinsey.payment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import com.mckinsey.payment.domain.discount.AffiliateDiscountTest;
import com.mckinsey.payment.domain.discount.LoyalCustomerDiscountTest;
import com.mckinsey.payment.domain.discount.EmployeeDiscountTest;

@RunWith(Suite.class)
@SuiteClasses({ BillingSystemTest.class, AffiliateDiscountTest.class,
		LoyalCustomerDiscountTest.class, EmployeeDiscountTest.class })
public class TestSuite {

}
