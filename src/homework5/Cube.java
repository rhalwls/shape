package homework5;

public class Cube extends Square{
	
	
public Cube(String name, double d) {
	super(name,d);
}
public String getClassName() {
	return "Cube";
}
public double getArea() {
	return 6*super.getArea();
}
public double getVolume() {
	return super.getArea()*super.getDimension1();
}
public String toString() {
	return String.format("%s is a [%s], and is a [%s]",
			this.getName(),this.getClassName(),super.getClassName());
}
}
