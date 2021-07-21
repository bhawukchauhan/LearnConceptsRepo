package ListImplementationAbstract;

public class Node extends ListItem{

	public Node(Object value) {
		super(value);
	}

	@Override
	protected ListItem next() {
		return rightLink;
	}

	@Override
	protected ListItem setNext(ListItem item) {
		this.rightLink = item;
		return this.rightLink;
	}

	@Override
	protected ListItem previous() {
		return leftLink;
	}

	@Override
	protected ListItem setPrevious(ListItem item) {
		this.leftLink = item; 
		return this.leftLink;
	}

	@Override
	protected int compareTo(ListItem item) {
		if(item != null)
			return ((String) getValue()).compareTo((String) item.getValue());
		else
			return -1;
	}

}
