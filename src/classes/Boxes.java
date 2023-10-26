package classes;

public class Boxes {
	private int width;
	private int height;
	private int depth;
	//public parameterized ctor 
	public Boxes(int width,int height,int depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public String getBoxDetails() {
		return "Width : " +width+ " Height : "+height+" Depth: "+depth;
	}
	public int getBoxVolume() {
		return width*height*depth;
	}
	public void setBoxWidth(/*this*/) {
		this.width *=2;	//width = width * 2
	}
}
