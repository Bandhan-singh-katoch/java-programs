class lamp{
    int a = 4;
	void input()
	{
		System.out.println("hello i am in input method");
	}
}

public class creating_class {

	public static void main(String[] args) {
		lamp l1 = new lamp();
		l1.input();
		System.out.println("The value of a = "+l1.a);
		
	}
}
