package lab6.models;

public class ImageContent {
	private String type;

	/**
	 * @param type - Type of the image
	 */
	public ImageContent(String type) {
		super();
		this.type = type;
	}

	/**
	 * @return the type - Type of the image
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set - Type of the image
	 */
	public void setType(String type) {
		this.type = type;
	}
}
