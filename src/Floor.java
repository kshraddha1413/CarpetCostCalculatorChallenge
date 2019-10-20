
public class Floor {
	double width;
	double length;
	public Floor(double width, double length) {
		
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width<0) {
		this.width = 0.0;
		}
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if(length<0) {
		this.length = 0.0;
		}
	}
	public double getArea() {
		double area=length*width;
		return area;
	}
	
	

}
