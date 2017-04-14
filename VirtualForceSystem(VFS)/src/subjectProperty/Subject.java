package subjectProperty;

public class Subject{
	static double xCood =0;
	static double yCood =0;
	static double zCood =0;
	static double vX =0;
	static double vY =0;
	static double vZ =0;
	static double mass =0;
	static double charge;
	
	public Subject(double a, double b, double c){
		xCood =a;
		yCood =b;
		zCood =c;
		
	}
	
	
	public void printx(){//Print out X Coordinate.
		System.out.println("x Coodinate = " + xCood + "m");
	}
	public void printy(){//Print out Y Coordinate.
		System.out.println("y Coodinate = " + yCood + "m");
	}
	public void printz(){//Print out Z Coordinate.
		System.out.println("z Coodinate = " + zCood + "m");
	}
	
	
	public double getXCood(){//return X Coordinate.
		return xCood;
	}
	public double getYCood(){//return Y Coordinate.
		return yCood;
	}
	public double getZCood(){//return Z Coordinate.
		return zCood;
	}

	
	public void printMass(){//Print out mass.
		System.out.println("Mass : " + mass + "kg");
	}
	public double getMass(){//return Mass.
		return mass;
		
	}
	
	public void printVX(){//Print out VX.
		System.out.println("vX : " + vX + "m/s");
	}
	public void printVY(){//Print out VY.
		System.out.println("vY : " + vY + "m/s");
	}
	public void printVZ(){//Print out VZ.
		System.out.println("vZ : " + vZ + "m/s");
	}
	
	public double getVX(){//return vX.
		return vX;
	}
	public double getVY(){//return vY.
		return vY;
	}
}
	

