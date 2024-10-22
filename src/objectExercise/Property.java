package objectExercise;

public class Property {

	private String apartname;
	private String owner;
	private String aparttype;
	private int apartprice;
	private double size;

	public String getApartName() {
		return this.apartname;
	}

	public String getOwner() {
		return this.owner;
	}

	public String getApartType() {
		return this.aparttype;
	}

	public int getApartPrice() {
		return this.apartprice;
	}

	public double getSize() {
		return this.size;
	}

	public void setApartName(String apartName) {
		this.apartname = apartName;
	}

	public void setOwner(String owNer) {
		this.owner = owNer;
	}

	public void setApartTpe(String apartType) {
		this.aparttype = apartType;
	}

	public void setApartPrice(int apartPrice) {
		this.apartprice = apartPrice;
	}

	public void setSize(double siZe) {
		this.size = siZe;
	}

	Property(String apartname, String owner, String aparttype, int apartprice, double size) {
		this.apartname = apartname;
		this.owner = owner;
		this.aparttype = aparttype;
		this.apartprice = apartprice;
		this.size = size;

	}

	public void information() {
		System.out.println("=============================");
		System.out.println("物件名：" + this.apartname);
		System.out.println("物件所有者名：" + this.owner);
		System.out.println("物件種別：" + this.aparttype);
		System.out.println("物件価格：" + this.apartprice + "円");

		if (!this.aparttype.equals("土地")) {
			System.out.println("間取り：" + this.size + "LDK");
			System.out.println("=============================");
		}
	}

}
