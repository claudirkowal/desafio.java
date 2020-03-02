package upper;

import java.util.Arrays;
import java.util.List;

public class Upper {

	public static void main(String[] args) {
		List<String> letras = Arrays.asList("a", "b", "c");

		    letras.stream().map(name -> name.toUpperCase())
		        .forEach(name -> System.out.print(name + " "));
	}

}
