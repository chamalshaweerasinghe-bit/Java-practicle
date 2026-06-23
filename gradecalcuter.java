public class gradecalcuter{
	public static void  main (string []args){
		scaner input = new scaner (system.in);
		
		system.out.print("enter mark for q1:");
		int m1 = input.nextint();
		
		system.out.print("enter mark for q2:");
		int m2 = input.nextint();
		
		system.out.print("enter mark for q3:");
		int m3 = input.nextint();
		
		system.out.print("enter mark for q4:");
		int m4 = input.nextint();
		
		int total = m1+m2+m3+m4;
		double average = total/4.0;
		
		system.out.println("total = " + total);
		system.out.println("average = " + average);
		
		if (average >= 80)
			system.out.println("Grade : A");
		
		else if (average >= 65)
			system.out.println("Grade : B");
		
		else if (average >= 80)
			system.out.println("Grade : C");
		
		else (average >= 80){
			system.out.println("Grade : F");
		
		input.close();
		
	  }
	}