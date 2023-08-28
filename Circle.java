package taskdaily;

interface Drawable
{
   double getarea();
   double getvolume();
}

public class Circle implements Drawable {

	private double r;
    private double pi;
 public Circle(double r, double pi) {
	 this.r=r;
	 this.pi=pi;
}

	@Override
	public double getarea() {
		// TODO Auto-generated method stub
		return pi*r*r;
	
	}

	@Override
	public double getvolume() {
		// TODO Auto-generated method stub
		return 1.3 * pi * r * r * r;
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
 
	Circle c = new Circle(5, 3.14);
    System.out.println(c.getarea());
    System.out.println(c.getvolume());
}}
