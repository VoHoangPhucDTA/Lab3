package Task2;

import java.util.Arrays;
import java.util.Comparator;

public class Order {
	private OrderItem[] items;

	public Order(OrderItem[] items) {
		this.items = items;
	}

	public double cost() {
		double result = 0;
		for (OrderItem orderItem : items) {
			Product product = orderItem.getP();
			int quantity = orderItem.getQuantity();
			result += product.getPrice() * quantity;
		}
		return result;
	}
	
	
	
	public void sortByID(OrderItem[] items) {
		Arrays.sort(items, new Comparator<OrderItem>() {

			@Override
			public int compare(OrderItem o1, OrderItem o2) {
				return o1.getP().getId().compareTo(o2.getP().getId());
			}
		});
	}
	
	
	// using binary search approach
	public boolean contains(Product p) {
		sortByID(items);
		int low = 0, high = items.length - 1;
		while (low <= high) {
			int mid = (low + high)/2;
			Product midProduct = items[mid].getP();
			int compareRes = midProduct.getId().compareTo(p.getId());
			if (compareRes == 0) {
				return true;
			}
			else if (compareRes < 0) {
				low = mid + 1;
			}
			else high = mid - 1;
		}
		return false;
	}
	

	// get all products based on the given type using
	public Product[] filter(String type) {
		int count = 0;
		for (OrderItem orderItem : items) {
			if (orderItem.getP().getType().equalsIgnoreCase(type)) {
				count++;
			}
		}
		Product[] productArr = new Product[count];
		int index = 0;
		for (OrderItem orderItem : items) {
			if (orderItem.getP().getType().equalsIgnoreCase(type)) {
				productArr[index++] = orderItem.getP();
			}
		}
		return productArr;
	}

}
