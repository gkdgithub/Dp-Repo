/**
 * 
 */
package dp.abstractfactory;

/**
 * @author DhanunjayaY
 *
 */
public class HDFC implements Bank {

	/* (non-Javadoc)
	 * @see dp.abstractfactory.Bank#getBankName()
	 */
	@Override
	public void getBankName() {
		System.out.println("I am from HDFC");

	}

}
