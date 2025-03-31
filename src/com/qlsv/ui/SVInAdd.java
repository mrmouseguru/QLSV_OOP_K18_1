package com.qlsv.ui;

import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

import com.qlsv.entity.SinhVien;
import com.qlsv.entity.SinhVienKT;
import com.qlsv.entity.SinhVienPM;

public class SVInAdd {

	private Scanner in;
	private PrintWriter out;

	public SVInAdd() {
	}

	public SVInAdd(Scanner in, PrintWriter out) {
		this.in = in;
		this.out = out;
	}

	public SinhVien input() {
		// nhập vào thông tin chung
		int maSV;
		SinhVien sv = null;
		String hoTen;
		String nganh;
		Date ngaySinhJava;
		String ngaySinh;
		out.print("[MÃ SINH VIÊN]:");
		out.flush();
		maSV = in.nextInt();
		in.nextLine();
		out.print("[HO TEN SV]:");
		out.flush();

		hoTen = in.nextLine();
		out.print("[NGAY SINH, dd/MM/yyyy]:");// 20/02/2000
		out.flush();

		ngaySinh = in.nextLine();
		// chuyen ngay kieu chuoi
		// thanh ngay kieu Java
		out.print("[NGANH HOC \"KT\" / \"PM\"]:");
		out.flush();
		nganh = in.nextLine();
		if ("PM".equalsIgnoreCase(nganh)) {
			sv = inputSVPM(maSV, hoTen, null, nganh);
		}

		if ("KT".equalsIgnoreCase(nganh)) {
			sv = inputSVKT(maSV, hoTen, null, nganh);
		}

		return sv;
	}

	private SinhVienPM inputSVPM(int maSV, String hoTen, Date ngaySinh, String nganh) {
		double diemJava, diemCss, diemHtml;
		SinhVienPM sinhVienPM = null;
		// nhập vào htong thin sinh viên phần mềm
		out.print("[ĐIỂM JAVA]:");
		out.flush();
		diemJava = in.nextDouble();
		out.print("[ĐIỂM CSS]:");
		out.flush();
		diemCss = in.nextDouble();
		out.print("[ĐIỂM HTML]:");
		out.flush();
		diemHtml = in.nextDouble();

		sinhVienPM = new SinhVienPM(maSV, hoTen, nganh, ngaySinh, diemJava, diemCss, diemHtml);

		return sinhVienPM;
	}

	private SinhVienKT inputSVKT(int maSV, String hoTen, Date ngaySinh, String nganh) {
		SinhVienKT svKT = null;
		double diemSales;
		double diemMarketing;
		// nhập vào thông tin sinh viên kinh tế
		out.print("[ĐIỂM Marketting]:");
		out.flush();
		diemMarketing = in.nextDouble();

		out.print("[ĐIỂM Sales]:");
		out.flush();
		diemSales = in.nextDouble();

		// khởi tạo đối utojwng
		svKT = new SinhVienKT(maSV, hoTen, nganh, ngaySinh, diemMarketing, diemSales);

		return svKT;
	}

}
