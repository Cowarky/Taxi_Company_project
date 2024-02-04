
public class app {

	public static void main(String[] args) {
		String [] companyNumbers = new String[10];
		companyNumbers[0] = "96103355533";
		Company taxOnMe = new Company(5616161, "Lebanon, Beirut", "96103355533");
		Customer customer1 = new Customer(14632, "John doe", "Lebanon, Beirut", "96181232320", "sin el fil", "Cola", false);
		taxOnMe.calls.add(customer1.CallCompany());
		Car car = new Car("45626254",CarModel.nissan);
		car.AddDefaultSeats();
		System.out.println(car);
		int count = 0;
//		while (true) {
//			if (taxOnMe.getCallSize() == 0) {
//				continue;
//			}
//			for (int i=0;i<taxOnMe.getCallSize();i++) {
//				if (!taxOnMe.calls.get(i).isAnswered()) {
//					System.out.println("Calling");
//				}
//			}
//			if (count <= 10) {
//				System.out.println(".");
//				count++;
//			}else {
//				count = 0;
//			}
			
//		}
	}

}
