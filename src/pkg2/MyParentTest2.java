package pkg2;
//ó�� MyChild Ŭ������ ����� MyParent�� ����ҷ��� �ϸ� ������ ����.��?
//MyParentŬ������ ���������ڰ� default�̹Ƿ�.
//���� �ϳ��� �ҽ����ϳ������� �ΰ��̻��� public Ŭ������ �ü� �����Ƿ� ���� public
//Ŭ���� ���� MyParentTest�� public�� �����ϰ� ������ �̸��� �������ش�.
//���� ���������� import pkg1.MyParent �� ���ָ� ����������.Ȥ��  import �������ʰ�
//~~ extends pkg1.MyParent ����ص� ��. 
import pkg1.MyParent;
class MyChild extends MyParent{
	public void printMembers() {
		MyParent p=new MyParent();
		System.out.println(p.prt);//MyParent�� ����Ͽ��µ� prt������ �̷��� �����ϴ� 
								  //���� �߸��� ���� �ƴұ�?
		
	System.out.println(prv);//����prv�� ������ Ŭ������ ���� �ٸ� Ŭ�����ϻӸ� �ϴ϶� 
							//��Ű���� ���� �ٸ��Ƿ� ����.
	System.out.println(dft);//����dft�� ����� ��Ű���� �ٸ� ��Ű������ �������Ƿ� ����.
	System.out.println(prt);//����prt�� ����� ��Ű���ʹ� �ٸ� ��Ű������ �������� prt��
							//����� Ŭ������ ����Ͽ����Ƿ� prt�� ���ٰ��� prt�� 
							//protected�� ���������ڸ� ����.
	System.out.println(pub);//�������ѹ�������!
	}
}

public class MyParentTest2{

	public static void main(String[] args) {
		MyParent p=new MyParent();//MyParentŬ������ ��ӹ��� �ʾ����� ��ü�� �������־� �� ��ü�� �ɹ��� ����.
		System.out.println(p.prv);
		System.out.println(p.dft);
		System.out.println(p.prt);//�ٸ� ��Ű������ MyParentŬ������ �ڼյ� �ƴϹǷ� �ȵ�.
		System.out.println(p.pub);
		System.out.println(pub);//public class MyParentTest2 extends MyParent�� �ϰ� main �޼ҵ��� 
								//static�� �����ָ� ������.
	}

}
