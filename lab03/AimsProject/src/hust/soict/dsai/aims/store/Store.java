package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();

    /**
     * Thêm 1 hay nhiều DVD vào cửa hàng
     * 
     * @param args
     */
    public void addDvd(DigitalVideoDisc... args) {
        for (DigitalVideoDisc dvd : args) {
            System.out.printf("Thêm thành công sản phẩm %s với id: %d\n", dvd.getTitle(), dvd.getId());
            itemsInStore.add(dvd);
        }
    }

    /**
     * Xóa DVD bằng id
     * 
     * @param id
     */
    public void removeDvd(int id) {
        boolean isRemoved = false;
        for (int i = 0; i < itemsInStore.size(); i++) {
            // Nếu tìm thấy sản phẩm thì xóa
            DigitalVideoDisc item = itemsInStore.get(i);
            if (item.getId() == id) {
                itemsInStore.remove(i);
                isRemoved = true;
                System.out.printf("Đã xóa sản phẩm có ID: %d\n", id);
                return;
            }
        }

        if (isRemoved == false) {
            System.out.printf("Không sản phẩm nào có ID: %d\n", id);
        }
    }

    /**
     * Xóa sản phẩm theo title
     * 
     * @param title
     */
    public void removeDvd(String title) {
        boolean isRemoved = false;
        for (int i = 0; i < itemsInStore.size(); i++) {
            // Nếu tìm thấy sản phẩm thì xóa
            DigitalVideoDisc item = itemsInStore.get(i);
            if (item.isMatch(title)) {
                itemsInStore.remove(i);
                isRemoved = true;
                System.out.printf("Đã xóa sản phẩm có title: %s\n", title);
                return;
            }
        }

        if (isRemoved == false) {
            System.out.printf("Không sản phẩm nào có Title: %s\n", title);
        }
    }
}
