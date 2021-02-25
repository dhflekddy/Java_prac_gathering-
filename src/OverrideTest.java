
class Point3D extends Object{
	int x;
	int y;
	int z;
	
	public String toString() {
		return "x:"+x+" y:"+y+" z:"+z+"!!!";
	}
	Point3D(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
}



public class OverrideTest {

	public static void main(String[] args) {
		Point3D p=new Point3D(10,9,8);
		
		System.out.println(p);
		System.out.println(p.toString());
		
		
	}

}
