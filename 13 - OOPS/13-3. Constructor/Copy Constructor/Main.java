public class Main{
	public static void main(String[] args) {
		Person p1 = new Person("Jay", 16);
		Person p2 = new Person(p1);
		Person p3 = new Person(p1);
	}
}

class Person{
	String name;
	int age;
	
	Person(String n, int a){
		this.name = n;
		this.age = a;

		System.out.println(n +  a);
	}
	Person(Person an){
		this.name = an.name;
		this.age = an.age;
		System.out.println(an.age + an.name);
	}
}