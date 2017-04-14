package subjectProperty;

public class Force{
	public static final double G = 6.67e-16; //Gravitational Constant.
	public static final double GS =6.67408e-16; //Gravitational Constant specific to Five Digits after Decimal Points.
	//public final double K;
	public void printG(){//print G.
		System.out.println(G);
	}
	public static double getG(){//get G
		return G;
	}
	
	public void printGS(){//print GS.
		System.out.println(GS);
	}
	public static double getGS(){//get GS.
		return GS;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static double GA(subjectProperty.Object p1, subjectProperty.Object p2){//get the Gravitational Force.
		double q = getG() * p2.mass / Math.pow(distanse(p1,p2), 2);
		return q;
	}
	
	public static double Gx(subjectProperty.Object p1, subjectProperty.Object p2){//get the Gravitational Force in x axis
		double q = GA(p1,p2);
		double dX = p1.xCood-p2.xCood;
		double p = distanse(p1,p2);
		double x  = q*dX/p;
		return x;
	}
	
	public static double Gy(subjectProperty.Object p1, subjectProperty.Object p2){//get the Gravitational Force in y axis
		double q = GA(p1,p2);
		double dY = p1.yCood-p2.yCood;
		double p = distanse(p1,p2);
		double y  = q*dY/p;
		return y;
	}
	public static double Gz(subjectProperty.Object p1, subjectProperty.Object p2){//get the Gravitational Force in z axis
		double q = GA(p1,p2);
		double dZ = p1.zCood-p2.zCood;
		double p = distanse(p1,p2);
		double z  = q*dZ/p;
		return z;
	}
	public static double distanse(subjectProperty.Object p1, subjectProperty.Object p2){//get the distance between p1 and p2
		double dX = p1.xCood-p2.xCood;
		double dY = p1.yCood-p2.yCood;
		double dZ = p1.zCood-p2.zCood;
		double q = Math.sqrt(Math.pow(dX,2)+Math.pow(dY, 2)+Math.pow(dZ, 2) );
		return q;
	}
	
	
	
	
	public static void InterGv(subjectProperty.Object p1, subjectProperty.Object p2, double time){//in a unit time, the change of v by gravity
		double dVX = Gx(p1,p2)*time;
		double dVY = Gy(p1,p2)*time;
		double dVZ = Gz(p1,p2)*time;
		p1.vX = p1.vX+dVX;
		p1.vY = p1.vY+dVY;
		p1.vZ = p1.vZ+dVZ;
		p1.xCood=p1.xCood+p1.vX*time;
		p1.yCood=p1.yCood+p1.vY*time;
		p1.zCood=p1.zCood+p1.vZ*time;
	}
	
	public static void InterCood(subjectProperty.Object p1, subjectProperty.Object p2, double time){//in a unit time, the change of Cood by gravity
		p1.xCood=p1.xCood+p1.vX*time;
		p1.yCood=p1.yCood+p1.vY*time;
		p1.zCood=p1.zCood+p1.vZ*time;
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args){
		
	}
	
	
}
