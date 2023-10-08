package Task2;


public class Test {
	
	public static void main(String[] args) {
		Product p1 = new Product("1", "Pepsi", 500, "small");
		Product p2 = new Product("2", "Sting", 700, "normal");
		Product p3 = new Product("3", "Coca", 350, "normal");
		Product p4 = new Product("4", "7Up", 800, "extreme");

		
		OrderItem ot1 = new OrderItem(p1, 5);
		OrderItem ot2 = new OrderItem(p2, 5);
		OrderItem ot3 = new OrderItem(p3, 5);
		OrderItem ot4 = new OrderItem(p4, 5);

		
		OrderItem[] otArr = new OrderItem[4];
		otArr[0] = ot2;
		otArr[1] = ot3;
		otArr[2] = ot4;
		otArr[3] = ot1;
		
	
		Order o = new Order(otArr);
		System.out.print("DANH SÁCH HÓA ĐƠN KHI CHƯA SẮP XẾP: ");
		for (OrderItem orderItem : otArr) {
			System.out.print(orderItem + " ");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		o.sortByID(otArr);
		System.out.print("DANH SÁCH HÓA ĐƠN KHI ĐÃ SẮP XẾP THEO ID: ");
		for (OrderItem orderItem : otArr) {
			System.out.print(orderItem + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println();

		
		System.out.print("SỐ TIỀN PHẢI TRẢ: ");
		System.out.println(o.cost());
		System.out.println();
		System.out.println();

		
		System.out.print("KIỂM TRA XEM SẢN PHẨM CÓ TRONG HÓA ĐƠN KHÔNG, NẾU CÓ THÌ IN RA: ");
		if (o.contains(p4)) {
			System.out.println();
			System.out.println("Có " + p4.toString());
		} else System.out.println("Không có");
		System.out.println();
		System.out.println();

		
		
		String type = "normal";
		System.out.print("IN TẤT CẢ SẢN PHẨM CÓ LOẠI TYPE ĐÓ: ");
		Product[] productArr = o.filter(type);
		System.out.println();
		for (Product product : productArr) {
			System.out.println(product.toString());
		}
		
		
	}
}
