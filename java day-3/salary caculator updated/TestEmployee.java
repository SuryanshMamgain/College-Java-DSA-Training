public class TestEmployee{
	public static void main(String[] args) {
		Employee employee=new Employee(90000.0f,"Ram Krishna",162182,"ramkrishna@gmail.com");
		employee.calculate();
		employee.calculateTax();
		employee.show();
	}
}