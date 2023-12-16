package dao;
import java.util.Vector;

import Utils.InnputManger;
import vo.User;
public class UserDAO {
    Vector<User> users = new Vector<User>();

    public void addUser(InnputManger im) {
        while (true){
            User user = new User();
            System.out.println("아이디를 입력하세요.");
            String id = im.getString("아이디 입력");
            boolean check = checkId(id);
            if (check) {
                System.out.println("중복된 아이디입니다.");
                continue;
            }
            System.out.println("비밀번호를 입력하세요.");
            String pw = im.getString("비밀번호 입력");
            System.out.println("이름을 입력하세요.");
            String name = im.getString("이름 입력");
            user.setId(id);
            user.setPw(pw);
            user.setName(name);
            users.add(user);
            break;
        }
    }
    private boolean checkId(String id) {
        for (User u : users) {
            if (u.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
    public void removeUser(InnputManger im) {
        while (true) {
            String id = im.getString("아이디 입력");
            User user = getUser(id);
            if (user == null) {
                System.out.println("없는 아이디입니다.");
                continue;
            }
            users.remove(user);
            break;
        }
    }
    public User login(InnputManger im) {
        while (true) {
            String id = im.getString("아이디 입력");
            User user = getUser(id);
            if (user == null) {
                System.out.println("없는 아이디입니다.");
                continue;
            }
            while (true){
                String pw = im.getString("비밀번호 입력");
                if (!user.getPw().equals(pw)) {
                    System.out.println("비밀번호가 틀렸습니다.");
                    continue;
                }
                return user;
            }
        }
    }
    private User getUser(String id) {
        for (User u : users) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }
}
