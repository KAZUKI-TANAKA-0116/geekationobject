package objectExercise;

public class Apartment extends Property {
	Apartment(String apartname, String owner, String aparttype, int apartprice, double size) {
		super(apartname, owner, aparttype, apartprice, size);
	}

	@Override
	public void information() {
		super.information();

		System.out.println("間取り：" + this.getSize() + "LDK");

		System.out.println("=============================");
	}
}
