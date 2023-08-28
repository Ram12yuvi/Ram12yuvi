package taskdaily;

abstract class Shape {
    abstract double calculateArea();

     public class AbstCircle extends Shape {

    	 private double radius;
	private double pi;
    	 public AbstCircle(double radius) {
    	        this.radius = radius;
    	 }

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	
	}
	public void main(String[] args) {
		// TODO Auto-generated method stub

		
	}


}
} 
