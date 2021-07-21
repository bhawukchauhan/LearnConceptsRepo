package ListImplementationAbstract;

public class MyLinkedList implements NodeList{

	private ListItem root;
	
	public MyLinkedList(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return this.root;		
	}

	@Override
	public boolean addItem(ListItem newItem) {
		if(this.root == null) {
			this.root.setNext(newItem);
			return true;
		}
		
		ListItem currentItem = this.root;
		int comparisonValue = currentItem.compareTo(newItem);
		if(comparisonValue <= 0) {
			currentItem.setNext(newItem);
			newItem.setPrevious(currentItem);
			return true;
		}
		else if(comparisonValue > 0) {
			currentItem.setPrevious(newItem);
			newItem.setNext(currentItem);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		return false;
	}

	@Override
	public void traverse(ListItem root) {		
	}

}
