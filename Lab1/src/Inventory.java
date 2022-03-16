import java.util.ArrayList;
import java.util.List;

import Interfaces.InventoryInterface;

public class Inventory<T> implements InventoryInterface<T> {

	private List<T> list;

	public Inventory() {
		list = new ArrayList<T>();
	}

	public Inventory(List<T> list) {
		this.list = list;
	}

	public void add(T item) {
		list.add(item);
	}

	public void remove(T item) {
		list.remove(item);
	}

	public void removeAll() {
		list.clear();
	}

	public List<T> getList() {
		return list;
	}
}
