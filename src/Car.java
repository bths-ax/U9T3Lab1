public class Car extends Vehicle {
	private boolean electric;
	private boolean discountApplied;

	public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
		super(licensePlate, tollFee, passengers);
		this.electric = electric;
		discountApplied = false;   // default value
	}

	public void printCar() {
		System.out.println("License plate: " + getLicensePlate());
		System.out.println("Toll fee: " + getTollFee());
		System.out.println("Passengers: " + getPassengers());
		System.out.println("Electric? " + electric);
		System.out.println("Discount applied? " + discountApplied);
	}

	public boolean dropOffPassengers(int numOut) {
		if (numOut > getPassengers())
			return false;
		setPassengers(getPassengers() - numOut);
		return true;
	}

	public void applyDiscount() {
		if (!discountApplied) {
			discountApplied = true;
			setTollFee(getTollFee() / 2);
		}
	}

	public boolean isDiscountApplied() { return discountApplied; }
	public void setDiscountApplied(boolean newDiscountApplied) { discountApplied = newDiscountApplied; }
}
