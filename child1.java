package day6;
class parent {
	void add(int x, int y)
	{
		System.out.println("add from parent is " +(x+y));
	}
}

public class child1 extends parent {
	void add (int x, int y) {
		super.add(5, 5);
	}


public static void main(String[]args) {
	child1 obj = new child1();
	obj.add(5, 5);
}

}
