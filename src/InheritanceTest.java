
class Point{
	int x;
	int y;
}
class Circle{
	Point p=new Point();
	int z;
}
public class InheritanceTest {

	public static void main(String[] args) {
		Circle c=new Circle();
//		c.x=1;
//		c.y=2;
//		c.z=3;
		c.p.x=1;
		c.p.y=2;
		c.z=3;
		System.out.println("c.p.x="+c.p.x);
		System.out.println("c.p.y="+c.p.y);
		System.out.println("c.z="+c.z);
		
		
	}

}
