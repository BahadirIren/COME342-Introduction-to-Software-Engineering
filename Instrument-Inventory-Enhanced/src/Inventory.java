import java.util.LinkedList;
import java.util.List;

import Interfaces.InventoryInterface;

public class Inventory<T extends Instrument> implements InventoryInterface<T> {

	private List<T> list;

	public Inventory(Class<T> type) {

		list = new LinkedList<T>();

	}

	public Inventory(List<T> list) {
		this.list = list;
	}

	public void add(T item) {
		list.add(item);
	}

	public T get(String serialNumber) {

		// search for an item that matches serialNumbers
		for (T item : list) {

			if (item.getSerialNumber() == serialNumber) {

				return item;

			}
		}

		// if item that matches serialNumbers did not found
		return null;

	}

	public T search(T searchItem) {

		for (T item : list) {

			String builder = searchItem.getBuilder();
			if ((builder != null) && (builder.equals("")) && (!builder.equals(item.getBuilder()))) {
				continue;
			}

			// TODO implement necessary commands

		}
		return null;
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
