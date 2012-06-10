import com.mckinsey.payment.BillingSystem;
import com.mckinsey.payment.domain.discount.EmployeeDiscount;
import com.mckinsey.payment.domain.discount.BillingDiscount;
import com.mckinsey.payment.domain.user.Employee;

/**
 * This is the client which tests the billing system. 
 * 
 * @author rmanch
 *
 */
public class Main {

	/**
	 * Main method which injects the dependencies to BillingSystem class
	 * and then calls the getNetPayableAmount method to calculate the net payable
	 * amount.
	 * 
	 * @param args Command line arguments - not used.
	 */
	public static void main(String args[]) {
		BillingDiscount billingDiscount = new BillingDiscount();
		EmployeeDiscount empDiscount = new EmployeeDiscount(billingDiscount);
		BillingSystem billingSystem = BillingSystem.getBillingSystem(billingDiscount);
		Employee emp = new Employee(empDiscount);
		
		double netAmount = billingSystem.getNetPayableAmount(2000, false, emp);
		System.out.println("Net Payable Amount After Discount: " + netAmount);
	}
}
