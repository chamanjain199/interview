package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Emp {
	public String name;
	public Integer salary;
	public Emp(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	

}

public class SecondHighestSalary {

	public static void main(String[] args) {

		List<Emp> employess1 = new ArrayList<Emp>();
		employess1.add(new Emp("chaman",100));
		employess1.add(new Emp("samkit",600));
		employess1.add(new Emp("aman",200));
		employess1.add(new Emp("sumit",300));
		employess1.add(new Emp("rajest",400));
		employess1.add(new Emp("suresh",500));
		
		
		List<Emp> employess2 = new ArrayList<Emp>();
		employess2.add(new Emp("chaman",100));
		employess2.add(new Emp("samkit",600));
		employess2.add(new Emp("aman",200));
		employess2.add(new Emp("sumit",300));
		employess2.add(new Emp("rajest",400));
		employess2.add(new Emp("suresh",500));
		
		List<List<Emp>> employess=new ArrayList<>();
		employess.add(employess1);
		employess.add(employess2);
		//String name=employess1.stream().filter(e->e.name.startsWith("s")).sorted((a,b)->b.salary.compareTo(a.salary)).skip(1).findFirst().get().name;

		//System.out.println(name);
		int sum=employess.stream().flatMap(epmlist->epmlist.stream()).mapToInt(emp->emp.salary).sum();
System.out.println(sum);

int sum1=employess.stream().map(epmlist->epmlist.stream().mapToInt(emp->emp.salary).sum()).mapToInt(e->e).sum();
System.out.println(sum1);

	}

}
