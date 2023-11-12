import java.util.Scanner;
import java.util.*;

public class Main {
    public static Vector<Book> list = new Vector<Book>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. ADMIN");
        System.out.println("2. GUEST");
        System.out.println("Bạn hãy nhấn phím để chọn");
        while (true) {
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter Account: ");
                    String account = sc.next();
                    System.out.println("Enter Password: ");
                    String password = sc.next();
                    if (account.equals("admin") && password.equals("admin")) {
                        System.out.println("Logged in successfully");
                        Admin admin = new Admin();
                        admin.Menu();
                        System.out.println("Nhap tinh nang");
                        System.out.println("1. Nhap sach moi");
                        System.out.println("2. Xoa sach");
                        System.out.println("3. Sua sach");
                        System.out.println("4. Cac chuc nang cua khach đe test");
                        System.out.println("5. Thoat");

                        admin.adminFunctions = sc.nextInt();
                        if (admin.adminFunctions == 1) {
                            admin.themSach();
                        } else if (admin.adminFunctions == 2) {
                            admin.xoaSach();
                        } else if (admin.adminFunctions == 3) {
                            admin.suaSach();
                        } else if (admin.adminFunctions == 4)
                        {
                            Guest guest = new Guest();
                            guest.Menu();
                            guest.guestFunctions = sc.nextInt();
                            if (guest.guestFunctions == 1) guest.timKiem();
                            else if (guest.guestFunctions == 2) guest.XemDanhSach();
                        }
                        else if (admin.adminFunctions == 5) System.out.println("Thoat + bam 0");
                        break;
                    }
                case 2:
                        Guest guest = new Guest();
                        guest.Menu();
                        guest.guestFunctions = sc.nextInt();
                        if (guest.guestFunctions == 1) guest.timKiem();
                        else if (guest.guestFunctions == 2) guest.XemDanhSach();
            }
        }
    }
}