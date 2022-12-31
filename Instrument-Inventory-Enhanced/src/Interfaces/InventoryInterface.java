package Interfaces;

import java.util.List;

public interface InventoryInterface<T> {

	public void add(T item);

	public T get(String serialNumber);

	public void remove(T item);

	public void removeAll();

	public List<T> getList();

}
