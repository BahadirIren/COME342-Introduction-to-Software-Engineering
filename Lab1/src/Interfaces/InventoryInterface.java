package Interfaces;

import java.util.List;

public interface InventoryInterface<T> {

	public void add(T item);

	public void remove(T item);

	public void removeAll();

	public List<T> getList();

}
