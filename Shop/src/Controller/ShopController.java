package Controller;
import Utils.InnputManger;
import dao.UserDAO;
import vo.User;

public class ShopController {
    UserDAO userDAO = new UserDAO();
	InnputManger innputManger = new InnputManger();
	// 	System.out.println("[1.쇼핑] [2.장바구니목록] [0.뒤로가기]");
	
	// 	System.out.println("[1.내 장바구니] [2.삭제] [3.구입] [0.뒤로가기]");
    // 	System.out.println("[1.아이템관리] [2.카테고리관리] [3.장바구니관리] [4.유저관리] [0.뒤로가기] ");
    private void printMain() {
    	System.out.println("[1.가입] [2.탈퇴] [3.로그인] [4.로그아웃]" + "\n[100.관리자] [0.종료] ");
    }
    private void printUser() {
    	System.out.println("[1.쇼핑] [2.장바구니목록] [0.뒤로가기]");
    }
    public void run() {
        while (true){
            printMain();
            int sel = new InnputManger().getNumber("메뉴 선택", 0, 100);
            if (sel == 1) {
                System.out.println("가입");
                userDAO.addUser(innputManger);
            } else if (sel == 2) {
                userDAO.removeUser(innputManger);
            } else if (sel == 3) {
                while (true) {
                    User user = userDAO.login(innputManger);
                    printUser();
                    sel = innputManger.getNumber("메뉴 선택", 0, 2);
                    if (sel == 1) {
                        // 쇼핑
                    } else if (sel == 2) {
                        // 장바구니 목록
                    } else if (sel == 0) {
                        // 뒤로가기
                        break;
                    }
                }
            } else if (sel == 4) {
                // 로그아웃
            } else if (sel == 100) {
                // 관리자
            } else if (sel == 0) {
                // 종료
                break;
            }
        }

    }
}
