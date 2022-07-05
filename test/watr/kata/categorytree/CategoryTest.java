package watr.kata.categorytree;

import watr.kata.uniquearray.pojo.Category;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class CategoryTest {
	@Test
	public void it_can_be_instanciated() {
		assertTrue(new Category(1, "Apple") instanceof Category);
	}
	@Test
    public void attributes_can_be_read() {
    	Category category = new Category(1, "Apple");
    	assertEquals(1, category.getId());
    	assertEquals("Apple", category.getName());
    	assertEquals(new ArrayList<Category>(), category.getCategory());
    }
	@Test
    public void can_add_children_categories() {
    	Category category = new Category(1, "Root");
    	Category apple = new Category(2, "Apple");
    	Category samsung = new Category(3, "Samsung");
    	
    	category.setCategory(apple);
    	category.setCategory(samsung);
    	
    	assertEquals(apple, category.getCategory().get(0));
    	assertEquals(samsung, category.getCategory().get(1));
    }
}
