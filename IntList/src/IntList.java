
/**
* The class IntList can be initialized and saves a list of integers
* @invar | intlist != null
* @invar | intlist.length >= 0
*/

public class IntList {

	private int[] intlist;
	
	/**
	 * @param ingevoerd != null
	 * @post intlist == ingevoerd
	 */
	public IntList(int[] ingevoerd) {
		this.intlist = ingevoerd;
	} // dit is zo een contructor!! moet dus zelfde naam hebben als de class
	
	public int[] getIntList() {
		return intlist;
	}
	
	public void addvalue(int value) {
		int[] newlist = new int[this.intlist.length + 1];
		for (int i = 0; i < this.intlist.length; i++)
		    newlist[i] = this.intlist[i];
		newlist[this.intlist.length] = value;
		this.intlist = newlist;
	}
	
	public void removevalue() {
		int[] newlist = new int[this.intlist.length - 1];
		for (int i = 0; i < this.intlist.length - 1; i++)
		    newlist[i] = this.intlist[i];
		this.intlist = newlist;
	}
}
// effe voor te committen!!