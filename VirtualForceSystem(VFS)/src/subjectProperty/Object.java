package subjectProperty;

public class Object {
	
		double xCood =0;
		double yCood =0;
		double zCood =0;
		double vX =0;
		double vY =0;
		double vZ =0;
		double mass =0;
		double charge;
		
		public Object(double a, double b, double c, double d){
			xCood =a;
			yCood =b;
			zCood =c;
			mass  =d;
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
		public double getVZ(){//return vZ.
			return vZ;
		}


}
