package lab6.models;

/**
 * @author Diana Anton
 *
 */
public class Author {
	private String name;

	/**
	 * @param name
	 */
	public Author(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + "]";
	}
	
	public void print() {
		System.out.println("Author: " + name);
	}
	
}
