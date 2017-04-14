package dynamics;
import java.util.Scanner;

import subjectProperty.Force;
public class Clock {
	private static Scanner a;

	public static void main(String[] args)
	{
		a = new Scanner(System.in);
		System.out.println("Please type in the time");
		double time1 = a.nextDouble();
		System.out.println("please type in the number of smallest time you want");
		double time2 = a.nextDouble();
		double time3 = 1/time2;
		int period = (int) (time1*time2);
		System.out.println(period);
		subjectProperty.Object p1 = new subjectProperty.Object(9232, 12, -142, 1.23e29);
		subjectProperty.Object p2 = new subjectProperty.Object(-31, 12, -142, 1.23e23);
		
		
		int b = 0;
		while(b <= period)
		{
			b++;
			Force.InterGv(p1,p2,time3);
			Force.InterGv(p2,p1,time3);
			
			Force.InterCood(p1, p2, time3);
			
			Force.InterCood(p2, p1, time3);
			
		}
		
		System.out.println("Object 1");
		System.out.println("XCood: "+p1.getXCood());
		System.out.println("YCood: "+p1.getYCood());
		System.out.println("ZCood: "+p1.getZCood());
		System.out.println();
		System.out.println("Object 2");
		System.out.println("XCood: "+p2.getXCood());
		System.out.println("YCood: "+p2.getYCood());
		System.out.println("ZCood: "+p2.getZCood());
	
	}
	
	
	
	
	
}
