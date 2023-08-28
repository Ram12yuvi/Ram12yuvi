package taskdaily;

public class Square implements Drawable {
	private double length;
    
    
    public Square(double length) {
    	this.length=length;
    	
    }

	@Override
	public double getarea() {
		// TODO Auto-generated method stub
		return length*length;
	}

	@Override
	public double getvolume() {
		// TODO Auto-generated method stub
		return length*length*length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square s=new Square(10);
		System.out.println(s.getarea());
		System.out.println(s.getvolume());
	}

}