//�̰�Ex7_8 ���� ���� ����:)
class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		this.bonusPoint = (int) (price / 10.0);
	}
}
class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	public void buy(Product p) {
		if (money < p.price) {
			System.out.println("�쵷����");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(
				p + "��" + p.price + "�� ��� ��������" + money + "���̰� ����Ʈ��" + p.bonusPoint + "������� ��ü����Ʈ��" + bonusPoint + "��");
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

public class Ex7_8 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		System.out.println("������"+b.money+"���ְ�����Ʈ��"+ b.bonusPoint+"�־�");
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Tv());
		System.out.println(b.money+"���Ҿ�");
	}
}
