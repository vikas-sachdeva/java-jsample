package jsample;

import java.util.Map;
import java.util.stream.Collectors;

import jsample.models.Product;

public class MapConverter {

	public Map<String, String> convert(Map<String, Product> idProductMap) {
		return idProductMap.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().getName()));

	}
}
