package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;;

// hust.soict.dsai.aims.Aims.java

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        // tạo dvd1
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        // tạo dvd2
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        // Tạo dvd3
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        // Tạo dvd4
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Em và Trịnh", "Phim", "ZZZZ", 10, 77.54f);
        // Tạo dvd5
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Doraemon", "Hoạt hình", "SSS", 20, 12f);

        // Thêm vào giỏ hàng
        anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3);
        // Thêm 2 sản phẩm vào giỏ hàng
        anOrder.addDigitalVideoDisc(dvd4, dvd5);
        // In danh sách sản phẩm
        anOrder.printCart();

    }
}