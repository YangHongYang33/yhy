package javalearn;

import java.util.*;

class PersonSortable implements Comparable<PersonSortable>{
	private String name;
	private int age;
	public PersonSortable(String name,int age) {
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return name + "-"+age;
	}
	@Override
	public int compareTo(PersonSortable o) {
		if(name.equals(o.name)) {
			return this.age-o.age;
		}
		return name.compareTo(o.name);
	}
	
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		PersonSortable[] per = new PersonSortable[n];
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int age = sc.nextInt();
			per[i]=new PersonSortable(name, age);
		}
		Arrays.sort(per);
		for (PersonSortable personSortable : per) {
			System.out.println(personSortable.toString());
		}
		System.out.println(Arrays.toString(PersonSortable.class.getInterfaces()));
		sc.close();
	}

}
