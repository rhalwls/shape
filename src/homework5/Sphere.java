package homework5;

import java.lang.Math;

public class Sphere extends Circle {
	public Sphere(String name, double r) {
		super(name, r);
	}
	
	public void setRadius(double r) {
		super.setRadius(r);
	}
	public double getRadius() {
		return super.getRadius();
	}
	
	
	public String getClassName() {
		return "Sphere";
	}
	public double getArea() {
		return 4 * Math.PI * this.getDimension1() * this.getDimension1();
	}

	public double getVolume() {
		return (4.0 / 3) * Math.PI * Math.pow(this.getDimension1(), 3);
	}

	public String toString() {
		return String.format("%s is a [%s], and is a [%s]", super.getName(), getClassName(), super.getClassName());
	}
}
