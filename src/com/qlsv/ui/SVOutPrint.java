package com.qlsv.ui;

import java.io.PrintWriter;
import java.util.ArrayList;

import com.qlsv.entity.SinhVien;

public class SVOutPrint {
	private PrintWriter out;
	
	public SVOutPrint(PrintWriter out) {
		this.out = out;
	}
	
	public void showDSSV(ArrayList<SinhVien> dsSV) {
		//out.printf("%-10s %-20s", "Mã SV", "Họ tên SV");
		out.printf("%-10s %-20s %-10s %-10s %-5s %-10s\n","Mã SV",
				"Họ tên SV", "Ngành",
				"Ngày sinh", "Điểm", "Học lực");
		out.flush();
		
		for (SinhVien sinhVien : dsSV) {
			out.printf("%-10d %-20s %-10s %-10s %-5.2f %-10s\n", 
					sinhVien.getMaSV(), 
					sinhVien.getHoTen(), 
					sinhVien.getNganh(), "    ", 
					sinhVien.tinhDiem(),// đa hình
					//gửi cùng một thông điệp
					sinhVien.tinhHocLuc());
			out.flush();
		}
		
	}
	
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		SVOutPrint svOutPrint = new SVOutPrint(out);
		svOutPrint.showDSSV(null);
	} 
}
