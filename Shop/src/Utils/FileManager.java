package Utils;

import dao.ItemDAO;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    String CUR_DIR = System.getProperty("user.dir");
    String fileName_cart = "cart.txt";
    String fileName_user = "user.txt";
    String fileName_item = "item.txt";

    public void saveCart(ItemDAO itemDAO) {
        try (FileWriter fw = new FileWriter(CUR_DIR + fileName_cart);){

        } catch (IOException e) {
            System.out.println("파일 저장 실패");
        }
    }
    public void loadCart() {

    }
    private String getCartString() {
        return null;
    }
    public void saveUser() {

    }
    public void loadUser() {

    }
    public void saveItem() {

    }
    public void loadItem() {

    }
}
