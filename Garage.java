class Garage {
	public static void main(String[] args) {
		final String appName = "My Bikes v0.2";

		Bike bike1 = new Bike("Romet", "Ogar", 1987, 49.9, 2, 60.0);
		Bike bike2 = new Bike("MZ", "ETZ 150", 1986, 143.0, 12, 123.0);
		Bike bike3 = new Bike("Suzuki", "GS 500", 2001, 487.0, 46, 175.0);

		System.out.println(appName);
		System.out.println("My Bikes:");
		bike1.printInfo();
		bike2.printInfo();
		bike3.printInfo();
	}
}