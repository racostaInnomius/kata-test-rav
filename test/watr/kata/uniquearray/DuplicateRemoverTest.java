package watr.kata.uniquearray;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class DuplicateRemoverTest {
	
	public Integer[] input = {1, 1, 2};
	public Integer[] expected = {1, 2};
   
	public Integer[] input1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
	public Integer[] expected1 = {0, 1, 2, 3, 4};
	
	public Integer[] input2 = {100, 200, 300, 300, 300, 300, 300, 300};
	public Integer[] expected2 = {100, 200, 300};
	
	public Integer[] input3 = {8, 8, 7, 7, 2, 3, 0, 1, 7, 8, 9, 0, 1, 2};
	public Integer[] expected3 = {8, 7, 2, 3, 0, 1, 9};
	
	@Test
   public void it_should_return_built_string_tree() {
		DuplicateRemover dupRem = new DuplicateRemover();
		
		Integer[] res = dupRem.invoke(input);
		assertArrayEquals(res,expected);
		
		Integer[] res1 = dupRem.invoke(input1);
		assertArrayEquals(res1,expected1);
		
		Integer[] res2 = dupRem.invoke(input2);
		assertArrayEquals(res2,expected2);
		
		Integer[] res3 = dupRem.invoke(input3);
		assertArrayEquals(res3,expected3);
   }
}
