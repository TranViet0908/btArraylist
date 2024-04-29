import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLSV qlsv = new QLSV();
        while (true) {
            System.out.println("\nChuong trinh QLSV:");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Kiem tra danh sach sinh vien");
            System.out.println("3. So sinh vien trong danh sach");
            System.out.println("4. Lam rong danh sach sinh vien");
            System.out.println("5. Kiem tra sinh vien theo MSV");
            System.out.println("6. Xoa thong tin sinh vien theo MSV");
            System.out.println("7. Tim thong tin sinh vien theo ten");
            System.out.println("8. Sap xep danh sach sinh vien theo Diem Trung Binh");
            System.out.println("0. Thoat");
            System.out.print("Chon thao tac: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    qlsv.ThemSV();
                    break;
                case 2:
                    qlsv.CheckNull();
                    break;
                case 3:
                    qlsv.NumberOfSV();
                    break;
                case 4:
                    qlsv.RemoveAll();
                    break;
                case 5:
                    qlsv.CheckMSV();
                    break;
                case 6:
                    qlsv.XoaSV();
                    break;
                case 7:
                    qlsv.CheckHoTen();
                    break;
                case 8:
                    qlsv.SapXep();
                    qlsv.output();
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh");
                    return;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai");
            }
        }
    }
}
