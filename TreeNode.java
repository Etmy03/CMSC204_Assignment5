
public class TreeNode<T> {
	public T data;
	public TreeNode leftChild;
	public TreeNode rightChild;
	
	public TreeNode() {
		//make everything null?
	}
	public TreeNode(T dataNode) {
		this.data = (T)dataNode;
		this.leftChild = null;
		this.rightChild = null;
	}
	public TreeNode(TreeNode<T>node) {
		this.data = node.data;
		this.leftChild = node.leftChild;
		this.rightChild = node.rightChild;
	}
	public T getData(){
		return (T)data;
	}

}
