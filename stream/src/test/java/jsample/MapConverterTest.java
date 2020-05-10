package jsample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

import jsample.models.Product;

public class MapConverterTest {

	private MapConverter mapConverter = new MapConverter();

	@Test
	public void testConvert() {
		Map<String, Product> idProductMap = new HashMap<>();
		idProductMap.put("P001", new Product().setId("P001").setName("Games").setQuantity(10));
		idProductMap.put("P002", new Product().setId("P002").setName("CDs").setQuantity(20));
		idProductMap.put("P003", new Product().setId("P003").setName("Laptop").setQuantity(2));
		idProductMap.put("P004", new Product().setId("P004").setName("Computers").setQuantity(24));

		Map<String, String> actual = mapConverter.convert(idProductMap);

		Map<String, String> expected = new HashMap<>();

		for (Entry<String, Product> entry : idProductMap.entrySet()) {
			expected.put(entry.getKey(), entry.getValue().getName());
		}

		AssertionsForInterfaceTypes.assertThat(actual).containsExactlyInAnyOrderEntriesOf(expected);

	}
}