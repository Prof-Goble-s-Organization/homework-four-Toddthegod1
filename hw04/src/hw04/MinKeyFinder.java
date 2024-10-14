package hw04;



/**
 * Find the key associated with the minimum value in a tree.
 */
public class MinKeyFinder implements CS232Visitor<String, Integer> {
	private String minKey;
	private Integer minValue;

	public MinKeyFinder() {
	}

	/**
	 * {@inheritDoc}
	 */
	public void visit(String key, Integer value) {
		if (minValue == null || value < minValue) {
			minKey = key;
			minValue = value;
		}
	}

	/**
	 * Get the key associated with the minimum value in the tree.
	 * 
	 * @return the key associated with the minimum value.
	 */
	public String getMinKey() {
		return minKey;
	}
	
	public static void main(String[] args) {
		MinKeyFinder finder = new MinKeyFinder();
		CS232LinkedBinaryTree tree = new CS232LinkedBinaryTree<String, Integer>();
		tree.add("A", 32);
		tree.add("B", 31);
		tree.add("C", 38);
		tree.add("D", 12);
		tree.add("E", 10);
		tree.add("F", 80);
		tree.add("G", 100);
		tree.add("H", 120);
		tree.add("K", 45);
		tree.add("L", 43);
		tree.visitPreOrder(finder);
		System.out.print("The min value is " + finder.getMinKey());
	}
}
