package lectureEx;

public class BulbProject {
	 int watt;
	float price;
	String	color;
	boolean state;
	 static String cname;
	static int counter;

	static 
	{
		counter=0;
		cname="Surya";
	}
	
	{
		counter++;
	}
	
	
	BulbProject()
	{
		watt=10;
		price=40.5f;  
		color="orange";
		state=true;
		
	}
	BulbProject(int watt,float price,String color,boolean state)
	{
		this.watt=watt;
		this.price=price;  
		this.color=color;
		this.state=state;
		
	}

	 
	 void showDetail()
	{
		 System.out.println("watt of bulb="+watt);
		 System.out.println( "price of bulb ="+price);
		 System.out.println("Color of bulb="+color);
		System.out.println("state of the bulb="+state);
		System.out.println("Company of the bulb="+cname);
		// System.out.println(counter);
} 
	 
	 void changestate()
	 {
		 if (state==true)
		 {
			 state=false;
		 }
		 else {
			 state=true;
		 }
	 }
	 
	 static void countBulb()
	 {
		 System.out.println();
		 System.out.println("total no of bulb ="+counter);

	 }
	  void changeCompanyName(String cname)
	 {
		this.cname= cname;    
	 }
	public static void main(String[] args) { 
	  BulbProject.countBulb();
		 System.out.println("Creation same type ofbulb");
	
	  BulbProject b1=new BulbProject();
	  BulbProject b2=new BulbProject();
	  BulbProject b3=new BulbProject();
		 System.out.println("********Creation of first bulb**********");
		 b1.showDetail();
		 
		 System.out.println("*********Creation of 2nd bulb********");
		 b2.showDetail();
		 
		 System.out.println("******Creation of 3rd bulb*********");
		 b3.showDetail(); 
		 BulbProject.countBulb();
	
		System.out.println("*****************Creation different  type ofbulb*************");
		BulbProject b4=new BulbProject(20,56.2f,"red",true);
		BulbProject b5=new BulbProject(100,45.2f,"yellow",false);
		BulbProject b6=new BulbProject(40,80.2f,"white",true);
		System.out.println("********Creation of 4th bulb**********");
		b4.showDetail();
		
		System.out.println("*********Creation of 5th bulb********");
		b5.showDetail();
		
		System.out.println("******Creation of 6th bulb*********");
		b6.showDetail(); 
	
		System.out.println("STATE CHANGE");
		b5.changestate();
		b5.showDetail();

			b6.changestate();
			b6.showDetail();
			b6.changeCompanyName("philipse");
			b6.showDetail();
	// System.out.println();


	}

}
