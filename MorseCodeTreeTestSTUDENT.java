/**
 * 
 * @author etmybarbosa
 *
 */
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MorseCodeTreeTestSTUDENT {
	MorseCodeTree tree;
	@Before
	public void setUp() throws Exception {
		tree = new MorseCodeTree();
		
		
	}

	@After
	public void tearDown() throws Exception {
		tree = null;
	}

	@Test
	public void testFetch() {
		tree.insert(".", "a");
		tree.insert("-", "b");
		tree.insert("..", "r");
		tree.insert(".-", "s");
		tree.insert("-.", "o");
		String str = tree.fetch("-") + 
				     tree.fetch(".") + 
				     tree.fetch("..") +
				     tree.fetch("-") +
				     tree.fetch("-.") +
				     tree.fetch(".-") +
				     tree.fetch(".");
		assertEquals("barbosa", str);
	}
	

	@Test
	public void testToArrayList() {
		tree.insert(".", "a");
		tree.insert("-", "b");
		tree.insert("..", "r");
		tree.insert(".-", "s");
		tree.insert("-.", "o");
		String str = tree.fetch("-") + 
				     tree.fetch(".") + 
				     tree.fetch("..") +
				     tree.fetch("-") +
				     tree.fetch("-.") +
				     tree.fetch(".-") +
				     tree.fetch(".");
		String test = tree.toArrayList().toString().replace(",", "");
		assertEquals("barbosa", str);
	}
	
	@Test
	public void testBuildTree() {
		tree.buildTree();
		String test = tree.toArrayList().toString().replace(",", "");
		assertEquals("[h s v i f u e l r a p w j  b d x n c k y t z g q m o]", test);
		
	}


}
