package taskdaily;

class person {
	private String Name;
	private int Regno;
	private String Address;
	protected int Salary;
}

   class Student extends person{
	   private String Name;
	   private int Regno;
	   private String Address;
	   
	 public String getName() {
		return Name;
	 }
	   public void setName(String Name) {
		   this.Name=Name;
	   }
     
	   public int getRegno() {
		   return Regno;
	   }
	   public void setRegno(int Regno) {
		   this.Regno=Regno;
	   }
	   public String getAddress() {
			return Address;
		 }
		   public void setaddress(String Address) {
			   this.Address=Address;
		   }
	   void display()
	   {
		   System.out.println(Name);
		   System.out.println(Regno);
		   System.out.println(Address);
	   }
	   }
	   
   class Teacher extends person{
	   private String Name;
	   private int Regno;
	   private String Address;
	   
	 public String getName() {
		return Name;
	 }
	   public void setName(String Name) {
		   this.Name=Name;
	   }
     
	   public int getRegno() {
		   return Regno;
	   }
	   public void setRegno(int Regno) {
		   this.Regno=Regno;
	   }
	   public String getAddress() {
			return Address;
		 }
		   public void setaddress(String Address) {
			   this.Address=Address;
		   }
	   
	   
	   public int getSalary()
	   {
		   return Salary;
	   }
      public void setSalery(int Salary)
      {
    	  this.Salary=Salary;
      }

    void display1()
    {
    	System.out.println(Name);
    	System.out.println(Regno);
    	System.out.println(Address);
    	System.out.println(Salary);
    }

public static class StuTeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student s=new Student();
		s.setName("Name of the school");
		s.setRegno(5);
		s.setaddress("Address of te school");
		s.display();
		Teacher t=new Teacher();
		t.setName("Name of the school");
		t.setRegno(5);
		t.setaddress("Address of te school");
		t.setSalery(22000);
		t.display1();
		
	}

}}
