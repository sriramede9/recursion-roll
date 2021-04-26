import com.sri.A;
import com.sri.B;
import com.sri.SampleArrays;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();

		System.out.println(a.foo());
		System.out.println(b.foo());
		System.out.println(b.fooB());
		A ab = new B();
		System.out.println(ab.foo());
//		System.out.println(ab.foo); we cannot

		//
//		System.out.println("Argument count: " + args.length);

	}

}
