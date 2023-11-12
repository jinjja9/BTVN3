import java.util.Scanner;

public class Guest {
    public int guestFunctions;
    public void Menu() {
        System.out.println("1. Tim kiem");
        System.out.println("2. Xem danh sach");
    }
    public void timKiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap muc muon tim");
        String set = sc.next();
        int check = 0;
        for(Book muc: Main.list){
            if(muc.tieuDe.equals((set))) {
                check = 1;
                System.out.println("Tieu De: " + set + " ");
                muc.output();
            }
            if(muc.tacGia.equals(set)) {
                check = 1;
                System.out.println("Tac gia: " + set + " ");
                muc.output();
            }
            if(muc.theLoai.equals(set)) {
                check = 1;
                System.out.println("The Loai: " + set + " ");
                muc.output();
            }
            if(muc.ngayXuatBan.equals(set)) {
                check = 1;
                System.out.println("Ngay Xuat Ban: " + set + " ");
                muc.output();
            }
        }
        if(check == 0) System.out.println("Khong Co Sach Hop Le");
    }

    public void XemDanhSach(){
        for(Book s: Main.list){
            s.output();
        }
    }
}