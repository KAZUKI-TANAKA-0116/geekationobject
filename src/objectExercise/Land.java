package objectExercise;

public class Land extends Property {
	private double extent;

	Land(String apartname, String owner, String aparttype, int apartprice, double extent) {
		super(apartname, owner, aparttype, apartprice, extent);
		this.extent = extent;
	}

	public double getExtent() {
		return this.extent;
	}

	public void setExtent(double extent) {
		this.extent = extent;
	}

	public void information() {
		super.information();

		System.out.println("広さ:" + this.extent);
		System.out.println("=============================");
	}
}
