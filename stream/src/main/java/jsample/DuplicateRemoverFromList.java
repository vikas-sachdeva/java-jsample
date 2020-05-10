package jsample;

import java.util.List;
import java.util.stream.Collectors;

import jsample.models.Product;

public class DuplicateRemoverFromList {

	public List<String> removeDuplicatesFromListOfString(List<String> input) {
		return input.stream().distinct().collect(Collectors.toList());
	}

	public List<Product> removeDuplicatedFromListOfObject(List<Product> input) {
		return input.stream().collect(Collectors.groupingBy(Product::getId)).values().stream().map(p -> p.get(0))
				.collect(Collectors.toList());
	}
}
