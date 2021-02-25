package pkg1;

 public class MyParent{
	private   int prv; //같은 클래스
			  int dft; //같은 패키지
	protected int prt; //같은 패키지+다른패키지의 자손
	public 	  int pub; //접근제한없음
	
	public void printMembers() {
		//같은 패키지안의 같은 클래스안에 있으므로 4개 변수 모두 접근가능  
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

 class MyParentTest {

	public static void main(String[] args) {
		MyParent p=new MyParent();//MyParent클래스를 상속받지 않았으니 객체를 생성해주어 그 객체의 맴버에 접근.
		System.out.println(p.prv);//prv의 접근제어자가 private이기때문에 prv가 선언된 클래스 밖에서는 prv에 접근할수 없다.
		System.out.println(p.dft);//pkg1이라는 같은 패키지안에 안에서 dft가 쓰였기때문에 접근가능한것!
		System.out.println(p.prt);
		System.out.println(p.pub);

		//지금 상황을 정리해보면 이 소스파일을  컴파일하면 pkg1이라는 폴더 하나가 만들어지고 그안에 MyParentTest와 MyParent 두개의 파일이 만들어지는
		//것이다. 
		
		
	}

}
