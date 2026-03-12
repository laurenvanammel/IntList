
/**
* The class IntList can be initialized and saves a list of integers
* @invar | intlist != null
* @invar | intlist.length >= 0
*/

import java.util.stream.IntStream;
public class IntList {

	private int[] intlist;
	
	/**
	 * @param  ingevoerd != null
	 * @post  intlist == ingevoerd
	 */
	public IntList(int[] ingevoerd) {
		this.intlist = ingevoerd;
	} // dit is zo een contructor!! moet dus zelfde naam hebben als de class
	
	/**
	 * 
	 * @creates | result
	 */
	public int[] getIntList() {
		return intlist;
	}
	/**
	 * @mutates | this
	 * @post | getIntList().length == old(getIntList().length) + 1
	 * @post | IntStream.range(0, old(getIntList().length)).allMatch(i ->
	 *       |     getIntList()[i] == old(getIntList())[i])
	 * @post | getIntList()[getIntList().length - 1] == value
	 * @param value != null
	 */
	public void addvalue(int value) {
		int[] newlist = new int[this.intlist.length + 1];
		for (int i = 0; i < this.intlist.length; i++)
		    newlist[i] = this.intlist[i];
		newlist[this.intlist.length] = value;
		this.intlist = newlist;
	}
	/**
	 * @mutates | this
	 * @post | getIntList().length == old(getIntList().length) - 1
	 * @post | IntStream.range(0,old(getIntList().length - 1)).allMatch(i ->
	 * 		 | getIntList()[i] == old(getIntList())[i])
	 * @throws IllegalStateException | getIntList().length == 0
	 */
	public void removevalue() {
		int[] newlist = new int[this.intlist.length - 1];
		for (int i = 0; i < this.intlist.length - 1; i++)
		    newlist[i] = this.intlist[i];
		this.intlist = newlist;
	}
}
// effe voor te committen!!