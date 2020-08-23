import java.util.*;
class Employee implements Comparable{
	String ename;
	int empno;
	Employee(String e,int n){
		ename=e;
		empno=n;
	}
	public String toString(){
		return ename+" : "+empno;
	}
	public int compareTo(Object o){
		Employee e=(Employee)o;
		if(empno>e.empno){	
			return 1;
		}
		else if(empno<e.empno){
			return -1;
		}
		else{
			return 0;
		}
	}
	public boolean equals(Object o){
		if(o instanceof Employee ){
			Employee e=(Employee)o;
			if(e.ename.equals(ename)&&e.empno==empno){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
		//if two objects are equals thier hashcodes must be equal... vice versa need not be true
	}
	@Override
	public int hashCode(){
		return empno;
	}
}
class Mycomparator implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2){
			return e1.ename.compareTo(e2.ename);
	}
}
class Test{
	public static void main(String args[]){
		Set<String> s=new HashSet<String>();
		/*Note: Sets.java uses unchecked or unsafe operations.
			Note: Recompile with -Xlint:unchecked for details.
			this is the warning if <>..generics are not used*/
		s.add("5");
		s.add("kmit");
		Set<Employee> s1=new HashSet<Employee>();
		Employee e1=new Employee("pqr",100);
		Employee e2=new Employee("xyz",187);
		Employee e3=new Employee("abc",203);
		Employee e4=new Employee("hey",187);
		Employee e5=new Employee("abc",203);
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		System.out.println(s);
		System.out.println(s1);
		Set<Employee> s2=new HashSet<Employee>();
		s2.add(e4);
		s2.add(e5);
		System.out.println(s2);
		//s1.retainAll(s2);
		s1.addAll(s2);
		System.out.println(s1);
		/*for(Employee e : s1){
			System.out.println(e.ename+" : "+e.empno);
		}*/
		Iterator<Employee> ie=s1.iterator();
		while(ie.hasNext()){	
			System.out.println(ie.next());
		}
		TreeSet<Employee> ts=new TreeSet<Employee>(s1);
		//ts=(TreeSet)s1;
		System.out.println(ts);
		System.out.println("Sorted name");
		ArrayList<Employee> ar=new ArrayList(s1);
		Mycomparator mc=new Mycomparator();
		//sort works on a list but not set... so a little changes are required to use sort for sets
		Collections.sort(ar,mc);
		System.out.println(ar);
	}
}