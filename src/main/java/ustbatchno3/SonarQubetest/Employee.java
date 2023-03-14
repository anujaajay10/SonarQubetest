package ustbatchno3.SonarQubetest;

public class Employee {
		private String emp_name;
		private int emp_age;
		private int no_of_years;
		private double salary;
		/**
		 * @param emp_name
		 * @param emp_age
		 * @param no_of_years
		 * @param salary
		 */
		public Employee(String emp_name, int emp_age, int no_of_years, double salary) {
			//super();
			this.emp_name = emp_name;
			this.emp_age = emp_age;
			this.no_of_years = no_of_years;
			this.salary = salary;
		}
		public String getEmp_name() {
			return emp_name;
		}
		public void setEmp_name(String emp_name) {
			this.emp_name = emp_name;
		}
		public int getEmp_age() {
			return emp_age;
		}
		public void setEmp_age(int emp_age) {
			this.emp_age = emp_age;
		}
		public int getNo_of_years() {
			return no_of_years;
		}
		public void setNo_of_years(int no_of_years) {
			this.no_of_years = no_of_years;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [emp_name=" + emp_name + ", emp_age=" + emp_age + ", no_of_years=" + no_of_years
					+ ", salary=" + salary + "]";
		}
private static void salary_increment() {
			
			
		}
}
