package homework5;

public class ShapeTester {
public static void main(String[] args) {
	Cube mycube=new Cube("mycube",0.4);
	Sphere mysphere = new Sphere("mysphere",0.3);
	Cone mycone=new Cone("mycone",0.7,1.2);
	
	System.out.printf(mycube.toString()
			+"\nside = %.3f \n surface area = %.3f\nvolume = %.3f\n",mycube.getDimension1(),mycube.getArea(),mycube.getVolume());
	System.out.printf(mysphere.toString()+
			"\nradius = %.3f\nsurface area = %.3f\nvolume = %.3f\n",mysphere.getDimension1(),mysphere.getArea(),mysphere.getVolume());
	System.out.printf(mycone.toString()
			+"\nheight = %.3f\nradius = %.3f\nsurface area = %.3f\nvolume = %.3f\n"
			,mycone.getHeight(),mycone.getRadius(),mycone.getArea(),mycone.getVolume());
}
}
