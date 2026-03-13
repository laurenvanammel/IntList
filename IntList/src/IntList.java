
/**
* The class IntList can be initialized and saves a list of integers
* @invar | intlist != null
* @invar | intlist.length >= 0
*/

import java.util.stream.IntStream;
class Node {
	int value;
	Node next;
}

public class IntList {

	private int[] intlist;
	/**
	 * 
	 * @representationObject
	 */
	Node first;
	// nog een cosntructor toevoegen!
	/**
	 * 
	 */
	public int getLength() {
		int result = 0;
		
	}
	/**
	 * @post | result != null
	 */
	public int[] getElements() {
		int[] result = new int(getLength());
		Node current = first;
		int pos = 0
		while( current != null) {
			result[pos] = current.value;
			pos+=1;
			current = current.next;
		}
		return result
	}
	/**
	 * @pre | elements != null
	 * @post | Array.equals(elements, getElements())
	 */
	public IntList(int[] elements) {
		Node first = null;
		
		for( int elements.length - 1 : i >=0; -i) {
			current = new Node 
		}
	}
	/**
	 * @param  ingevoerd != null
	 * @post  intlist == ingevoerd
	 */
	public IntList(int[] ingevoerd) {
		this.intlist = ingevoerd;
	} // dit is zo een contructor!! moet dus zelfde naam hebben als de class
	
	/**
	 * @post | result != 0
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
	 * @pre | getIntList.length() > 0
	 */
	public void removevalue() {
		int[] newlist = new int[this.intlist.length - 1];
		for (int i = 0; i < this.intlist.length - 1; i++)
		    newlist[i] = this.intlist[i];
		this.intlist = newlist;
	}
}
// effe voor te committen!!