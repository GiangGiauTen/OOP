package hust.soict.dsai.aims.cart;// hust.soict.dsai.aims.cart.Cart.java

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERD = 20;
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<DigitalVideoDisc>();
    private int qtyOrdered = 0;

    /**
     * Thêm 1 DVD mới vào giỏ hàng
     * 
     * @param disc
     * @return void
     */
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERD) {
            System.out.println("The cart is almost full");
            return;
        }
        itemsOrdered.add(disc);
        qtyOrdered++;
        System.out.printf("The disc: %s has been added\n", disc.getTitle());
    }
    /**
     * Thêm nhiều DVD vào giỏ hàng bằng mảng
     * 
     * @param dvdList
     * @return void
     */
    // public void addDigitalVideoDisc(hust.soict.dsai.aims.disc.DigitalVideoDisc []
    // dvdList) {
    // for(int i = 0; i < dvdList.length; i++) {
    // if(itemsOrdered.size() >= MAX_NUMBERS_ORDERD) {
    // System.out.println("hust.soict.dsai.aims.cart.Cart đã đầy");
    // break;
    // } else {
    // System.out.printf("Thêm thành công sản phẩm %s vào giỏ hàng\n",
    // dvdList[i].getTitle());
    // itemsOrdered.add(dvdList[i]);
    // qtyOrdered++;
    // }
    // }
    // }

    /**
     * Thêm nhiều DVD vào giỏ hàng bằng danh sách tham số không cố định
     * 
     * @param args
     * @return void
     */
    public void addDigitalVideoDisc(DigitalVideoDisc... args) {
        for (DigitalVideoDisc dvd : args) {
            if (itemsOrdered.size() >= MAX_NUMBERS_ORDERD) {
                System.out.println("hust.soict.dsai.aims.cart.Cart đã đầy");
                break;
            } else {
                System.out.printf("Thêm thành công sản phẩm %s vào giỏ hàng với id: %d\n", dvd.getTitle(), dvd.getId());
                itemsOrdered.add(dvd);
                qtyOrdered++;
            }
        }
    }

    /**
     * Thêm 2 sản phẩm vào giỏ hàng
     * 
     * @param dvd1
     * @param dvd2
     */

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERD) {
            System.out.println("Giỏ hàng đã đầy, không thể thêm sản phẩm mới");
            return;
        }
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERD) {
            itemsOrdered.add(dvd1);
            qtyOrdered++;
            System.out.printf("Thêm thành công sản phẩm %s vào giỏ hàng với id: %d\n", dvd1.getTitle(), dvd1.getId());
        }

        if (itemsOrdered.size() < MAX_NUMBERS_ORDERD) {
            itemsOrdered.add(dvd2);
            qtyOrdered++;
            System.out.printf("Thêm thành công sản phẩm %s vào giỏ hàng với id: %d\n", dvd2.getTitle(), dvd2.getId());
        }
    }

    /**
     * Tính tổng số tiền giỏ hàng
     * 
     * @return float
     */
    public float totalCost() {
        float cartTotal = 0f;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            cartTotal += itemsOrdered.get(i).getCost();
        }
        return cartTotal;
    }

    /**
     * Xóa 1 DVD khỏi giỏ hàng
     * 
     * @param disc
     * @return boolean
     */
    public boolean removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean isRemoved = false;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            // Nếu tìm thấy sản phẩm thì xóa
            if (disc.equals(itemsOrdered.get(i)) == true) {
                itemsOrdered.remove(i);
                qtyOrdered--;
                isRemoved = true;
            }
        }

        return isRemoved;

    }

    /**
     * In các DVD có trong cart
     * 
     * @param
     * @return void
     */
    public void printCart() {
        System.out.println("***********************CART***********************");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            DigitalVideoDisc item = itemsOrdered.get(i);
            System.out.println(item.toString());
        }
        System.out.printf("Total cost: %f\n", totalCost());
        System.out.println("***************************************************");

    }

    /**
     * Tìm dvd bằng id
     * 
     * @param id
     */
    public void searchProduct(int id) {
        boolean finded = false;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            DigitalVideoDisc item = itemsOrdered.get(i);
            if (item.getId() == id) {
                System.out.println(item.toString());
                finded = true;
                return;
            }
        }

        if (finded == false) {
            System.out.printf("Không tìm thấy sản phẩm có id là: %d\n", id);
        }
    }

    /**
     * Tìm dvd bằng title
     * 
     * @param title
     */

    public void searchProduct(String title) {
        boolean finded = false;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            DigitalVideoDisc item = itemsOrdered.get(i);
            if (item.isMatch(title)) {
                System.out.println(item.toString());
                finded = true;
                return;
            }
        }

        if (finded == false) {
            System.out.printf("Không tìm thấy sản phẩm có title là: %s\n", title);
        }
    }

}
