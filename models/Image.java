/**
 * 
 */
package lab6.models;

import java.util.concurrent.TimeUnit; 
import lab6.services.*;
/**
 * @author Diana Anton
 *
 */
public class Image implements Element, Picture, Visitee {
    private String imageName;
    private Dimension dim;
    private ImageLoaderFactory factory = new ImageLoaderFactory();
    private ImageContent content;

    public Image(String imageName) {
        this.imageName = imageName;
        try {
        	TimeUnit.SECONDS.sleep( 5 );
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
        this.dim = new Dimension(1, 2);
    }
    
//    public void print(){
//    	if (content != null) {
//    		System.out.println("Image with name: " + imageName + "content: " + content);
//    	}
//    	else {
//    		System.out.println("Image with name: " + imageName);
//    	}        
//    }

	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		// nu e nevoie sa le implementam ca astea sunt frunze
	}

	@Override
	public Element get(int poz) {
		// TODO Auto-generated method stub
		// nu e nevoie sa le implementam ca astea sunt frunze
		return null;
	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		// nu e nevoie sa le implementam ca astea sunt frunze
	}

	@Override
	public boolean find(Element e) {
		// TODO Auto-generated method stub
		if (!(e instanceof Image)) {
			return false;
		}
		else {
			return ((Image) e).imageName.equals(this.imageName);
		}
	}

	@Override
	public String url() {
		// TODO Auto-generated method stub
		return imageName;
	}

	@Override
	public Dimension dim() {
		// TODO Auto-generated method stub
		return this.dim;
	}

	/**
	 * @return the content
	 */
	public ImageContent getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String type) {
		ImageLoader loader = factory.create(type);
		content = loader.load("dummy content");
	}

	@Override
	public void accept(Visitor vis) {
		// TODO Auto-generated method stub
		vis.visitImage(this);
	}

	/**
	 * @return the imageName
	 */
	public String getImageName() {
		return imageName;
	}

	/**
	 * @return the dim
	 */
	public Dimension getDim() {
		return dim;
	}

	/**
	 * @return the factory
	 */
	public ImageLoaderFactory getFactory() {
		return factory;
	}

	/**
	 * @param imageName the imageName to set
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	/**
	 * @param dim the dim to set
	 */
	public void setDim(Dimension dim) {
		this.dim = dim;
	}

	/**
	 * @param factory the factory to set
	 */
	public void setFactory(ImageLoaderFactory factory) {
		this.factory = factory;
	}
	
}
