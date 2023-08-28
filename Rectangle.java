package taskdaily;

public class Rectangle implements Drawable {

	private double length;
    private double width;
    private double height;
    
    public Rectangle(double length, double width, double height) {
    	this.length=length;
    	this.width=width;
    	this.height=height;
    }

	@Override
	public double getarea() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public double getvolume() {
		// TODO Auto-generated method stub
		return length*width*height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r=new Rectangle(20, 5, 8);
		System.out.println(r.getarea());
		System.out.println(r.getvolume());
		
	
	}

}
