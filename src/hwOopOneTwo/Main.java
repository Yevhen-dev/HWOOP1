package hwOopOneTwo;

public class Main {

	public static void main(String[] args) {
		
		Product pasta = new Product( "Makfa", "Pasta made from solid rye", 2.5, 1 );
		System.out.println(pasta);
		
		Product oreo = new Product ( "Oreo", "Chocolate cookies with milk", 4, 0.25  );
		System.out.println(oreo);
		
		Product cola = new Product ();
		cola.setName("Coca-cola");
		cola.setDiscription("Tasty fizzy drink");
		cola.setPrice(1);
		cola.setWeight(0.5);
		System.out.println(cola);
		
		Triangle abc = new Triangle(3, 5, 6);
		System.out.println(abc);
		System.out.println( "Areas of ABC = " + abc.getAreas() );
		
		Triangle xyz = new Triangle();
		xyz.setA(6);
		xyz.setB(7);
		xyz.setC(10);
		System.out.println(xyz);
		System.out.println( "Areas of XYZ = " + xyz.getAreas() );
		
	}

}
