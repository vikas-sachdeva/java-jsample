package jsample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

import jsample.models.Product;

public class DuplicateRemoverFromListTest {

	private DuplicateRemoverFromList duplicateRemoverFromList = new DuplicateRemoverFromList();

	@Test
	public void removeDuplicatesFromListOfStringTest() {
		List<String> input = new ArrayList<>(Arrays.asList("p1", "p2", "p3", "p4", "p2", "p1"));

		List<String> actual = duplicateRemoverFromList.removeDuplicatesFromListOfString(input);

		List<String> expected = new ArrayList<>();
		for (String str : input) {

			if (!expected.contains(str)) {
				expected.add(str);
			}
		}
		AssertionsForInterfaceTypes.assertThat(actual).hasSameSizeAs(expected);
		AssertionsForInterfaceTypes.assertThat(actual).hasSameElementsAs(expected);
	}

	@Test
	public void removeDuplicatedFromListOfObjectTest() {
		List<Product> input = new ArrayList<Product>() {

			private static final long serialVersionUID = 1L;

			{
				add(new Product().setId("P001").setName("Games").setQuantity(10));
				add(new Product().setId("P002").setName("CDs").setQuantity(20));
				add(new Product().setId("P003").setName("Laptop").setQuantity(2));
				add(new Product().setId("P001").setName("Computers").setQuantity(24));
				add(new Product().setId("P002").setName("Computers").setQuantity(24));
			}
		};

		List<Product> actual = duplicateRemoverFromList.removeDuplicatedFromListOfObject(input);

		List<Product> expected = new ArrayList<>();

		for (Product product : input) {

			int i = 0;
			for (; i < expected.size(); i++) {
				if (product.getId().equals(expected.get(i).getId())) {
					break;
				}
			}
			if (i == expected.size()) {
				expected.add(product);
			}
		}

		AssertionsForInterfaceTypes.assertThat(actual).hasSameSizeAs(expected);
		AssertionsForInterfaceTypes.assertThat(actual).hasSameElementsAs(expected);
	}
}