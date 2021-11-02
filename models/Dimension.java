/**
 * 
 */
package lab6.models;

/**
 * @author Diana Anton
 *
 */
public class Dimension {
	private int lungime;
	private int latime;
	/**
	 * @return the lungime
	 */
	public int getLungime() {
		return lungime;
	}
	/**
	 * @return the latime
	 */
	public int getLatime() {
		return latime;
	}
	/**
	 * @param lungime the lungime to set
	 */
	public void setLungime(int lungime) {
		this.lungime = lungime;
	}
	/**
	 * @param latime the latime to set
	 */
	public void setLatime(int latime) {
		this.latime = latime;
	}
	/**
	 * @param lungime
	 * @param latime
	 */
	public Dimension(int lungime, int latime) {
		super();
		this.lungime = lungime;
		this.latime = latime;
	}
}
