package pkg1;

 public class MyParent{
	private   int prv; //���� Ŭ����
			  int dft; //���� ��Ű��
	protected int prt; //���� ��Ű��+�ٸ���Ű���� �ڼ�
	public 	  int pub; //�������Ѿ���
	
	public void printMembers() {
		//���� ��Ű������ ���� Ŭ�����ȿ� �����Ƿ� 4�� ���� ��� ���ٰ���  
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

 class MyParentTest {

	public static void main(String[] args) {
		MyParent p=new MyParent();//MyParentŬ������ ��ӹ��� �ʾ����� ��ü�� �������־� �� ��ü�� �ɹ��� ����.
		System.out.println(p.prv);//prv�� ���������ڰ� private�̱⶧���� prv�� ����� Ŭ���� �ۿ����� prv�� �����Ҽ� ����.
		System.out.println(p.dft);//pkg1�̶�� ���� ��Ű���ȿ� �ȿ��� dft�� �����⶧���� ���ٰ����Ѱ�!
		System.out.println(p.prt);
		System.out.println(p.pub);

		//���� ��Ȳ�� �����غ��� �� �ҽ�������  �������ϸ� pkg1�̶�� ���� �ϳ��� ��������� �׾ȿ� MyParentTest�� MyParent �ΰ��� ������ ���������
		//���̴�. 
		
		
	}

}
