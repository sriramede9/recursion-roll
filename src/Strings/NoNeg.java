package Strings;

import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {

	public List<String> noNeg(List<String> strings) {

//		nums.stream().filter(x->!( x>=13 || x<=19)).collect(Collectors.toList());

		strings.stream().filter(x -> x.length()<4).collect(Collectors.toList());
		
		return strings;
	}
}
