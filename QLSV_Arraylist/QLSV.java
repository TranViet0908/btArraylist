import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLSV {
    ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
    public static Scanner sc = new Scanner(System.in);

    public void ThemSV() {
        System.out.println("Nhap ten SV: ");
        String HoTen = sc.nextLine();
        System.out.println("Nhap MSV: ");
        String MSV = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        int NamSinh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap diem trung binh: ");
        double DTB = Double.parseDouble(sc.nextLine());
        dsSV.add(new SinhVien(MSV, HoTen, NamSinh, DTB));
        System.out.println("Da them thong tin sinh vien");
    }

    public void output() {
        for (int i = 0; i < dsSV.size(); i++) {
            System.out.println();
        }
    }

    public void CheckNull() {
        if (dsSV.isEmpty()) {
            System.out.println("Danh sach sinh vien rong!");
        } else
            System.out.println("Danh sach dang chua thong tin sinh vien");
    }

    public void NumberOfSV() {
        System.out.println("So sinh vien trong danh sach: " + dsSV.size());
    }

    public void RemoveAll() {
        dsSV.removeAll(dsSV);
        System.out.println("Da lam rong danh sach!");
    }

    public void CheckMSV() {
        System.out.println("Nhap MSV can tim: ");
        String check = sc.nextLine();
        for (int i = 0; i < dsSV.size(); i++) {
            if (check.toUpperCase().equals(dsSV.get(i).getMSV().toUpperCase())) {
                System.out.println(dsSV.get(i));
                return;
            }
        }
        System.out.println("Khong ton tai sinh vien can tim");
    }

    public void XoaSV() {
        String check = new String();
        System.out.println("Nhap MSV can tim: ");
        check = sc.nextLine();
        for (int i = 0; i < dsSV.size(); i++) {
            if (check.toUpperCase().equals(dsSV.get(i).getMSV().toUpperCase())) {
                dsSV.remove(i);
                System.out.println("Da xoa thong tin sinh vien");
            }
        }
    }

    public void CheckHoTen() {
        System.out.println("Nhap Ho Ten can tim: ");
        String check = sc.nextLine();
        for (int i = 0; i < dsSV.size(); i++) {
            if (check.toUpperCase().equals(dsSV.get(i).getHoTen().toUpperCase())) {
                System.out.println(dsSV.get(i));
                return;
            }
        }
        System.out.println("Khong ton tai sinh vien can tim");
    }

    public void SapXep() {
        if (dsSV.isEmpty()) {
            System.out.println("Danh sach rong. Khong the sap xep ");
        } else {
            Collections.sort(dsSV, Comparator.comparing(SinhVien::getDTB).reversed());
            for (SinhVien sv : dsSV) {
                System.out.println(sv);
            }
        }
    }
}