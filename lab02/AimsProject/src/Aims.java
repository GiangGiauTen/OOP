// Aims.java
// Lê Truong Giang 20205077
public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        // Thêm dvd1 vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        // Thêm dvd2 vào giỏ hàng
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        // Thêm dvd3 vào giỏ hàng
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        // In danh sách sản phẩm
        System.out.println("Danh sach san pham truoc khi xoa");
        anOrder.printCart();
        System.out.print("Total Cost: ");
        System.out.println(anOrder.totalCost());
        // Sau khi xóa sản phẩm
        anOrder.removeDigitalVideoDisc(dvd1);
        System.out.println("Danh sach san pham sau khi xoa");
        anOrder.printCart();
        System.out.print("Total Cost: ");
        System.out.println(anOrder.totalCost());
    }
}