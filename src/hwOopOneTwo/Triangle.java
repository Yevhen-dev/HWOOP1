package hwOopOneTwo;

public class Triangle {
	
	private double a;
	private double b;
	private double c;
	
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Triangle() {
		super();
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public double getAreas() {
		double p = ( this.a + this.b + this.c ) / 2;
		return  Math.sqrt( p * ( p - a ) * ( p - b ) * ( p - c) ) ;
	}
	
	public String toString() {
		return "Triangle : [ side a = " + a + ", side b = " + b + ", side c = " + c + " ] ";
	}
	
	
	

}
