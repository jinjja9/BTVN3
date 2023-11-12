import java.util.Scanner;

public class Admin {
    public int adminFunctions;

    public void Menu() {
        System.out.println("1. Them sach moi");
        System.out.println("2. Xoa sach");
        System.out.println("3. Sua sach");
        System.out.println("4. Cac chuc nang cua khach đe test");
        System.out.println("5. Thoat tai khoan admin");
    }

    public void themSach() {
        System.out.println("Nhap ten sach ban muon them:");
        Scanner sc = new Scanner(System.in);
        Book set = new Book();
        set.tieuDe = sc.next();
        set.tacGia = sc.next();
        set.theLoai = sc.next();
        set.ngayXuatBan = sc.next();
        Main.list.addElement(set);
    }

    public void xoaSach() {
        System.out.println("Nhap vi tri sach ban muon xoa:");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        Main.list.removeElementAt(index);
    }

    public void suaSach() {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        System.out.println("Nhap phan sach ban muon sua:");
        int part = sc.nextInt();
        System.out.println("Nhap noi dung ban muon sua ");
        String content = sc.nextLine();

        if (content.equals("tieuDe")) {
            Main.list.get(part).tieuDe = content;
        } else if (content.equals("tacGia")) {
            Main.list.get(part).tacGia = content;
        } else if (content.equals("theLoai")) {
            Main.list.get(part).theLoai = content;
        } else if (content.equals("ngayXuatBan")) {
            Main.list.get(part).ngayXuatBan = content;
        }
    }
}