class Bike{
		String brand;
		String model;
		int yearOfProduction;
		double engineCapacity;
		int maxPower;
		double weight;
		

		Bike(String bikeBrand, String bikeModel, int bikeYearOfProduction, double bikeEngineCapacity, int bikeMaxPower,
				double bikeWeight) {
			brand = bikeBrand;
			model = bikeModel;
			yearOfProduction = bikeYearOfProduction;
			engineCapacity = bikeEngineCapacity;
			maxPower = bikeMaxPower;
			weight = bikeWeight;
		}

		void printInfo() {
			String info = "Brand and Model: " +brand + " " + model + "; "+"Year of production: "  + yearOfProduction + "; "+" Engine Capacity: " + engineCapacity + " cc"+"; " +"Max Power: "+ maxPower +" hp"+
					 "; "+ "Weight: " + weight + " kg";
			System.out.println(info);
		}

	}
