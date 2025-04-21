package com.qlsv.control;

import java.util.ArrayList;

import com.qlsv.database.MemorySVPrintDAO;
import com.qlsv.database.SVPrintDAO;
import com.qlsv.entity.SinhVien;
import com.qlsv.ui.SVOutPrint;

public class SVControlPrint {
	
	//private MemorySVPrintDAO svPrintDAO;
	private SVPrintDAO svPrintDAO;
	private SVOutPrint svOutPrint;
	
	public SVControlPrint(SVPrintDAO svPrintDAO, SVOutPrint svOutPrint) {
		this.svPrintDAO = svPrintDAO;
		this.svOutPrint = svOutPrint;
	}
	
	public void printAllSV() {
		ArrayList<SinhVien> dsSV;
		//1. gửi thông điệp cho đối tượng SVPrintDAO
		//kết nối DB và lấy danh sách từ CSDL
		dsSV = svPrintDAO.getDSSV();
		
		//gửi thông điệp đến đối utojwng SVOutPrint
		//để in danh sách sinh viên 
		svOutPrint.showDSSV(dsSV);
	}
	
	

}
