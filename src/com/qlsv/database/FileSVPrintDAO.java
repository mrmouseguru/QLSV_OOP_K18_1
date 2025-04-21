package com.qlsv.database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.qlsv.entity.SinhVien;

public class FileSVPrintDAO extends SVPrintDAO {

	@Override
	public ArrayList<SinhVien> getDSSV() {
		// TODO Auto-generated method stub
		FileInputStream fIS;
		ObjectInputStream oIS;
		SinhVien sv;
		ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
		try {
			//1. kêt nối đến file sv.db
			fIS = new FileInputStream("sv.db");
			//2. lấy dư liệu từ file sv.db
			oIS = new ObjectInputStream(fIS);
			dsSV = (ArrayList<SinhVien>)oIS.readObject();
			
			fIS.close();
			oIS.close();
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsSV;
	}

}
