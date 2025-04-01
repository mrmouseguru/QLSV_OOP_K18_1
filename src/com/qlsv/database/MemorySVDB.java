package com.qlsv.database;

import java.util.ArrayList;

import com.qlsv.entity.SinhVien;
import com.qlsv.entity.SinhVienKT;
import com.qlsv.entity.SinhVienPM;

public class MemorySVDB {
	
	//static field
	private static ArrayList<SinhVien> svDB;
	
	//static block code
	//chạy trước tiên một lần duy nhất
	static {
		svDB = new ArrayList<SinhVien>();
		//tạo sẵn dữ liệu cho CSDL
		SinhVienPM svPm1 =  new SinhVienPM(111, "Le van teo", "PM", 
				null, 5, 5,5);
		SinhVienPM svPm2 =  new SinhVienPM(222, "Le van Mẹo", "PM", 
				null, 9, 9,9);
		SinhVienKT svKt1 =  new SinhVienKT(333, "Le Thị Sửu","KT", null, 8, 8);
		SinhVienKT svKt2 =  new SinhVienKT(444, "Le Thị Tý","KT", null, 1, 1);
		
		svDB.add(svPm1);
		svDB.add(svPm2);
		svDB.add(svKt1);
		svDB.add(svKt2);
	}
	//static function
	public static void insert(SinhVien sv) {
		svDB.add(sv);
	}
	
	public static ArrayList<SinhVien> getDSSV(){
		return svDB;
	}

}
