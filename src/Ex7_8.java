//이거Ex7_8 내가 직접 다함:)
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
			System.out.println("살돈없어");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(
				p + "를" + p.price + "에 샀고 남은돈은" + money + "원이고 포인트는" + p.bonusPoint + "적립됬고 전체포인트는" + bonusPoint + "야");
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
		System.out.println("나지금"+b.money+"원있고포인트는"+ b.bonusPoint+"있어");
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Tv());
		System.out.println(b.money+"남았어");
	}
}
