package ListImplementationAbstract;

public class SearchTree implements NodeList{
	private ListItem root;
	
	public SearchTree(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return this.root;		
	}

	@Override
	public boolean addItem(ListItem lItem) {
		return false;
	}

	@Override
	public boolean removeItem(ListItem lItem) {
		return false;
	}

	private void performRemoval(ListItem lItemToBeRemoved, ListItem parentItem) {		
	}
	
	@Override
	public void traverse(ListItem root) {		
	}

}
