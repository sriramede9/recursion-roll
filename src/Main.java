import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.sri.A;
import com.sri.B;
import com.sri.SampleArrays;
import com.sri.Student;

public class Main {

	public static void main(String[] args) {

//		A a = new A();
//		B b = new B();
//
//		System.out.println(a.foo());
//		System.out.println(b.foo());
//		System.out.println(b.fooB());
//		A ab = new B();
//		System.out.println(ab.foo());
////		System.out.println(ab.foo); we cannot
//
//		//
////		System.out.println("Argument count: " + args.length);

		Student s1 = new Student(1, "sri");
		Student s2 = new Student(2, "Aman");
		Student s3 = new Student(3, "Dinesh");

		HashMap<Integer, Student> studentMap = new HashMap<Integer, Student>();

		studentMap.put(1, s1);
		studentMap.put(2, s2);
		studentMap.put(3, s3);

		// sort by names
		Set<Entry<Integer, Student>> entrySet = studentMap.entrySet();
		for (Entry<Integer, Student> es : entrySet) {

//			System.out.println(es.getValue().getName());

		}

		//
		List<Student> collect = studentMap.values().stream().sorted(Student.StudentNameComparator)
				.collect(Collectors.toList());

//		collect.stream().forEach(System.out::println);

		// Maintaining insertion order with the help of LinkedList
		Map<Integer, Student> sortedMap = new LinkedHashMap<Integer, Student>();
		List<Entry<Integer, Student>> list = new LinkedList<Map.Entry<Integer, Student>>(studentMap.entrySet());

		list.sort(namecomp);

//		list.sort(new Comparator<T>() {
//		});
//		
		for (Entry<Integer, Student> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
			System.out.println(entry.getKey() + " \t" + entry.getValue());
		}

	}

	static Comparator namecomp = new Comparator<Entry<Integer, Student>>() {

		@Override
		public int compare(Entry<Integer, Student> o1, Entry<Integer, Student> o2) {
			// TODO Auto-generated method stub
			return o1.getValue().getName().compareTo(o2.getValue().getName());
		}
	};

}
