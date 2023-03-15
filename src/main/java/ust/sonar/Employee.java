package ust.sonar;

public class Employee {
		private String empname;
		private int empage;
		private int noofyears;
		private double salary;
		
		public Employee(String empname, int empage, int noofyears, double salary) {
			this.empname = empname;
			this.empage = empage;
			this.noofyears = noofyears;
			this.salary = salary;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public int getEmpage() {
			return empage;
		}
		public void setEmpage(int empage) {
			this.empage = empage;
		}
		public int getNoofyears() {
			return noofyears;
		}
		public void setNoofyears(int noofyears) {
			this.noofyears = noofyears;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [empname=" + empname + ", empage=" + empage + ", noofyears=" + noofyears
					+ ", salary=" + salary + "]";
		}

}
