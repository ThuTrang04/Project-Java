package buoi11;

import java.util.ArrayList;
import Library.Library;
public class Xuly {
    ArrayList<Employer> ds_nhanvien = new ArrayList<Employer>();
    public void NhapNhanVien(){
        System.out.println("1. Nhập FullTime");
        System.out.println("2. Nhập PartTime");
        int chon = Library.getInt("Nhap lua chon: ",1,2);
        String hoten = Library.getString("Nhap ho ten: ",true);
        String manv = Library.getString("Nhap ma nhan vien: ",true);
        int tuoi = Library.getInt("Nhap tuoi: ",18,60);
        double hesoluong = Library.getDouble("Nhap he so luong: ");
        if(chon == 1){
            double lcb = Library.getDouble("Nhap luong co ban: ");
            FullTimeEmployer nvft = new FullTimeEmployer(hoten, tuoi, manv, hesoluong, lcb);
            ds_nhanvien.add(nvft);  
        }else if(chon == 2){
            int sogiolam = Library.getInt("Nhap so gio lam: ");
            double dongia = Library.getDouble("Nhap don gia: ");
            PartTimeEmployer nvpt = new PartTimeEmployer(hoten, tuoi, manv, hesoluong, sogiolam, dongia);
            ds_nhanvien.add(nvpt);  
        }else{
            System.out.println("Lua chon khong hop le!");
        }
    }
    public void XuatThongTinNV(){
        if(ds_nhanvien.isEmpty()){
            System.out.println("Danh sach nhan vien rong!");
            return;
        }
        for(Employer nv : ds_nhanvien){
            System.out.println(nv.toString());
        }
    }
    public void XuatttNVFullTime(){
        if(ds_nhanvien.isEmpty()){
            System.out.println("Danh sach nhan vien rong!");
            return;
        }
        for(Employer nv : ds_nhanvien){
            if(nv instanceof FullTimeEmployer){
                System.out.println(nv.toString());
            }
        }
    }
    public void XuatttNVPartTime(){
        if(ds_nhanvien.isEmpty()){
            System.out.println("Danh sach nhan vien rong!");
            return;
        }
        for(Employer nv : ds_nhanvien){
            if(nv instanceof PartTimeEmployer){
                System.out.println(nv.toString());
            }
        }
    }
    public void Menu(){
        while(true){
            System.out.println("1. Nhap nhan vien");
            System.out.println("2. Xuat thong tin nhan vien");
            System.out.println("3. Xuat thong tin nhan vien full time");
            System.out.println("4. Xuat thong tin nhan vien part time");
            System.out.println("5. Thoat");
            int chon = Library.getInt("Nhap lua chon: ",1,4);
            switch(chon){
                case 1:
                    NhapNhanVien();
                    break;
                case 2:
                    XuatThongTinNV();
                    break;
                case 3:
                    XuatttNVFullTime();
                    break;
                case 4:
                    XuatttNVPartTime();
                    break;
                case 5:
                    return;
            }
        }
    }
}

