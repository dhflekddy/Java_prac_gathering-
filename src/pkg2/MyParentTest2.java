package pkg2;
//처음 MyChild 클래스를 만들고 MyParent를 상속할려고 하면 에러가 난다.왜?
//MyParent클래스의 접근제어자가 default이므로.
//그후 하나의 소스파일내에서는 두개이상의 public 클래스가 올수 없으므로 원래 public
//클래스 였던 MyParentTest의 public을 삭제하고 파일의 이름도 변경해준다.
//그후 마지막으로 import pkg1.MyParent 를 해주면 오류없어짐.혹은  import 해주지않고
//~~ extends pkg1.MyParent 라고해도 됨. 
import pkg1.MyParent;
class MyChild extends MyParent{
	public void printMembers() {
		MyParent p=new MyParent();
		System.out.println(p.prt);//MyParent를 상속하였는데 prt변수에 이렇게 접근하는 
								  //것은 잘못된 접근 아닐까?
		
	System.out.println(prv);//변수prv가 선원된 클래스와 아주 다른 클래스일뿐만 하니라 
							//패키지도 전혀 다르므로 오류.
	System.out.println(dft);//변수dft가 선언된 패키지와 다른 패키지에서 쓰였으므로 오류.
	System.out.println(prt);//변수prt가 선언된 패키지와는 다른 패키지에서 쓰였지만 prt가
							//선언된 클래스를 상속하였으므로 prt에 접근가능 prt는 
							//protected의 접근제어자를 가짐.
	System.out.println(pub);//접근제한범위없음!
	}
}

public class MyParentTest2{

	public static void main(String[] args) {
		MyParent p=new MyParent();//MyParent클래스를 상속받지 않았으니 객체를 생성해주어 그 객체의 맴버에 접근.
		System.out.println(p.prv);
		System.out.println(p.dft);
		System.out.println(p.prt);//다른 패키지에다 MyParent클래스의 자손도 아니므로 안됨.
		System.out.println(p.pub);
		System.out.println(pub);//public class MyParentTest2 extends MyParent를 하고 main 메소드의 
								//static을 없애주면 가능함.
	}

}
