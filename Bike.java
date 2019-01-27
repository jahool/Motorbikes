class Bike{
		String brand;
		String model;
		int yearOfProduction;
		double engineCapacity;
		int maxPower;
		double weight;
		

		Bike(String brand, String model, int yearOfProduction, double engineCapacity, int maxPower,
				double weight) {
			this.brand = brand;
			this.model = model;
			this.yearOfProduction = yearOfProduction;
			this.engineCapacity = engineCapacity;
			this.maxPower = maxPower;
			this.weight = weight;
		}
		Bike (Bike bike){
			this(bike.brand, bike.model, bike.yearOfProduction, bike.engineCapacity, bike.maxPower, bike.weight);
		}

		void printInfo() {
			String info = "Brand and Model: " +brand + " " + model + "; "+"Year of production: "  + yearOfProduction + "; "+" Engine Capacity: " + engineCapacity + " cc"+"; " +"Max Power: "+ maxPower +" hp"+
					 "; "+ "Weight: " + weight + " kg";
			System.out.println(info);
		}

	}
