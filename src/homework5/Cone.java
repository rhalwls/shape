package homework5;
import java.lang.Math;
public class Cone extends Circle{
	private double height;
	
	public Cone(String name,double r, double h){
	super(name,r);
	setHeight(h);
	}
	public String getClassName() {
		return "Cone";
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	public double getArea() {
		return super.getArea()+Math.sqrt
				(Math.pow(this.getRadius(), 2)+Math.pow(this.getHeight(),2))*Math.PI*this.getRadius();
	}
	public double getVolume() {
		return (1.0/3.0)*height*super.getArea();
	}
	public String toString() {
		return String.format("%s is a [%s], and is a [%s]",
				this.getName(),this.getClassName(),super.getClassName());
	}
}
