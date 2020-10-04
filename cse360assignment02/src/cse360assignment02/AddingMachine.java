package cse360assignment02;
/**
 * The AddingMachine program performs addition and subtraction.
 * It displays the example from assignment.
 * 
 *@author  Natalie Rodriguez
 *@version 2.0
 *@since   2020-10-03
 */

public class AddingMachine {

  private int total;
  private String history;

  public static void main(String[] args) {
	  /**
	   * Main performs example from the assignment.
	   */
	  AddingMachine myCalculator = new AddingMachine();
	 
	  myCalculator.add (4);
	  myCalculator.subtract (2);
	  myCalculator.add(5);
	  
	  System.out.print(myCalculator.toString());
  
  }
  /**
   * Total and history are set to zero.
   */
  public AddingMachine () {
	  total = 0; 
	  history = "0";
  }
  
  /**
   * Returns the current total.
   */
  public int getTotal () {
	  return total;
  }
  
  /**
   * Adds parameter to total.
   * Applies change to history.
   */
  public void add (int value) {
	  total += value;
	  history += " + " + value;
  }
  
  /**
   * Subtracts parameter to total.
   * Applies change to history.
   */
  public void subtract (int value) {
	  total -= value;
	  history += " - " + value;
  }
  
  /**
   * Returns to string.
   */
  public String toString () {
	  return history.toString();
  }
  
  /**
   * Clears memory.
   */
  public void clear() {
	  total = 0;
	  history = "0";
  }
  
}